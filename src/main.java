import javax.swing.*;

public class main {

    private static void evaluator(int guess, int num) {
        if(num < guess) {
            JOptionPane.showMessageDialog(null, "Gissningen är större än svaret.");
        } else if(num > guess) {
            JOptionPane.showMessageDialog(null, "Gissningen är mindre än svaret.");
        } else {
            JOptionPane.showMessageDialog(null, "Du hade rätt!");
            return;
        }

        makeGuess(num);
    }

    private static void makeGuess(int num) {
        int guess = Integer.parseInt(JOptionPane.showInputDialog(null, "Gissa numret :)"));
        evaluator(guess, num);
    }

    public static void main(String[] args) {
        int num = (int) Math.round(Math.random()*100);

        try {
            makeGuess(num);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Svaret måste vara ett nummer!");
            makeGuess(num);
        }

    }

}
