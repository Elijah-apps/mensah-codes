package mensahcodes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class JavaFXIDE extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Mensah Codes IDE");

        // Create a WebView to display the HTML content
        WebView webView = new WebView();
        WebEngine webEngine = webView.getEngine();
        
        // Load the local HTML file
        webEngine.load(getClass().getResource("/code.html").toExternalForm());

        // Create the main layout
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(webView);

        // Set up the scene and stage
        Scene scene = new Scene(borderPane, 1200, 800);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
