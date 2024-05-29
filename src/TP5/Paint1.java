package TP5;


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import java.util.ArrayList;

// Cette classe étend Application pour créer une application graphique de dessin.
public class Paint1 extends Application {
	Canvas drawArea; // La zone de dessin.
	Scene scene; // La scène qui contiendra la zone de dessin.
	GraphicsContext gc; // Le contexte graphique pour le dessin.
	double startX, startY; // Les coordonnées de départ pour le dessin.
	boolean drawing = false; // Un indicateur pour savoir si on est en train de dessiner.
	ArrayList<Line> lines = new ArrayList<>(); // Une liste pour stocker les traits dessinés.

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("drawing");

		drawArea = new Canvas(600, 600); // Crée une nouvelle zone de dessin.
		gc = drawArea.getGraphicsContext2D(); // Obtient le contexte graphique de la zone de dessin.
		gc.setFill(Color.WHITE); // Définit la couleur de remplissage.
		gc.fillRect(0, 0, drawArea.getWidth(), drawArea.getHeight()); // Remplit la zone de dessin avec la couleur de remplissage.

		BorderPane pane = new BorderPane(); // Crée un panneau pour organiser les éléments de l'interface.
		pane.setCenter(drawArea); // Ajoute la zone de dessin au centre du panneau.
		scene = new Scene(pane, 600, 600); // Crée une scène avec le panneau.

		// Définit les gestionnaires pour les événements de la souris.
		drawArea.setOnMousePressed(this::handleMousePressed);
		drawArea.setOnMouseDragged(this::handleMouseDragged);
		drawArea.setOnMouseReleased(this::handleMouseReleased);

		primaryStage.setScene(scene); // Place la scène sur la scène principale.
		primaryStage.show(); // Montre la fenêtre.
	}

	public static void main(String[] args) {
		Application.launch(args); // Lance l'application.
	}

	// Gère l'événement de pression sur la souris.
	void handleMousePressed(MouseEvent e) {
		startX = e.getX(); // Enregistre la position de départ en X.
		startY = e.getY(); // Enregistre la position de départ en Y.
		drawing = true; // Commence à dessiner.
	}

	// Gère l'événement de déplacement de la souris avec le bouton pressé.
	void handleMouseDragged(MouseEvent e) {
		if (drawing) {
			draw(); // Redessine la zone de dessin.
			gc.setStroke(Color.GREEN); // Définit la couleur du trait temporaire.
			gc.strokeLine(startX, startY, e.getX(), e.getY()); // Dessine le trait temporaire.
		}
	}

	// Gère l'événement de relâchement de la souris.
	void handleMouseReleased(MouseEvent e) {
		if (drawing) {
			Line nouveauLine = new Line(startX, startY, e.getX(), e.getY()); // Crée un nouveau trait.
			lines.add(nouveauLine); // Ajoute le trait à la liste.
			drawing = false; // Arrête de dessiner.
			draw(); // Redessine la zone de dessin.
		}
	}

	// Redessine tous les traits stockés sur la zone de dessin.
	void draw() {
		gc.clearRect(0, 0, drawArea.getWidth(), drawArea.getHeight()); // Efface la zone de dessin.
		gc.setStroke(Color.BLUE); // Définit la couleur des traits.
		for (Line line : lines) {
			line.dessine(gc); // Dessine chaque trait stocké.
		}
	}
}
