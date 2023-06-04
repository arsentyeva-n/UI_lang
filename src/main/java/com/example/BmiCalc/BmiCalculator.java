package com.example.BmiCalc;

public class BmiCalculator {
    private double weight; // вес в килограммах
    private double height; // рост в метрах

    public BmiCalculator() {
       // setWeight(weight);
        //setHeight(height);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Вес должен быть больше 0");
        }
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Рост должен быть больше 0");
        }
        this.height = height;
    }

    public double calculateBmi() {
        double bmi =(weight / (height * height))*10000;
        return bmi;
    }

    public String getBmiCategory() {
        double bmi = calculateBmi();

        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Normal";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
