module com.example.calcimt {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.BmiCalc to javafx.fxml;
    exports com.example.BmiCalc;
}