package com.example.calculator;

import com.example.calculator.calc.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class Controller {
    @FXML
    private Text output;
    private String operator = "";
    private long number1 = 0;
    private Model model = new Model();
    private boolean start = true;

    @FXML
    public void processNumPad(ActionEvent event){
        if (start){
            output.setText( "" );
            start = false;
        }
        String value = ((Button)event.getSource()).getText();
        output.setText( output.getText() + value );

    }
    @FXML
    public void processNumOperator(ActionEvent event){
        String value = ((Button)event.getSource()).getText();
        if (!"=".equals( value )){
            if (!operator.isEmpty()){
                return;
            }
            operator = value;
            number1 = Long.parseLong( output.getText() );
            output.setText( "" );
        } else  {
            if (operator.isEmpty())
                return;
            output.setText( String.valueOf(model.calculate( number1,Long.parseLong( output.getText() ), operator ) ) );
            operator = "";
            start = true;

        }

    }


}