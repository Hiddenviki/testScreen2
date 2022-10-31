module com.example.testscreen2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jetbrains.annotations;


    opens com.example.testscreen2 to javafx.fxml;
    exports com.example.testscreen2;
}