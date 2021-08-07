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
import javafx.scene.control.TextField;

import java.net.URL;
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

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
