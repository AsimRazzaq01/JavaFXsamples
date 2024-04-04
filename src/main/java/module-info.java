module com.example.module5assignment {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires javafx.graphics;
    requires java.desktop;

    opens com.example.module5assignment to javafx.fxml;
    exports com.example.module5assignment;
}