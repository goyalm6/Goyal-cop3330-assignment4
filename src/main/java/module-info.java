/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Mayank Goyal
 */

module ucf.assignments {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.junit.jupiter.api;


    opens ucf.assignments to javafx.fxml;
    exports ucf.assignments;
    exports  ToDoList;
    opens ToDoList to javafx.fxml;
}

/*
module com.example.goyalcop3330assignment4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ucf.assignments to javafx.fxml;
    exports ucf.assignments;


    module com.example.demolist {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.example.demolist to javafx.fxml;
    exports com.example.demolist;
    exports  ToDoList;
    opens ToDoList to javafx.fxml;
}
}
*/