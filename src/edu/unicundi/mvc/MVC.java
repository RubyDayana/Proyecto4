/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.mvc;

import edu.unicundi.controlador.Controlador;
import edu.unicundi.modelo.Modelo;
import edu.unicundi.vista.Vista;

/**
 *
 * @author Andres Gomez - Ruby Cardenas
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instancia del objeto modelo
       Modelo modelo = new Modelo();
       //Instancia del objeto vista
       Vista view = new Vista();
       //Instancia del objeto controlador enviadole los parametros al constructor
       Controlador controlador = new Controlador(view,modelo);
       //Iniciamos la vista 
       controlador.iniciar();
       view.setVisible(true);
        
    }
    
}
