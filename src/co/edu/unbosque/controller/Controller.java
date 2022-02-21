package co.edu.unbosque.controller;

import co.edu.unbosque.view.*;
import co.edu.unbosque.model.*;

public class Controller {
    public View vista =new View();
    public Operar operation=new Operar();
    public Controller() {
        funcionar();

    }
    public void funcionar() {
      int dato1=vista.input("Ingrese el primer número");
      int dato2=vista.input("Ingrese el segundo número");
       vista.mostrarinfo("Suma= "+dato1+"+"+dato2+" = "+operation.Suma(dato1,dato2));
        vista.mostrarinfo("Resta= "+dato1+"-"+dato2+" = "+operation.resta(dato1,dato2));
        vista.mostrarinfo("División= "+dato1+"+"+dato2+" = "+operation.dividir(dato1,dato2));
        vista.mostrarinfo("Multiplicación= "+dato1+"+"+dato2+" = "+operation.mult(dato1,dato2));



    }

}
