package co.edu.unbosque.view;

import javax.swing.*;

public class View {
    public View(){

    }
    public void mostrarinfo(String msj){
        JOptionPane.showMessageDialog(null, msj);
    }

    public int input (String dato){
        String aux = JOptionPane.showInputDialog(dato);
        int con = Integer.parseInt(aux);
        return con;

    }

}
