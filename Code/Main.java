/**
 * Lydia Fritz
 * CST105
 * Exercise 8: Practice with JavaFX
 */

package application;
	
import java.util.Random;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class Main extends Application {
	
	private BorderPane root;
	private GridPane grid;
	private Random rnd = new Random();
	private final int WID = 30;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			root = new BorderPane();
			Scene scene = new Scene(root);
			primaryStage.setTitle("Number Grid");
			
			//method to create the grid
			drawGrid();
			
			root.setCenter(grid);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void drawGrid(){
		//make and format the grid pane
		grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setAlignment(Pos.CENTER);
		
		//will need a label, a rectangle, and a stack pane for each cell in grid
		Label lbl;
		Rectangle rect;
		StackPane stkPane;
				
		//iterate over the rows and columns in the grid
		for(int r = 0; r < 10; r++){
			for(int c = 0; c < 10; c++){
				
				//generate random number
				int val = rnd.nextInt(100);
				String str = "" + val;
				
				//make a label and set size. init text with random num
				lbl = new Label(str);
				lbl.setAlignment(Pos.CENTER);				
				lbl.setPrefSize(WID, WID);
				
				
				//make a Rectangle
				rect = new Rectangle();
				//size and position it 
				rect.setWidth(WID);
				rect.setHeight(WID);
				rect.setX(r*WID);
				rect.setY(r*WID);
				
				//color rectangle based on the rand num
				if(val % 6 == 0)
					rect.setFill(Color.LIMEGREEN);
				else if(val % 3 == 0)
					rect.setFill(Color.YELLOW);
				else if(val % 2 == 0)
					rect.setFill(Color.AQUA);
				else
					rect.setFill(null);
				
				//set the border
				rect.setStroke(Color.BLACK);

				//make a stackpane
				stkPane = new StackPane();
				//add the rectangle and the label
				stkPane.getChildren().add(rect);
				stkPane.getChildren().add(lbl);
				
				//put stack pane in the grid
				grid.add(stkPane, c, r);
			}
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}