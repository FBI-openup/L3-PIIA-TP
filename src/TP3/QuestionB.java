package TP3;

public class QuestionB {
    /*Partie B. Questions :
            1) Le type de Application
    Application est une classe abstraite de JavaFX servant de point d'entrée principal pour les applications JavaFX. Elle est utilisée pour définir le cycle de vie de l'application et pour démarrer l'application. Pour utiliser Application, vous devez étendre cette classe et redéfinir la méthode start(Stage primaryStage).

            2) Le type de Application.launch()
Application.launch() est une méthode statique de la classe Application. Elle sert à lancer l'application JavaFX. Elle initialise l'environnement, appelle la méthode start() sur l'instance de l'application, et attend que l'application se termine. Lorsque vous exécutez ce code, le framework JavaFX démarre, crée une instance de votre classe Application et appelle la méthode start() sur cette instance.

            3) Méthode pour construire et afficher une fenêtre
    Pour construire et afficher une fenêtre dans une application JavaFX, vous devez redéfinir la méthode start(Stage primaryStage) de la classe Application. Dans cette méthode, vous configurez et affichez le Stage principal (la fenêtre de l'application).

            4) Utilisation de primaryStage.show()
    L'instruction primaryStage.show() rend le Stage (la fenêtre de l'application) visible. Quand vous exécutez cette instruction, la fenêtre configurée dans votre méthode start() s'affiche à l'écran.

5) Ajout d'un Label et d'une Scene
    En ajoutant les instructions pour créer un Label et une Scene, puis en définissant cette scène comme la scène du primaryStage, vous configurez le contenu à afficher dans la fenêtre de l'application. Lorsque vous exécutez ces instructions, vous verrez une fenêtre avec le texte "Bonjour!!" affiché.

            6) Objets correspondant à la fenêtre, au panneau, et à un widget
    Fenêtre : L'objet Stage (primaryStage dans l'exemple) correspond à la fenêtre de l'application.
    Panneau : L'objet Scene peut être considéré comme le panneau principal de l'application où les éléments graphiques sont ajoutés.
            Widget : L'objet Label (dans l'exemple donné) est un widget, un composant de l'interface utilisateur affichant du texte.
*/
}
