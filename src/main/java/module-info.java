module com.hotelalura {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.hotelalura to javafx.fxml;
    exports com.hotelalura;
}