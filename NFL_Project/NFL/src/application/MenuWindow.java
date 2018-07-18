// Lydia K Fritz
// CST105
// Date: Jul 16, 2018
// This is my own work.

package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class MenuWindow extends javafx.scene.layout.BorderPane {
	
	private VBox vbox_buttons;
	private Button btn_viewAll;
	private Button btn_viewRoster;
	
	public MenuWindow(){
		ImageView imgView = new ImageView(new Image("draftWizard.png"));
		this.setLeft(imgView);
		imgView.setFitHeight(250);
		imgView.setPreserveRatio(true);
		MenuWindow.setAlignment(imgView, Pos.CENTER_LEFT);
		
		Text titleText = new Text(20, 20, "Draft Wizard");
		this.setPadding(new Insets(20, 20, 20, 20));		
		MenuWindow.setAlignment(titleText, Pos.BOTTOM_RIGHT);
		titleText.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 50));
		titleText.setFill(Color.RED);
		titleText.setStroke(Color.BLACK);
		this.setTop(titleText);
		setButtons();
	}
	
	private void setButtons(){
		this.btn_viewAll = new Button("View All Players");
		this.btn_viewRoster = new Button("View Roster");
		this.vbox_buttons = new VBox();
		this.vbox_buttons.getChildren().add(btn_viewAll);
		this.vbox_buttons.getChildren().add(btn_viewRoster);
		this.vbox_buttons.setSpacing(20);
		this.setCenter(vbox_buttons);
		this.vbox_buttons.setAlignment(Pos.CENTER);
		this.btn_viewAll.setPrefWidth(200);
		this.btn_viewRoster.setPrefWidth(200);
		this.btn_viewAll.setFont(Font.font(15));
		this.btn_viewRoster.setFont(Font.font(15));
		this.btn_viewAll.setStyle("-fx-border-color: blue; -fx-border-width: 5px;");
		this.btn_viewRoster.setStyle("-fx-border-color: blue; -fx-border-width: 5px;");
		
	}

	/**
	 * @return the btn_viewAll
	 */
	public Button getBtn_viewAll() {
		return btn_viewAll;
	}

	/**
	 * @return the btn_viewRoster
	 */
	public Button getBtn_viewRoster() {
		return btn_viewRoster;
	}

}
