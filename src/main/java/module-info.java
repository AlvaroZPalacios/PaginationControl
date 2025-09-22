module com.example.paginationcontrol {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.paginationcontrol to javafx.fxml;
    exports com.example.paginationcontrol;
}