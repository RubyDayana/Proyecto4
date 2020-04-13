/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.modelo;

import javax.swing.DefaultListModel;

/**
 * Esta clase se encarda del modelo del programa obteniendo y retornando los
 * datos
 *
 * @author Andres Gomez - Ruby Cardenas
 */
public class Modelo {

    
    //Variable que almacena los datos ingresados por teclado
    private String texto;
//Metodo de impresion de datos

    public String getTexto() {
        return texto;
    }
//Metodo de modificacion de datos

    public void setTexto(String texto) {
        this.texto = texto;
    }

}
