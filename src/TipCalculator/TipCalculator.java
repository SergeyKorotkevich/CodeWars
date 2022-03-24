package TipCalculator;

public class TipCalculator {

    public static Integer calculateTip(double amount, String rating) {
        double tip;
        if (rating.equalsIgnoreCase("Terrible")) {
            tip = 0;
            return (int) Math.ceil(tip);
        } else if (rating.equalsIgnoreCase("Poor")) {
            tip = amount * 0.05;
            return (int) Math.ceil(tip);
        } else if (rating.equalsIgnoreCase("Good")) {
            tip = amount * 0.1;
            return (int) Math.ceil(tip);
        } else if (rating.equalsIgnoreCase("Great")) {
            tip = amount * 0.15;
            return (int) Math.ceil(tip);
        } else if (rating.equalsIgnoreCase("Excellent")) {
            tip = amount * 0.2;
            return (int) Math.ceil(tip);
        } else {
            return null;
        }
    }
}
