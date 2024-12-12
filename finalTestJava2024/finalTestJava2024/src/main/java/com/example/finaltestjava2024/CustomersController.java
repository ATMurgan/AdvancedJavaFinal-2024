package com.example.finaltestjava2024;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

// Andrew Murgan - 200589802
public class CustomersController implements Initializable {
    @FXML
    private Button allCustomersButton;

    @FXML
    private TableColumn<Customer, String> colCompany;

    @FXML
    private TableColumn<Customer, String> colCountry;

    @FXML
    private TableColumn<Customer, String> colCreatedAt;

    @FXML
    private TableColumn<Customer, String> colEmail;

    @FXML
    private TableColumn<Customer, String> colFirst;

    @FXML
    private TableColumn<Customer, Integer> colId;

    @FXML
    private TableColumn<Customer, String> colLast;

    @FXML
    private Button domesticCustomersButton;

    @FXML
    private Label rowsInTableLabel;

    @FXML
    private TableView<Customer> tableViewCustomers;

    @FXML
    private Label titleLabel;

    private List<Customer> customers;

    @FXML
    protected void onAllCustomersButtonClick() {
        rowsInTableLabel.setText("Here is all the customers!");
        Customers();
    }

    @FXML
    protected void onDomesticCustomersButtonClick() {
        rowsInTableLabel.setText("Domestic Customers");

        List<Customer> domesticCustomers = customers.stream().filter(customer -> customer.getCountry().equals("Canada")).collect(Collectors.toList());
        

        ObservableList<Customer> customerList = FXCollections.observableArrayList(domesticCustomers);
        tableViewCustomers.setItems(customerList);
        rowsInTableLabel.setText("Rows: " + customerList.size());


    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ApiResponse apiResponse = null;
        try {
            apiResponse = JsonParse.Json("src/main/resources/customers.json");
            customers = apiResponse.getCustomer();


            titleLabel.setText(apiResponse.getCompany());


            colCompany.setCellValueFactory(new PropertyValueFactory<Customer,String>("company"));
            colCountry.setCellValueFactory(new PropertyValueFactory<Customer, String>("country"));
            colId.setCellValueFactory(new PropertyValueFactory<Customer, Integer>("id"));
            colLast.setCellValueFactory(new PropertyValueFactory<Customer, String>("last"));
            colCreatedAt.setCellValueFactory(new PropertyValueFactory<Customer, String>("created_at"));
            colFirst.setCellValueFactory(new PropertyValueFactory<Customer, String>("first"));

            Customers();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }

    private void Customers() {
        ObservableList<Customer> customerList = FXCollections.observableArrayList(customers);

        tableViewCustomers.setItems(customerList);
        rowsInTableLabel.setText("Rows: " + customerList.size());
    }



}