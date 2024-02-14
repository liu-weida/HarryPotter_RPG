package Graphic;

import Enemy.Enemy;
import Enemy.Boss;
import Game.Game;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import javafx.event.EventHandler;

import java.io.InputStream;

public class Combat1Potion extends Application{

    private ImageView imageView;
    private Image Combat1Potion1;
    private Image Combat1Potion2;
    private Image Combat1Potion3;
    private Image Combat1Potion4;
    private Image Combat1Potion5;
    private Image Combat1Potion6;
    private Image Combat1Potion7;
    private Image Combat1Potion8;
    private Image Combat1Potion9;
    private Image Combat1Potion10;
    private Image Combat1Potion11;
    private Image Combat1Potion12;
    private Image Combat1Potion13;
    private Image Combat1Potion14;

    private Image BOSS;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Harry Potter at home V1.0");

        //Game.combat(Enemy.gargoyle);


        //int n = Game.uniquePotions.size();

        int n = Game.potions.size();

        // 加载默认图像

        InputStream input1 = getClass().getResourceAsStream("/image/CombatPotion1.jpg");
        Combat1Potion1 = new Image(input1);

        InputStream input2 = getClass().getResourceAsStream("/image/CombatPotion2.jpg");
        Combat1Potion2 = new Image(input2);

        InputStream input3 = getClass().getResourceAsStream("/image/CombatPotion3.jpg");
        Combat1Potion3 = new Image(input3);

        InputStream input4 = getClass().getResourceAsStream("/image/CombatPotion4.jpg");
        Combat1Potion4 = new Image(input4);

        InputStream input5 = getClass().getResourceAsStream("/image/CombatPotion5.jpg");
        Combat1Potion5 = new Image(input5);

        InputStream input6 = getClass().getResourceAsStream("/image/CombatPotion6.jpg");
        Combat1Potion6 = new Image(input6);

        InputStream input7 = getClass().getResourceAsStream("/image/CombatPotion7.jpg");
        Combat1Potion7 = new Image(input7);

        InputStream input8 = getClass().getResourceAsStream("/image/CombatPotion8.jpg");
        Combat1Potion8 = new Image(input8);

        InputStream input9 = getClass().getResourceAsStream("/image/CombatPotion9.jpg");
        Combat1Potion9 = new Image(input9);

        InputStream input10 = getClass().getResourceAsStream("/image/CombatPotion10.jpg");
        Combat1Potion10 = new Image(input10);

        InputStream input11 = getClass().getResourceAsStream("/image/CombatPotion11.jpg");
        Combat1Potion11 = new Image(input11);

        InputStream input12 = getClass().getResourceAsStream("/image/CombatPotion12.jpg");
        Combat1Potion12 = new Image(input12);

        InputStream input13 = getClass().getResourceAsStream("/image/CombatPotion13.jpg");
        Combat1Potion13 = new Image(input13);

        InputStream input14 = getClass().getResourceAsStream("/image/CombatPotion14.jpg");
        Combat1Potion14 = new Image(input14);


        InputStream input = getClass().getResourceAsStream("/image/Boss1.png");
        BOSS = new Image(input);
        ImageView imageView6 = new ImageView(BOSS);
        // 调整 imageView6 的位置
        imageView6.setTranslateX(320);
        imageView6.setTranslateY(-40);
        imageView6.setFitWidth(200);
        imageView6.setFitHeight(300);


        // 创建 Button 控件
        Button buttonCreate1 = new Button("");
        buttonCreate1.setPrefSize(215, 60);
        buttonCreate1.setTranslateY(-86);
        buttonCreate1.setTranslateX(-10);
        buttonCreate1.setOpacity(0);

        Button buttonCreate2 = new Button("");
        buttonCreate2.setPrefSize(215, 60);
        buttonCreate2.setTranslateY(-10);
        buttonCreate2.setTranslateX(-10);
        buttonCreate2.setOpacity(0);

        Button buttonCreate3 = new Button("");
        buttonCreate3.setPrefSize(215, 60);
        buttonCreate3.setTranslateY(66);
        buttonCreate3.setTranslateX(-10);
        buttonCreate3.setOpacity(0);

        Button buttonCreate4 = new Button("");
        buttonCreate4.setPrefSize(215, 60);
        buttonCreate4.setTranslateY(144);
        buttonCreate4.setTranslateX(-10);
        buttonCreate4.setOpacity(0);



        switch (n){
            case 0:
                NoPotion noPotion = new NoPotion();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    noPotion.start(new Stage());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // 关闭当前场景
                stage.close();
                break;
            case 1:
                imageView = new ImageView(Combat1Potion1);

                // 添加鼠标移入事件监听器
                buttonCreate1.setOnMouseEntered(event -> {
                    imageView.setImage(Combat1Potion2);
                });

                // 添加鼠标移出事件监听器
                buttonCreate1.setOnMouseExited(event -> {
                    imageView.setImage(Combat1Potion1);
                });

                break;
            case 2:
                imageView = new ImageView(Combat1Potion3);

                // 添加鼠标移入事件监听器
                buttonCreate1.setOnMouseEntered(event -> {
                    imageView.setImage(Combat1Potion4);
                });

                // 添加鼠标移出事件监听器
                buttonCreate1.setOnMouseExited(event -> {
                    imageView.setImage(Combat1Potion3);
                });

                // 添加鼠标移入事件监听器
                buttonCreate2.setOnMouseEntered(event -> {
                    imageView.setImage(Combat1Potion5);
                });

                // 添加鼠标移出事件监听器
                buttonCreate2.setOnMouseExited(event -> {
                    imageView.setImage(Combat1Potion3);
                });

                break;
            case 3:
                imageView = new ImageView(Combat1Potion6);

                // 添加鼠标移入事件监听器
                buttonCreate1.setOnMouseEntered(event -> {
                    imageView.setImage(Combat1Potion7);
                });

                // 添加鼠标移出事件监听器
                buttonCreate1.setOnMouseExited(event -> {
                    imageView.setImage(Combat1Potion6);
                });

                // 添加鼠标移入事件监听器
                buttonCreate2.setOnMouseEntered(event -> {
                    imageView.setImage(Combat1Potion8);
                });

                // 添加鼠标移出事件监听器
                buttonCreate2.setOnMouseExited(event -> {
                    imageView.setImage(Combat1Potion6);
                });

                // 添加鼠标移入事件监听器
                buttonCreate3.setOnMouseEntered(event -> {
                    imageView.setImage(Combat1Potion9);
                });

                // 添加鼠标移出事件监听器
                buttonCreate3.setOnMouseExited(event -> {
                    imageView.setImage(Combat1Potion6);
                });

                break;
            case 4:

            default:
                imageView = new ImageView(Combat1Potion10);

                // 添加鼠标移入事件监听器
                buttonCreate1.setOnMouseEntered(event -> {
                    imageView.setImage(Combat1Potion11);
                });

                // 添加鼠标移出事件监听器
                buttonCreate1.setOnMouseExited(event -> {
                    imageView.setImage(Combat1Potion10);
                });

                // 添加鼠标移入事件监听器
                buttonCreate2.setOnMouseEntered(event -> {
                    imageView.setImage(Combat1Potion12);
                });

                // 添加鼠标移出事件监听器
                buttonCreate2.setOnMouseExited(event -> {
                    imageView.setImage(Combat1Potion10);
                });

                // 添加鼠标移入事件监听器
                buttonCreate3.setOnMouseEntered(event -> {
                    imageView.setImage(Combat1Potion13);
                });

                // 添加鼠标移出事件监听器
                buttonCreate3.setOnMouseExited(event -> {
                    imageView.setImage(Combat1Potion10);
                });

                // 添加鼠标移入事件监听器
                buttonCreate4.setOnMouseEntered(event -> {
                    imageView.setImage(Combat1Potion14);
                });

                // 添加鼠标移出事件监听器
                buttonCreate4.setOnMouseExited(event -> {
                    imageView.setImage(Combat1Potion10);
                });
                break;
        }

        TextField textField0 = new TextField();
        textField0.setText(String.valueOf(Game.property[1]));
        textField0.setMaxWidth(120);
        textField0.setStyle(" -fx-translate-x:-480; -fx-translate-y:-130;-fx-font-size: 25px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");

        TextField textField1 = new TextField();
        textField1.setText("1000");
        textField1.setMaxWidth(120);
        textField1.setStyle(" -fx-translate-x: -480; -fx-translate-y:-10;-fx-font-size: 25px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color:transparent; -fx-border-color: transparent;");

        TextField textField2 = new TextField();
        textField2.setText(String.valueOf(Boss.troll.getHP()));
        textField2.setMaxWidth(120);
        textField2.setStyle(" -fx-translate-x: 515; -fx-translate-y:-130;-fx-font-size: 25px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");

        TextField textField3 = new TextField();
        textField3.setText("250");
        textField3.setMaxWidth(120);
        textField3.setStyle(" -fx-translate-x: 515; -fx-translate-y:-10;-fx-font-size: 25px; -fx-text-fill: #e7c254; -fx-font-family:Courier New;-fx-background-color: transparent; -fx-border-color: transparent;");


<<<<<<< HEAD
        StackPane stackPane = new StackPane(imageView, imageView6,buttonCreate1, buttonCreate2, buttonCreate3, buttonCreate4,textField0,textField1,textField2,textField3);
=======
        StackPane stackPane = new StackPane(imageView, buttonCreate1, buttonCreate2, buttonCreate3, buttonCreate4,textField0,textField1,textField2,textField3);
>>>>>>> c31add4f7965e31170118d219d5ddf7199c9d4cc


        buttonCreate1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Game.property[1] = Game.property[1]+20;
                Combat1Potion1 combatPotion1 = new Combat1Potion1();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    combatPotion1.start(new Stage());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // 关闭当前场景
                stage.close();
            }
        });

        buttonCreate2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Game.property[1] = Game.property[1]+40;
                Combat1Potion1 combatPotion1 = new Combat1Potion1();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    combatPotion1.start(new Stage());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // 关闭当前场景
                stage.close();
            }
        });

        buttonCreate3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Game.property[1] = Game.property[1]+60;
                Combat1Potion1 combatPotion1 = new Combat1Potion1();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    combatPotion1.start(new Stage());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // 关闭当前场景
                stage.close();
            }
        });

        buttonCreate4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Game.property[1] = Game.property[1]+100;
                Combat1Potion1 combatPotion1 = new Combat1Potion1();
                // 调用 ArrivalHouse3 实例的 start() 方法显示新的场景
                try {
                    combatPotion1.start(new Stage());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // 关闭当前场景
                stage.close();
            }
        });


        // 创建场景并显示
        Scene scene = new Scene(stackPane, 1120, 700);
        stage.setScene(scene);
        stage.show();
    }




}
