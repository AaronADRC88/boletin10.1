package boletin10.pkg1;

import javax.swing.JOptionPane;

public class Xogo {

    private int tryes;
    private int num;
    private int sol;
    private int contador = 0;

    public float numtryes() {
        String intentos = JOptionPane.showInputDialog("introduce nº de intentos");
        tryes = Integer.parseInt(intentos);
        return tryes;
    }

    public float seeNum() {
        do {
            String adivina = JOptionPane.showInputDialog("Introduce nº a adiviñar entre 1 e 50");
            num = Integer.parseInt(adivina);
        } while (num < 0 || num > 50);
        return num;
    }

    public void xogarAdiv() {

        do {

            String solucion = JOptionPane.showInputDialog("adiviña nº entre 1 e 50");
            sol = Integer.parseInt(solucion);
            if (sol > num) {
                JOptionPane.showMessageDialog(null, +sol + "  é maior");
            }
            if (sol < num) {
                JOptionPane.showMessageDialog(null, +sol + "  é menor");
            }
            contador++;
        } while (contador < tryes && sol != num);
        if (sol == num) {
            JOptionPane.showMessageDialog(null, "YOU WIN");
        } else {

            JOptionPane.showMessageDialog(null, "YOU LOSE");
        }

    }

}
