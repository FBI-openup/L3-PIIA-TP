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

// Cette classe �tend Application pour cr�er une application graphique de dessin.
public class Paint1 extends Application {
	Canvas drawArea; // La zone de dessin.
	Scene scene; // La sc�ne qui contiendra la zone de dessin.
	GraphicsContext gc; // Le contexte graphique pour le dessin.
	double startX, startY; // Les coordonn�es de d�part pour le dessin.
	boolean drawing = false; // Un indicateur pour savoir si on est en train de dessiner.
	ArrayList<Line> lines = new ArrayList<>(); // Une liste pour stocker les traits dessin�s.

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("drawing");

		drawArea = new Canvas(600, 600); // Cr�e une nouvelle zone de dessin.
		gc = drawArea.getGraphicsContext2D(); // Obtient le contexte graphique de la zone de dessin.
		gc.setFill(Color.WHITE); // D�finit la couleur de remplissage.
		gc.fillRect(0, 0, drawArea.getWidth(), drawArea.getHeight()); // Remplit la zone de dessin avec la couleur de remplissage.

		BorderPane pane = new BorderPane(); // Cr�e un panneau pour organiser les �l�ments de l'interface.
		pane.setCenter(drawArea); // Ajoute la zone de dessin au centre du panneau.
		scene = new Scene(pane, 600, 600); // Cr�e une sc�ne avec le panneau.

		// D�finit les gestionnaires pour les �v�nements de la souris.
		drawArea.setOnMousePressed(this::handleMousePressed);
		drawArea.setOnMouseDragged(this::handleMouseDragged);
		drawArea.setOnMouseReleased(this::handleMouseReleased);

		primaryStage.setScene(scene); // Place la sc�ne sur la sc�ne principale.
		primaryStage.show(); // Montre la fen�tre.
	}

	public static void main(String[] args) {
		Application.launch(args); // Lance l'application.
	}

	// G�re l'�v�nement de pression sur la souris.
	void handleMousePressed(MouseEvent e) {
		startX = e.getX(); // Enregistre la position de d�part en X.
		startY = e.getY(); // Enregistre la position de d�part en Y.
		drawing = true; // Commence � dessiner.
	}

	// G�re l'�v�nement de d�placement de la souris avec le bouton press�.
	void handleMouseDragged(MouseEvent e) {
		if (drawing) {
			draw(); // Redessine la zone de dessin.
			gc.setStroke(Color.GREEN); // D�finit la couleur du trait temporaire.
			gc.strokeLine(startX, startY, e.getX(), e.getY()); // Dessine le trait temporaire.
		}
	}

	// G�re l'�v�nement de rel�chement de la souris.
	void handleMouseReleased(MouseEvent e) {
		if (drawing) {
			Line nouveauLine = new Line(startX, startY, e.getX(), e.getY()); // Cr�e un nouveau trait.
			lines.add(nouveauLine); // Ajoute le trait � la liste.
			drawing = false; // Arr�te de dessiner.
			draw(); // Redessine la zone de dessin.
		}
	}

	// Redessine tous les traits stock�s sur la zone de dessin.
	void draw() {
		gc.clearRect(0, 0, drawArea.getWidth(), drawArea.getHeight()); // Efface la zone de dessin.
		gc.setStroke(Color.BLUE); // D�finit la couleur des traits.
		for (Line line : lines) {
			line.dessine(gc); // Dessine chaque trait stock�.
		}
	}
}
