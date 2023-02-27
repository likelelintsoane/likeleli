module com.mycompany.mavenproject41 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.mavenproject41 to javafx.fxml;
    exports com.mycompany.mavenproject41;
}
