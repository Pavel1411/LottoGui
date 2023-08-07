module com.example.lottogui {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires com.almasb.fxgl.all;

    opens com.example.lottogui to javafx.fxml;
    exports com.example.lottogui;
}