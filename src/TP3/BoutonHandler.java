package TP3;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BoutonHandler implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent event) {
        // Affiche un message dans la console lorsque l'événement est déclenché
        System.out.println("Le bouton a été cliqué");
    }
}

