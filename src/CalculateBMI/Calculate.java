package CalculateBMI;

public class Calculate {
    public static String bmi(double weight, double height) {
        double result = weight/Math.pow(height,2);
        String answer = "";
        if (result <= 18.5){
            answer = "Underweight";
        } else if (result <= 25.0){
            answer = "Normal";
        } else if (result <= 30.0){
            answer = "Overweight";
        } else {
            answer = "Obese";
        }
        return answer;
    }
}
