package TP4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Monmenu extends Application {

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Mon Test Menu");

		MenuBar menuBar = new MenuBar();

		// File Menu
		Menu fileMenu = new Menu("File");
		fileMenu.getItems().addAll(new MenuItem("New"), new MenuItem("Open"), new MenuItem("Save"), new MenuItem("Print"), new MenuItem("Exit"));

		// Edit Menu
		Menu editMenu = new Menu("Edit");
		editMenu.getItems().addAll(new MenuItem("Undo"), new MenuItem("Redo"), new MenuItem("Cut"), new MenuItem("Copy"), new MenuItem("Paste"), new MenuItem("Find"), new MenuItem("Replace"));

		// Insert Menu
		Menu insertMenu = new Menu("Insert");
		insertMenu.getItems().addAll(new MenuItem("Image"), new MenuItem("Table"), new MenuItem("Drawing"), new MenuItem("Special Characters"), new MenuItem("Footnote"), new MenuItem("Table of Contents"));

		// Format Menu
		Menu formatMenu = new Menu("Format");
		formatMenu.getItems().addAll(new MenuItem("Font"), new MenuItem("Size"), new MenuItem("Style"), new MenuItem("Page Numbers"));

		// View Menu
		Menu viewMenu = new Menu("View");
		viewMenu.getItems().addAll(new MenuItem("Zoom In"), new MenuItem("Zoom Out"));

		// Tools Menu
		Menu toolsMenu = new Menu("Tools");
		toolsMenu.getItems().addAll(new MenuItem("Spell Check"), new MenuItem("Word/Character Count"));

		menuBar.getMenus().addAll(fileMenu, editMenu, insertMenu, formatMenu, viewMenu, toolsMenu);

		VBox vBox = new VBox(menuBar);
		Scene scene = new Scene(vBox, 640, 480);

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
