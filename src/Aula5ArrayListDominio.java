
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Mari (48) 99618-5728
 */
public class Aula5ArrayListDominio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> palavras = new ArrayList();
        for (int i =0; i<3;i++){
            String palavra = JOptionPane.showInputDialog("Digite uma palavra: ");
            palavras.add(palavra);
        }
        StringBuilder resultado = new StringBuilder();
        for (String aux : palavras){
            resultado.append(aux).append("\n");
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
    
}
