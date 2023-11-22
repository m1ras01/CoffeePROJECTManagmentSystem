module com.example.coffeeprojectmar {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires jasperreports;


    opens com.example.coffeeprojectmar to javafx.fxml;
    exports com.example.coffeeprojectmar;
}