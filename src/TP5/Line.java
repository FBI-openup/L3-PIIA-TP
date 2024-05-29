package TP5;
import javafx.scene.canvas.GraphicsContext;

// Cette classe repr�sente un trait, c'est-�-dire une ligne d�finie par deux points.
public class Line {
    double startX, startY, endX, endY; // Coordonn�es de d�part et d'arriv�e du trait

    // Constructeur pour cr�er un nouveau trait avec des coordonn�es de d�part et d'arriv�e sp�cifi�es
    public Line(double startX, double startY, double endX, double endY) {
        this.startX = startX; // Coordonn�e X du point de d�part
        this.startY = startY; // Coordonn�e Y du point de d�part
        this.endX = endX;     // Coordonn�e X du point d'arriv�e
        this.endY = endY;     // Coordonn�e Y du point d'arriv�e
    }

    // M�thode pour dessiner le trait sur le canevas � l'aide du contexte graphique fourni
    public void dessine(GraphicsContext gc) {
        gc.strokeLine(startX, startY, endX, endY); // Dessine une ligne entre les points de d�part et d'arriv�e
    }
}
