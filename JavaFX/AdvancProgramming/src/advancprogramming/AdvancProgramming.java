/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancprogramming;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Asano
 */
public class AdvancProgramming extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        System.out.println("dont fuck");
        
        
        System.out.println(" f**************");
        
        System.out.println("aojfao[fj");
        System.out.println("aojfaogaga[fj");
        System.out.println("aojfaoadfatdf[fj");
        System.out.println("aojfasdfsdfso[fj");
        System.out.println("aojfasdfo[fj");
        System.out.println("aojsdfsdfsfao[fj");
        System.out.println("aojsdfsdfsfao[fj");
        System.out.println("aojsdfsdfsfao[fj");
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        launch(args);
    }
    
}
