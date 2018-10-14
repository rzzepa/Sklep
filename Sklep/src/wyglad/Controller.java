package wyglad;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

	@FXML
	private Button zaloguj, sklep, produkt;
	@FXML
	private TextField login;

	@FXML
	private TextField password;

	@FXML
	public void Loguj(ActionEvent event) throws Exception {
		if (login.getText().equals("user") && password.getText().equals("pass")) {
			Stage primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/wyglad/Login.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
		} else
			System.out.println("sad");
	}

	public void Sklep(ActionEvent event) throws Exception {
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/wyglad/Sklep.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public void Produkt(ActionEvent event) throws Exception {
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/wyglad/Produkt.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
