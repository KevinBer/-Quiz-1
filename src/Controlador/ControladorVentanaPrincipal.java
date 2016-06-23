/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Calculadora;
import Vista.PrincipalCalculadora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kevin bermudez
 */
public class ControladorVentanaPrincipal implements ActionListener{

    private Calculadora calculadora;
    private PrincipalCalculadora principalCalculadora;    
    
    public ControladorVentanaPrincipal() {
        calculadora= new Calculadora();
    }   
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equals("Calcular"))
            calculadora= new Calculadora();
            principalCalculadora.setTextResultado(calculadora.calcSuma(principalCalculadora.getTextArea()));
    }
    
}
