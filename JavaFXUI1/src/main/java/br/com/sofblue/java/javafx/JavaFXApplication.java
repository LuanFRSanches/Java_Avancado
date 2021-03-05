package br.com.sofblue.java.javafx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
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

		grid.add(new Label("Sexo"), 0, 2);
		RadioButton btnMasc = new RadioButton("Masculino");
		btnMasc.setSelected(true);
		RadioButton btnFem = new RadioButton("Feminino");

		ToggleGroup group = new ToggleGroup();
		btnMasc.setToggleGroup(group);
		btnFem.setToggleGroup(group);
		HBox radioBox = new HBox(5.0, btnMasc, btnFem);
		grid.add(radioBox, 1, 2);

		grid.add(new Label("Estado:"), 0, 1);
		ChoiceBox<String> chxEstado = new ChoiceBox<String>();
		ObservableList<String> estados = FXCollections.observableArrayList("Paraná", "São Paulo", "Mato Grosso do Sul",
				"Amazonas");
		chxEstado.getSelectionModel().select(0);
		chxEstado.setItems(estados);
		grid.add(chxEstado, 1, 3);

		root.setCenter(grid);

		HBox buttonBar = new HBox(5.0);
		buttonBar.setAlignment(Pos.CENTER_RIGHT);
		Button btnGravar = new Button("Gravar");
		Button btnCancelar = new Button("Cancelar");
		buttonBar.getChildren().addAll(btnGravar, btnCancelar);

		root.setBottom(buttonBar);

		Scene scene = new Scene(root, 300, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
