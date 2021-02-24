/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extract.and.validate.input;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Obituary
 */
public class Main extends Application {

    Stage window; 
    Scene scene; 
    Button button; 
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        window = primaryStage; 
        window.setTitle("the new boston");
        
        // Form 
        TextField nameInput = new TextField();
        button = new Button("Click me");
        button.setOnAction(e -> isInt(nameInput, nameInput.getText())); // System.out.println(nameInput.getText())
        
        //Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(nameInput, button);
        
        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }
    // raw input is the TextField elm, and value typed in: message 
    // the input can be highlighted in red: exemple of the use to have this parameter too
    private boolean isInt(TextField input, String message){
        try{
            int age = Integer.parseInt(input.getText()); // = message
            System.out.println("User is: " + age);
            return true;
        }
        // we know it will throw a number format exception because this is what we are checking 
        catch(NumberFormatException e){
            System.out.println("Error: " + message + " is not a number" );
            return false;
        }
    }
    
}
