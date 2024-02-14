package Graphic;

import Game.Game;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.InputStream;

public class Chapter61 extends Application {

    private TextArea textArea;

    private TextField textField;
    private ImageView imageView;
    private Image Chapter0;
    private Stage mainStage;

    private String[] dialogues = {
            "One day, you are learning a new mantra.\nSuddenly, the alarm went off and it was the Death Eaters attacking Hogwarts.",

    };
    private int currentDialogue = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        mainStage = stage;
        stage.setTitle("Harry Potter at home V1.0");

        InputStream input1 = getClass().getResourceAsStream("/image/Chapter61.jpg");
        Chapter0 = new Image(input1);

        imageView = new ImageView(Chapter0);

        textField = new TextField();
        Font font = Font.font("Courier New", 20);
        textField.setFont(font);
        textField.setMaxWidth(1000);
        textField.setMaxHeight(50);
        textField.setTranslateY(230);
        textField.setTranslateX(0);
        textField.setEditable(false);
        textField.setText(""
    );
        textField.setStyle("-fx-background-color: transparent; -fx-text-fill: #ffffff; -fx-border-color: transparent;");

        StackPane stackPane = new StackPane(imageView, textField);
        Scene scene = new Scene(stackPane, 1120, 700);

        EventHandler<KeyEvent> keyEventEventHandler = event -> {
            if (event.getCode() == KeyCode.ENTER) {
                nextDialogue();
            }
        };

        EventHandler<MouseEvent> mouseEventEventHandler = event -> {
            nextDialogue();
        };

        scene.addEventHandler(KeyEvent.KEY_PRESSED, keyEventEventHandler);
        scene.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEventEventHandler);

        stage.setScene(scene);
        stage.show();
    }

    private void nextDialogue() {
        if (currentDialogue < dialogues.length) {
            textField.setText(dialogues[currentDialogue]);
            currentDialogue++;
        } else {
            PageTransition.smoothTransition(mainStage, mainStage.getScene().getRoot(), this::showNextScene);
        }
    }

    private void showNextScene() {
        if ("Slytherin".equals(Game.wizard.getHouse().toString())) {
            Chapter62 chapter62 = new Chapter62();
            try {
                chapter62.start(mainStage);
            } catch (Exception e) {
                e.printStackTrace();
                // 如果需要，您可以在此处添加其他异常处理逻辑
            }
        } else {
            Chapter66 chapter66 = new Chapter66();
            try {
                chapter66.start(mainStage);
            } catch (Exception e) {
                e.printStackTrace();
                // 如果需要，您可以在此处添加其他异常处理逻辑
            }
        }
    }
}

