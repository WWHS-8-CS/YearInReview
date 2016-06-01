import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class QueueReview extends Application implements EventHandler<ActionEvent>{
	Queue<String> s = new LinkedList<String>();
	Button add = new Button("Add To Queueueue");
	Button pop = new Button("Remov Frome Queueue");
	Button view = new Button("View Next Queueueue");
	TextArea list = new TextArea();
	TextField in =  new TextField();
	public static void main(String[] arg){
		launch(arg);
	}
	public void start(Stage stage){
		GridPane g = new GridPane();
		g.add(add, 0, 2);
		g.add(pop, 0, 3);
		g.add(view, 0, 4);
		g.add(in, 0, 1);
		g.add(list, 0, 8);
		
		add.setOnAction(this);
		pop.setOnAction(this);
		view.setOnAction(this);
		stage.setScene(new Scene(g, 400, 600));
		stage.show();
		
	}
	public void handle(ActionEvent event){
		if(event.getSource() == add){
			String nop = in.getText();
			s.add(nop);
			list.appendText(nop + " Added" + "\n");
		}
		if(event.getSource() == pop){
			String nop = in.getText();
			s.remove();
			list.appendText("Object removed" + "\n");
		}
		if(event.getSource() == view){
			String nop = in.getText();
			list.appendText(s.peek() + "\n");
		}
	}
	
}
