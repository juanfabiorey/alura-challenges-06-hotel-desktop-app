module com.hotelalura.hotelalura {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.hotelalura.hotelalura to javafx.fxml;
    exports com.hotelalura.hotelalura;
}