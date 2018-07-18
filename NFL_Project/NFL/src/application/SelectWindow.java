// Lydia K Fritz
// CST105
// Date: Jul 16, 2018
// This is my own work.

package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

public class SelectWindow extends FlowPane {

	private VBox vBoxAvailablePlayers, vBoxSelectedPlayers;
	private Button btnShow, btnAdd;
	private ListView lstVw_position;
	
	public SelectWindow(){
		//populate the list view
		ObservableList<String> positions = FXCollections.observableArrayList(
		          "TE", "C", "RB", "K", "QB", "LB");
		
		lstVw_position = new ListView(positions);
		
		//make the labels
		Label lbl_selectPosition = new Label("Select a Position");
		
		//make the buttons
		btnShow = new Button("Show Players");
		
		//put them in the VBox
		vBoxAvailablePlayers = new VBox();
		this.vBoxAvailablePlayers.getChildren().add(lbl_selectPosition);
		this.vBoxAvailablePlayers.getChildren().add(lstVw_position);
		this.vBoxAvailablePlayers.getChildren().add(btnShow);
		
		//put the VBox in the window
		this.getChildren().add(this.vBoxAvailablePlayers);
		
		
	}

	/**
	 * @return the lstVw_position
	 */
	public ListView getLstVw_position() {
		return lstVw_position;
	}

	/**
	 * @param lstVw_position the lstVw_position to set
	 */
	public void setLstVw_position(ListView lstVw_position) {
		this.lstVw_position = lstVw_position;
	}
}
