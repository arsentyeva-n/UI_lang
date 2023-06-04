package com.example.BmiCalc;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;


public class Controller {

    @FXML
    private Button buttonCalc;

    @FXML
    private TextField fieldHeight;

    @FXML
    private TextField fieldWeight;

    @FXML
    private Label label_bmi;

    @FXML
    private Label label_height;

    @FXML
    private Label label_weight;

    @FXML
    private Label result_bmi;

  //  private BmiCalculator bmiCalc = new BmiCalculator();

    void checkFields() {
        if (fieldHeight.getText().equals("") || fieldWeight.getText().equals(""))
            throw new IllegalArgumentException("Поля не могут быть пустыми");
    }
    @FXML
    void calcBMI(MouseEvent event) {
        try {
            BmiCalculator bmiCalc = new BmiCalculator();
            checkFields();
            double weight = Double.parseDouble(fieldWeight.getText());
            double height = Double.parseDouble(fieldHeight.getText());

           bmiCalc.setHeight(height);
            bmiCalc.setWeight(weight);


           result_bmi.setText(String.format("%.2f", bmiCalc.calculateBmi()));
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());

        }
    }

}
