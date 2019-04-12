package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage palcoPrimario) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));
			Parent parent = loader.load();//carregar a MainView
			Scene cenaPrincipal = new Scene(parent);
			palcoPrimario.setScene(cenaPrincipal);
			palcoPrimario.setTitle("Sample JavaFX application");
			palcoPrimario.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
