/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.modelo;

import java.util.ArrayList;
import javax.swing.DefaultListModel;


/**
 *
 * @author Usuario
 */
public class Modelo {
    
    private String texto;

    ArrayList listTexto  = new ArrayList ();
    public void agregar  (){
        DefaultListModel modelo = new DefaultListModel();
        
        listTexto.add(texto);
        modelo.addElement(listTexto);
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public ArrayList getListTexto() {
        return listTexto;
    }

    public void setListTexto(ArrayList listTexto) {
        this.listTexto = listTexto;
    }
    
 
    
}
