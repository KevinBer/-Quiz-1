/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author kevin bermudez
 */
public class Calculadora {
    
    Pattern expresion= Pattern.compile("");
    ArrayList<Pattern> arrayCifra;

    public Calculadora(){
        arrayCifra= new ArrayList<>();
        expresion = Pattern.compile("(\\d+\\,\\d+\\.\\d+)\\+(\\d+)");
        arrayCifra.add(expresion);
    }
    
   public String calcSuma(String cifra){
       String imprimir="";
       
       for(int i=0; i<arrayCifra.size(); i++){
            Pattern expresion=arrayCifra.get(i);
            Matcher matcher= expresion.matcher(cifra);
            
            imprimir=matcher.group(1);
            
                    
       }
       
       
       return imprimir;
               
   }
    
    
    
}
