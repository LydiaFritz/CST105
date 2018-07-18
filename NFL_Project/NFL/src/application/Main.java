package application;
	
import java.util.ArrayList;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	
	private BorderPane root;
	private MenuWindow menuWindow;
	private SelectWindow selectWindow;
	
	private NFLPlayer_Manager players = new NFLPlayer_Manager();
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			root = new BorderPane();
			menuWindow = new MenuWindow();
			selectWindow = new SelectWindow();
			this.setPositions();
			Scene scene = new Scene(menuWindow, 600, 400);
			
			
			//set action for the buttons
			Button btn_viewAllPlayers = menuWindow.getBtn_viewAll();
			btn_viewAllPlayers.setOnAction((ActionEvent e)->{
				System.out.println("View all players");
				System.out.println(players);
				Scene scene2 = new Scene(selectWindow, 600, 400);
				primaryStage.setScene(scene2);
			});
			
			Button btn_viewRoster = menuWindow.getBtn_viewRoster();
			btn_viewRoster.setOnAction((ActionEvent e)->{
				System.out.println("View roster");
			});
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Draft Wizard");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void setPositions(){
		//get the players
		NFLPlayer[] arrPlayers = this.players.getPlayers();
		ArrayList<String> positions = new ArrayList<String>();
		for(int i = 0; i < arrPlayers.length; i++){
			if(!positions.contains(arrPlayers[i].getPosition()))
				positions.add(arrPlayers[i].getPosition());
		}
		ObservableList<Object> pos = FXCollections.observableArrayList(positions.toArray());
	
		//get the list view and add the positions
		//populate the list view
		ListView lv = this.selectWindow.getLstVw_position();
				
		lv.setItems(pos);				
				
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
}
