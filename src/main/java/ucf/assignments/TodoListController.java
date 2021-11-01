/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Mayank Goyal
 */

package ucf.assignments;

import ToDoList.Context;
import ToDoList.ToDoList;
import ToDoList.ToDoListItem;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import java.io.*;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.ResourceBundle;

public class TodoListController implements Initializable {
    //region UX Properties
    @FXML private Pane pntodolist;
    @FXML private TextField txtTitle;
    @FXML private TextArea txtDescription;
    @FXML private DatePicker dpDueDate;
    @FXML private ChoiceBox<String> drpStatus;
    @FXML private ChoiceBox<String> drpStatusFilter;
    @FXML private Label lblMsg;
    @FXML private Label lblCurrentList;
    @FXML private Pane pnlForm;
    @FXML private TableView<ToDoListItem> tableView;
    @FXML private TableColumn<ToDoListItem, String> titleColumn;
    @FXML private TableColumn<ToDoListItem, String>  descriptionColumn;
    @FXML private TableColumn<ToDoListItem, Date> listduedateColumn;
    @FXML private TableColumn<ToDoListItem, String>  statusColumn;
    //endregion

    private ToDoList  todoListInContext ;
    public FilteredList<ToDoListItem> filteredData;
    public SortedList<ToDoListItem> sortedData;
    public ObservableList<ToDoListItem> selectedItem;
    public ToDoListItem TodoItem;
    public int maxListCount = 100;
    public String mode = "";

    @Override
    public void initialize(URL location, ResourceBundle resources) {


        //initialize ListsToDo object

        //Set ListsToDo object with single ToDoList from Context

        //call BindTable method to bind tableView for ToDoList Items

        //call PopulateSelectedListDetails
        //to select the first item and add the onChanged listner

        //Populate Items Status Dropdown and add the onChange Listener
        pnlForm.setVisible(false);
    }

    private void BindTable() {
        // bind tableView
    }

    private void PopulateSelectedListDetails() {
        //select the first Item and add the onChanged listner
    }

    private void ExportListInContext()
    {
        //export single ToDoList item
    }


    //region UX Button Actions
    @FXML
    public void btnBackOnAction() throws IOException {
        //Takes you back to the ManageListController

        Pane pne = FXMLLoader.load(getClass().getResource("todolists.fxml"));
        pntodolist.getChildren().setAll(pne);
    }

    @FXML
    public void btnExportListOnAction() {
        //export single ToDoList with items

    }

    @FXML
    public void btnAddListOnAction() {

        //Create new ToDoListItem if multiple ToDoListItems count less than 100
    }

    @FXML
    public void btnEditOnAction() {
        //Edit existing ToDoListItem

    }

    @FXML
    public void btnDeleteOnAction() {
        //Delete the selected ToDoListItem
    }

    @FXML
    public void btnCancelOnAction(){
        //Hide Add/Update ToDoListItem Panel
    }

    @FXML
    public void btnSubmitOnAction(){
        //Responsible for adding new ToDoListItem   or
        //updating existing ToDoListItem
    }


    //endregion
}