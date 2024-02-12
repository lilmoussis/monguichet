module com.dogbe.kevin.monguichet {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.dogbe.kevin.monguichet to javafx.fxml;
    exports com.dogbe.kevin.monguichet;
}