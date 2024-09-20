module com.samu.ex4 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.samu.ex4 to javafx.fxml;
    exports com.samu.ex4;
}
