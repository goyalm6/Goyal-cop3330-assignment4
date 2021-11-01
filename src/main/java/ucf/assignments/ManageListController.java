/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Mayank Goyal
 */

package ucf.assignments;
import ToDoList.ToDoList;
import ToDoList.ToDoLists;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

public class ManageListController implements Initializable {
    private ToDoLists ListsToDo ;
    private FilteredList<ToDoList> filteredData;
    private ObservableList<ToDoList> selectedList;
    private int maxListCount = 100;
    private String mode = "";

    //region UX
    @FXML private Pane pntodolists;
    @FXML private Pane pnlForm;
    @FXML private Label lblMsg;
    @FXML private TextField txtTitle;
    @FXML private TableView<ToDoList> tableView;
    @FXML private TableColumn<ToDoList, String> titleColumn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //initialize ToDoLists object

        //Set ToDoLists object with multiple ToDoList from Context

        //call BindTable method to bind tableView

        //call PopulateSelectedListDetails
        //to select the first lists and add the onChanged listner
        pnlForm.setVisible(false);
    }

    private void BindTable() {
        // bind tableView
    }

    private void PopulateSelectedListDetails() {
        //select the first lists and add the onChanged listner
    }

    private ToDoList ImportListInContext()
    {
        //import previously imported list
        return new ToDoList();
    }

    private ToDoLists ImportLists()
    {
        //import previously imported lists
        return new ToDoLists();
    }

    private void ExportLists()
    {
        //export multiple ToDoList with items
    }

    //region UX Buttons
    @FXML
    public void btnAddListOnAction()
    {

        //Create new ToDoList with Title if multiple ToDoList count less than 100
    }

    @FXML
    public void btnDeleteOnAction()
    {
       //Delete the selected ToDoList
    }

    @FXML
    public void btnSubmitOnAction()
    {
        //Responsible for adding new ToDoList Title or
        //updating existing ToDoList Title
    }

    @FXML
    public void btnCancelOnAction()
    {
        //Hide Add/Update ToDoList Panel
    }

    @FXML
    public void btnAddOnAction()
    {
        //Add New ToDoList Title
    }

    @FXML
    public void btnEditOnAction()
    {
        //Edit existing ToDoList Title
    }

    @FXML
    public void btnExportListsOnAction()
    {
        //export multiple ToDoLists with items
    }

    @FXML
    public void btnImportListsOnAction()
    {
        //import previously saved multiple ToDoLists
        //set the ToDoLists object and bind to tableView
    }

    @FXML
    public void btnManageItemsOnAction() throws IOException
    {
        //Will it take you to the screen for managing single ToDoList items
        //for ex. Title, Description, Due Date and Status

        Pane pne = FXMLLoader.load(getClass().getResource("todolist.fxml"));
        pntodolists.getChildren().setAll(pne);
    }

    @FXML
    public void btnImportListOnAction()
    {
        //import previously saved ToDoList
        //set the ToDoList object and bind to tableView
    }
    //endregion
}
