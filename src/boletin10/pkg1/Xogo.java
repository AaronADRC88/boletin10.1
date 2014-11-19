
package boletin10.pkg1;

import javax.swing.JOptionPane;

public class Xogo {
    private int tryes;
    private int num;
    private int sol;
    public float numtryes(){
    String intentos=JOptionPane.showInputDialog("introduce nº de intentos");
    tryes=Integer.parseInt(intentos);
    return tryes;
}
public float seeNum(){
    do{String adivina=JOptionPane.showInputDialog("Introduce nº a adiviñar entre 1 e 50");
    num=Integer.parseInt(adivina);
    return num;
    }while(num>0&&num<50);
}
public void xogarAdiv(){
    int contador=0;
    do{
        
        String solucion=JOptionPane.showInputDialog("adiviña nº entre 1 e 50");
        sol=Integer.parseInt(solucion);
        if (sol>num){
            JOptionPane.showMessageDialog(null,+sol+"  é maior");
        }
        else 
        if (sol<num){
            JOptionPane.showMessageDialog(null,+sol+"  é menor");
        }
        contador++;
        if (contador<tryes&&sol==num){
            JOptionPane.showMessageDialog(null, "YOU WIN");
        }
        if (contador>=tryes&&sol!=num){
            JOptionPane.showMessageDialog(null, "YOU LOSE");
        }
    }while (contador<tryes||sol!=num);
    
}



}
