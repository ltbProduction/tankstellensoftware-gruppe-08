package userInterface;

import java.io.IOException;
import java.text.ParseException;

import javafx.application.Application;
//import javafx.event.EventHandler;
//import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import utilities.FileTransfer;

/**
 * @author Lukas Blunck, Robin Birkhofer, Linus Brugger
 *
 */

public class StartProgram extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void init() throws ParseException, IOException {
		FileTransfer.start();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Parent root = FXMLLoader.load(getClass().getResource("UserInterface.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("Tankstellensoftware");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	@Override
	public void stop() {
		FileTransfer.writetextfiles();
	}
	
}
