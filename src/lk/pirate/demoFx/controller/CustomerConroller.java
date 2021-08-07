/*
 * *
 *  * @author : Udara Deshan <udaradeshan.ud@gmail.com>
 *  * @since : 08/07/2021
 *  *
 */

package lk.pirate.demoFx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import lk.pirate.demoFx.db.DBConnection;
import lk.pirate.demoFx.model.Customer;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class CustomerConroller implements Initializable {
    @FXML
    private TextField txtCusDOB;

    @FXML
    private TextField txtCusName;

    @FXML
    private TextField txtCusAddress;

    @FXML
    private TextField txtCusTel;

    @FXML
    void btnSave(ActionEvent event) {

        Customer cust=new Customer(txtCusName.getText(),txtCusAddress.getText(),txtCusTel.getText(),txtCusDOB.getText());
        try {
            Connection con = DBConnection.getInstance().getConnection();
            PreparedStatement stm = con.prepareStatement("INSERT INTO customer VALUES(?,?,?,?)");
            stm.setString(1, cust.getName());
            stm.setString(2, cust.getAddress());
            stm.setString(3, cust.getTelephone());
            stm.setString(4, cust.getdOb());
            boolean saved = stm.executeUpdate() > 0;
            if (saved) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Customer");
                alert.setHeaderText("Customer Saved !");
                alert.show();
            } else {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Customer");
                alert.setHeaderText("Please  Check your Values");
                alert.show();
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        clearAll();


    }
    private void clearAll() {
        txtCusDOB.setText(null);
        txtCusAddress.setText(null);
        txtCusTel.setText(null);
        txtCusName.setText(null);
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
