module edu.utsa.cs3443.demo1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.utsa.cs3443.demo1 to javafx.fxml;
    exports edu.utsa.cs3443.demo1;
}