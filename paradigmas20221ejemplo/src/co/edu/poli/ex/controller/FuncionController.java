package co.edu.poli.ex.controller;

import javax.swing.*;

import co.edu.poli.ex.model.Funcion;
import co.edu.poli.ex.model.RecursivoCola;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FuncionController {

    @FXML
    private TextField txt1;

    @FXML
    private Label lbl1;

    @FXML
    private Label lbl2;

    @FXML
    private Button btt1;

    Funcion f;
    
    public FuncionController() {
		f = new RecursivoCola();
	}
    
    @FXML
    void click(ActionEvent event) {
    	try {
    		lbl2.setText("");
    		lbl2.setText(""+f.factorial(Integer.parseInt(txt1.getText())));
    	} catch (Exception e) {
    		//JOptionPane.showMessageDialog(null, e.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText(e.getMessage());
            a.show();
    	}
    	
    }

}
