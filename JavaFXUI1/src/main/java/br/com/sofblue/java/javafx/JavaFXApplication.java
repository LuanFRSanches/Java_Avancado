package br.com.sofblue.java.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class JavaFXApplication extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Formulário");

		primaryStage.show();

		BorderPane root = new BorderPane();
		root.setPadding(new Insets(7.0));

		GridPane grid = new GridPane();
		grid.setHgap(5.0);
		grid.setVgap(7.0);

		grid.add(new Label("Nome:"), 0, 0);
		root.setCenter(grid);
		TextField txtNome = new TextField();
		GridPane.setHgrow(txtNome, Priority.ALWAYS);
		grid.add(txtNome, 1, 0);

		grid.add(new Label("Email:"), 0, 1);
		TextField txtEmail = new TextField();
		GridPane.setHgrow(txtEmail, Priority.ALWAYS);
		grid.add(txtEmail, 1, 1);
		
		grid.add(new Label("Sexo"), 0,2);
	RadioButton 

		Scene scene = new Scene(root, 300, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
