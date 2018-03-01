/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdo.booking.system.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.FlowPane;

/**
 *
 * @author SPELL
 */
public class HomeController implements Initializable {

    private JFXButton addVisitorBtn;
    @FXML
    private JFXTextField nameField;
    @FXML
    private JFXDatePicker birthDatePicker;
    @FXML
    private JFXCheckBox maleCheck;
    @FXML
    private JFXCheckBox femaleCheck;
    @FXML
    private JFXTextField passportNumberField;
    @FXML
    private JFXTextField visaNumberField;
    @FXML
    private JFXTextField nationField;
    @FXML
    private JFXTextField organizationField;
    @FXML
    private JFXDatePicker arrivalDatePicker;
    @FXML
    private JFXDatePicker departureDatePicker;
    @FXML
    private JFXTextArea addressField;
    @FXML
    private JFXTextField contactNumberField;
    @FXML
    private JFXTextField emailField;
    @FXML
    private JFXTextField roomField;
    @FXML
    private JFXTextField staffField;
    @FXML
    private FlowPane aBuilding;
    @FXML
    private FlowPane gBuilding;
    @FXML
    private FlowPane jBuilding;
    @FXML
    private FlowPane gHBuilding;
    @FXML
    private FlowPane gDBuilding;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        JFXButton roomBtn;
        
        for(int i=0; i<11; i++){
        
        roomBtn = new JFXButton();
        roomBtn.setText("A.V-1.2");
        roomBtn.setStyle("-fx-pref-width: 80px; -fx-border-color: #000000; -fx-border-width: 1px; -fx-background-color: #ffffff; -fx-font-size: 11pt; -fx-text-fill: #000000");
        
        aBuilding.getChildren().addAll(roomBtn);
        
        }
        
        for(int i=0; i<6; i++){
        
        roomBtn = new JFXButton();
        roomBtn.setText("G.V-1.2");
        roomBtn.setStyle("-fx-pref-width: 80px; -fx-border-color: #000000; -fx-border-width: 1px; -fx-background-color: #ffffff; -fx-font-size: 11pt; -fx-text-fill: #000000");
        
        gBuilding.getChildren().addAll(roomBtn);
        
        }
        
        for(int i=0; i<1; i++){
        
        roomBtn = new JFXButton();
        roomBtn.setText("J.V-1.2");
        roomBtn.setStyle("-fx-pref-width: 80px; -fx-border-color: #000000; -fx-border-width: 1px; -fx-background-color: #ffffff; -fx-font-size: 11pt; -fx-text-fill: #000000");
        
        jBuilding.getChildren().addAll(roomBtn);
        
        }
        
        for(int i=0; i<12; i++){
        
        roomBtn = new JFXButton();
        roomBtn.setText("101");
        roomBtn.setStyle("-fx-pref-width: 80px; -fx-border-color: #000000; -fx-border-width: 1px; -fx-background-color: #ffffff; -fx-font-size: 11pt; -fx-text-fill: #000000");
        
        gHBuilding.getChildren().addAll(roomBtn);
        
        }
        
        for(int i=0; i<5; i++){
        
        roomBtn = new JFXButton();
        roomBtn.setText("D.V-1.2");
        roomBtn.setStyle("-fx-pref-width: 80px; -fx-border-color: #000000; -fx-border-width: 1px; -fx-background-color: #ffffff; -fx-font-size: 11pt; -fx-text-fill: #000000");
        
        gDBuilding.getChildren().addAll(roomBtn);
        
        }
        
//        addVisitorBtn.setStyle("-fx-border-color: #ff0000; -fx-border-width: 2px;");
//        addVisitorBtn.setStyle("-fx-background-color: #00ff00");
//        addVisitorBtn.setStyle("-fx-font-size: 2em; ");
//        addVisitorBtn.setStyle("-fx-text-fill: #0000ff");
        
    }    

}
