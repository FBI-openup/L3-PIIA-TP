package TP4;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class GridLayoutExemple1 extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("un test");
		
		Label label1 = new Label("label1");
		Label label2 = new Label("label2");
		Label label3 = new Label("label3");
		Label label4 = new Label("label4");
		
		GridPane grid = new GridPane();
		grid.setPrefSize(500, 300);

		grid.add(label1, 0, 0);
		grid.add(label2, 1, 0);
		grid.add(label3, 0, 1, 2, 1);
		grid.add(label4, 2, 1);
		//GridPane.setHalignment(label4, HPos.RIGHT);
		//grid.setValignment(label1, VPos.BOTTOM);

		grid.setVgap(20);
		grid.setHgap(20);

		Insets insets = new Insets(10, 10, 10, 10);
		grid.setPadding(insets);
		GridPane.setMargin(label1, insets);
		GridPane.setMargin(label2, insets);
		GridPane.setMargin(label3, insets);
		GridPane.setMargin(label4, insets);

		grid.setGridLinesVisible(true);


		Scene scene = new Scene(grid);
		primaryStage.setScene(scene);

		
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
	
}
