package TP4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import java.time.Instant;

public class TestMenu extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("un test avec menu");
		
		MenuBar menuBar = new MenuBar();
		Menu menu1 = new Menu("Menu 1");
		Menu menu2 = new Menu("Menu 2");
		
		Menu subMenu = new Menu("Sub menu");
		
		MenuItem menuItem1 = new MenuItem("Item 1");
		MenuItem menuItem2 = new MenuItem("Item 2");
		
		menuItem1.setOnAction(new EventHandler<ActionEvent>() {
			@Override 
			public void handle(ActionEvent e) {
				
				System.out.println("Menu Item1: "+Instant.now().toEpochMilli());
			}
		});
		
		menuItem2.setOnAction(new EventHandler<ActionEvent>() {
			@Override 
			public void handle(ActionEvent e) {
				
				System.out.println("Menu Item2: "+Instant.now().toEpochMilli());
			}
		});
		
		MenuItem subMenuItem1 = new MenuItem("Sub Menu Item 1");
		MenuItem subMenuItem2 = new MenuItem("Sub Menu Item 2");
		
		subMenu.getItems().add(subMenuItem1);
		subMenu.getItems().add(subMenuItem2);
		
		menu1.getItems().add(menuItem1);
		menu1.getItems().add(menuItem2);
		menu1.getItems().add(subMenu);
		
		menuBar.getMenus().add(menu1);
		menuBar.getMenus().add(menu2);
		
		Label label1 = new Label("Bonjour!!");
		TextArea txtarea= new TextArea();
		VBox vbox = new VBox(menuBar,label1,txtarea);
		
		Scene scene = new Scene(vbox);
		primaryStage.setScene(scene);

		
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
	
}
