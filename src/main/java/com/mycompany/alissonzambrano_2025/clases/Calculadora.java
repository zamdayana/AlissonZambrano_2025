/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alissonzambrano_2025.clases;

/**
 *
 * @author aliss
 */
public class Calculadora {
    private String suma;
    private Stack<String> piladeshacer;
    private Stack<String> pilarehacer;
    private Stack<String> pilaresultado;

    public Calculadora(){
        this.suma = 0;
        this.piladeshacer = new Stack();
        this.pilarehacer = new Stack();
        this.pilaresultado = new Stack();
    }

    public void Suma(String suma) {
        suma = pilaresultado push (suma);
        pilarehacer.clear();
        System.out.println("resul"+ suma);
    }
    
    public void Deshacer() {
        suma=  piladeshacer push (suma);
        pilaresultado.clear();
        System.out.println(" "+ suma);
    }

    public void Rehacer() {
        suma= pilarehacer push (suma);
        pilaresultado.clear();
        System.out.println(" "+ suma);
    }

    public void Resultado() {
        System.out.println("El resultado es"+ pilaresultado);
    }

     public void mostrarElementos(){
       Dato actual= suma;
       if (actual ==null){
           System.out.println("   "+ pilaresultado);
           return;
       }
    
       
   System.out.println("Resultado del calculo ");
       while (actual != null){
            System.out.println(actual.getsuma());
            actual =actual.suma;
   }
    
   }
     }