import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.*;

public class OldStackReview extends Application {
  
  public static void main(String[] args) {
  //push, pop, peek 
  Stack<String> toDoList = new Stack<String>();
  launch(args); 
 
  @Override
    public void start(Stage primaryStage) {
      primaryStage.setTitle("Hello World!");
      Button push = new Button();
      Button peek = new Button();
      Button pop = new Button();
      push.setText("ADD");
      peek.setText("SEE NEXT");
      pop.setText("REMOVE");
      
      push.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
          System.out.println("Hello World!");
        }
      });
      peek.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
        toDolist.peek();  
      }
      });
      pop.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
          toDolist.pop();  
        }
      });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
  }
} 
