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
 * @author Usuario
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Modelo modelo = new Modelo();
       Vista view = new Vista();
       Controlador controlador = new Controlador(view,modelo);
       controlador.iniciar();
       view.setVisible(true);
        // TODO code application logic here
    }
    
}
