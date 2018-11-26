/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.controlador;

import javax.swing.JOptionPane;

/**
 *
 * @author PC6-LAB2
 */
public class Coordinador {
      public String asignarmenuavion() {
         String op="seleccione una opcion \n"
        +"1-Asignar numeroPasajeros \n"
        + "2-Asignar tripulacion\n"
        + "3-Asignar modelo\n";
         return op;
    }
      public String retornarmenuavion() {
         String op="seleccione una opcion \n"
        +"1-Asignar numeroPasajeros  \n"
        + "2-Asignar tripulacion\n"
        + "3-Asignar modelo\n";
         return op;
    }
    public String asignarmenubarco() {
         String op="seleccione una opcion \n"
        +"1-Asignar capacidadCarga \n"
        + "2-Asignar tripulacion\n"
        + "3-Asignar nombreEmbarcacion\n";
         return op;
    }
      public String retornarmenubarco() {
         String op="seleccione una opcion \n"
        +"1-Asignar capacidadCarga \n"
        + "2-Asignar tripulacion\n"
        + "3-Asignar nombreEmbarcacion\n";
         return op;
    }

    public String asignarmenuautomovil() {
        String opciones="seleccione una opcion \n"
        +"1-Asignar placa \n"
        + "2-Asignar marca\n"
        + "3-Asignar chasis\n"
        + "4-Asignar color\n"
        + "5-Asignar modelo\n";
        return opciones;
        
    }
 public String retornarmenuautomovil() {
        String opciones =    "seleccione una opcion \n"
        +"1-Retornar placa \n"
        + "2-Retornar marca\n"
        + "3-Retornar chasis\n"
        + "4-Retornar color\n"
        + "5-Retornar modelo\n";
        return opciones;
        
    }
public String menubarco(){
       String op = "";
        do{
            op= JOptionPane.showInputDialog("selecione una opcion\n"
                    + "1-Asignar atributos\n"
                    + "2-Retornar atributo\n"
                    +"3-Salir\n");
        switch(op){
            case "1":
                JOptionPane.showInputDialog(asignarmenubarco());
            break;
             case "2":
                 JOptionPane.showInputDialog(retornarmenubarco());
            break;
            
        }
        } while (!op.equals("3"));
     return op;   
    }
        

public String menuaautomovil(){
         String op = "";
        do{
            op= JOptionPane.showInputDialog("selecione una opcion\n"
                    + "1-Asignar atributos\n"
                    + "2-Retornar atributo\n"
                    +"3-Salir\n");
        switch(op){
            case "1":
                JOptionPane.showInputDialog(asignarmenuautomovil());
            break;
             case "2":
                 JOptionPane.showInputDialog(retornarmenuautomovil());
            break;
            
        }
        } while (!op.equals("3"));
        
    
   
     return op;      
}
public String menuaavion(){
       String op = "";
        do{
            op= JOptionPane.showInputDialog("selecione una opcion\n"
                    + "1-Asignar atributos\n"
                    + "2-Retornar atributo\n"
                    +"3-Salir\n");
        switch(op){
            case "1":
                JOptionPane.showInputDialog(asignarmenuavion());
            break;
             case "2":
                 JOptionPane.showInputDialog(retornarmenuavion());
            break;
            
        }
        } while (!op.equals("3"));
        return op;
    }
   
public void menu() {
        String op = "";
        do{
            op= JOptionPane.showInputDialog("selecione una opcion\n"
                    + "1-avion\n"
                    + "2-barco\n"
                    + "3-vehiculo\n"
                    +"4-Salir\n");
         
        switch(op){
            case "1":
                JOptionPane.showInputDialog(menuaavion());
                break;
                 case "2":
                 JOptionPane.showInputDialog(menubarco());
                break;
                 case "3":
                     JOptionPane.showInputDialog(menuaautomovil());
                break;
        }
    }while (!op.equals("4"));
   
}

    
}

