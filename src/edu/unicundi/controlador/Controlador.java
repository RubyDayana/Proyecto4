/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.controlador;

import edu.unicundi.modelo.Modelo;
import edu.unicundi.vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Usuario
 */
public class Controlador implements ActionListener{
    
    private Vista view;
    private Modelo model;

    public Controlador(Vista view, Modelo model) {
        this.view = view;
        this.model = model;
        this.view.btnAgregar.addActionListener(this);
    }
    
    public void iniciar(){
        view.setLocationRelativeTo(null);
    }
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        model.setTexto(view.texto.getText());
        model.agregar();
        view.lista.setModel(null);
    }
    
}
