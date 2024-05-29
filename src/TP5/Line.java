package TP5;
import javafx.scene.canvas.GraphicsContext;

// Cette classe représente un trait, c'est-à-dire une ligne définie par deux points.
public class Line {
    double startX, startY, endX, endY; // Coordonnées de départ et d'arrivée du trait

    // Constructeur pour créer un nouveau trait avec des coordonnées de départ et d'arrivée spécifiées
    public Line(double startX, double startY, double endX, double endY) {
        this.startX = startX; // Coordonnée X du point de départ
        this.startY = startY; // Coordonnée Y du point de départ
        this.endX = endX;     // Coordonnée X du point d'arrivée
        this.endY = endY;     // Coordonnée Y du point d'arrivée
    }

    // Méthode pour dessiner le trait sur le canevas à l'aide du contexte graphique fourni
    public void dessine(GraphicsContext gc) {
        gc.strokeLine(startX, startY, endX, endY); // Dessine une ligne entre les points de départ et d'arrivée
    }
}
