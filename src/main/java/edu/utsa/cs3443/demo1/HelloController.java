package edu.utsa.cs3443.demo1;
//Rahma edited this
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to the ChirpCheck App!");
    }
}
