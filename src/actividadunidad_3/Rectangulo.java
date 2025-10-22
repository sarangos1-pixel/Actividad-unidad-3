/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadunidad_3;

/**
 *
 * @author Sebastian
 */
public class Rectangulo extends Figura {
    private double base;
    private double altura;
    
    
    public Rectangulo(double base, double altura){
    this.altura=altura;
    this.base=base;
  }
    
    @Override
    public void CalcularArea(){
    double area = base*altura;
        System.out.println("El area del Rectangulo es " + area);
    }
    
}
