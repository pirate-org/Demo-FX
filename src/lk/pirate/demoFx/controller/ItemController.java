/*
 *
 *  * *
 *  *  * @author : Udara Deshan <udaradeshan.ud@gmail.com>
 *  *  * @since : 08/07/2021
 *  *  *
 *
 */

package lk.pirate.demoFx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class ItemController implements Initializable {
    @FXML
    private TextField txtItemPrice;

    @FXML
    private TextField txtItemName;

    @FXML
    private TextField txtItemExpDate;

    @FXML
    private TextField txtItemQty;

    @FXML
    void btnSave(ActionEvent event) {

    }
}
