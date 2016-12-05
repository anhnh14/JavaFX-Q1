/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author 985567
 */
public class Question1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        //Name
        Label lbName = new Label();
        lbName.setText("Name");
        TextField tfName = new TextField();
        grid.add(lbName, 0, 0);
        grid.add(tfName, 0, 1);
        
        //Street
        Label lbStreet = new Label();
        lbStreet.setText("Street");
        TextField tfStreet = new TextField();
        grid.add(lbStreet, 1, 0);
        grid.add(tfStreet, 1, 1);
        
        //City
        Label lbCity = new Label();
        lbCity.setText("City");
        TextField tfCity = new TextField();
        grid.add(lbCity, 2, 0);
        grid.add(tfCity, 2, 1);
        
        //State
        Label lbState = new Label();
        lbState.setText("City");
        TextField tfState = new TextField();
        //grid.addRow(2, lbState);
        
        grid.add(lbState, 0, 2);
        grid.add(tfState, 0, 3);
        GridPane.setMargin(lbState, new Insets(0, -65, 0, 65));
        GridPane.setMargin(tfState, new Insets(0, -65, 0, 65));
        //Zip
        Label lbZip = new Label();
        lbZip.setText("Zip");
        TextField tfZip = new TextField();
        grid.add(lbZip, 1, 2);
        grid.add(tfZip, 1, 3);
        GridPane.setMargin(lbZip, new Insets(0, -65, 0, 65));
        GridPane.setMargin(tfZip, new Insets(0, -65, 0, 65));
        
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                System.out.println(tfName.getText());
                System.out.println(tfStreet.getText());
                System.out.print(tfCity.getText() + ",");
                System.out.print(tfState.getText() + " ");
                System.out.print(tfZip.getText());
            }
        });
        
        StackPane root = new StackPane();
        grid.add(btn, 1, 4);
        //root.getChildren().add(btn);
        //root.getChildren().add(lbName);
       
        root.getChildren().add(grid);
        
        Scene scene = new Scene(root, 500, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
