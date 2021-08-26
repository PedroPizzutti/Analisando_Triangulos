/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pizzutti.entity;

/**
 *
 * @author Pedro
 */
public class Triangulo {
    
    private double lado1;
    private double lado2;
    private double lado3;
    private String tipo;
    
    
    public Triangulo(){
        
    }
    
    public Triangulo(double l1, double l2, double l3){
        
        this.lado1 = l1;
        this.lado2 = l2;
        this.lado3 = l3;
                
    }
    
    public double getLado1(){
        
        return lado1;  
    }

    public double getLado2() {
        
        return lado2;
    }
    
    public double getLado3(){
        
        return lado3;
    }
    
    public void setLado1(double l1){
        
        this.lado1 = l1;
    }

    public void setLado2(double l2) {
        
        this.lado2 = l2;
    }
    
    public void setLado3(double l3){
        
        this.lado3 = l3;
    }
    
    public boolean analiseTriangulo(Triangulo triagulo){
        
        if(((lado1+lado2) > lado3) && ((lado1+lado3) > lado2) && ((lado2+lado3) > lado1)){
            
            return true;
            
        } else {
            
            return false;
        }
    }
    
    public String tipoTriangulo(Triangulo triangulo){
       
        if(lado1 == lado2 && lado2 == lado3){
            
            tipo = "Equilátero";
            
        } else if((lado2 != lado1) && (lado2 != lado3) && (lado3 != lado1)){
            
            tipo = "Escaleno";
            
        } else {
            
            tipo = "Isóceles";
            
        };
        
        return tipo;
    }
    
    
    
    
}
