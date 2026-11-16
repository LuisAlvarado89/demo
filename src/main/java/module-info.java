module org.ies.tierno.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.ies.tierno.demo to javafx.fxml;
    exports org.ies.tierno.demo;
}