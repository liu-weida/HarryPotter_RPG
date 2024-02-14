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

public class Chapter43 extends Application {

    private TextArea textArea;

    private TextField textField;
    private ImageView imageView;
    private Image Chapter0;
    private Stage mainStage; // 添加成员变量

    private String[] dialogues = {
            "Finally, you send him flying with a spell. In this instant, you use your newly learned spell Accio and use it to draw the Portkey around Peter Pettigrew's waist.",
            "A burst of light rose, you disappeared in place, before disappearing you took one last look at Voldemort, he looked at you with a smirk, but did not stop.",
            "After returning to the House, you first found Dean Dumbledore and reported the incident to him. But he could not guess Voldemort's intentions, so he had to remind the students and professors to strengthen the defense of the College.",
            "About to return to school.",
    };
    private int currentDialogue = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        mainStage = stage; // 初始化成员变量
        stage.setTitle("Harry Potter at home V1.0");

        // 加载默认图像
        InputStream input1 = getClass().getResourceAsStream("/image/Chapter43.jpg");
        Chapter0 = new Image(input1);


        // 创建 ImageView 控件并设置默认图像
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

        // 创建 StackPane 布局容器，并将图像和按钮添加到其中
        StackPane stackPane = new StackPane(imageView, textField);
        // 创建场景并显示
        Scene scene = new Scene(stackPane, 1120, 700);

//        // 设置自定义鼠标指针
//        InputStream cursorInput = new InputStream("C:\\Users\\DELL\\Desktop\\projet-individuel\\src\\main\\java\\Graphic\\image\\Rocks.png");
//        Image cursorImage = new Image(cursorInput);
//        scene.setCursor(new ImageCursor(cursorImage));

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
        Menu menu = new Menu();
        try {
            menu.start(mainStage);
            Game.adventurelevel++;
        } catch (Exception e) {
            e.printStackTrace();
            // 如果需要，您可以在此处添加其他异常处理逻辑
        }
    }



}
