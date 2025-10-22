/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadunidad_3;

/**
 *
 * @author Sebastian
 */
public class Circulo extends Figura {
    private double radio;
    
    public Circulo(double radio){
    this.radio=radio;
    }
    
    @Override  
    public void CalcularArea(){
    double area;
    double pi = 3.1416;
    
    area = pi * radio * radio;
        System.out.println("El area del circulo e: " + area );
    }
}
