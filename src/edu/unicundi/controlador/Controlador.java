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
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author Andres Gomez - Ruby Cardenas
 */
public class Controlador implements ActionListener {
//Variables de objetos
    private final Vista view;
    private final Modelo model;
    
    DefaultListModel modelo = new DefaultListModel();

    public Controlador(Vista view, Modelo model) {

        this.view = view;
        this.model = model;
        this.view.btnAgregar.addActionListener(this);
    }

    public void iniciar() {
        view.setLocationRelativeTo(null);

    }
/*
    Este metodo recibe la accion al orpimir el boton agregar y realiza la comunicacion de la logica entre el modelo y la vista
    */
    @Override
    public void actionPerformed(ActionEvent e) {

        view.lista.setModel(modelo);
        model.setTexto(view.texto.getText());
        modelo.addElement(model.getTexto());
        JOptionPane.showMessageDialog(null, "Registro agregado");
        view.texto.setText("");

    }
    

}
