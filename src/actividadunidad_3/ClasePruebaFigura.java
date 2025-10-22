/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadunidad_3;

/**
 *
 * @author Sebastian
 */
public class ClasePruebaFigura {


    public static void main(String[] args) {
        Figura circulo= new Circulo(7);
        Figura rectangulo = new Rectangulo (6, 8);
        
        circulo.CalcularArea();
        rectangulo.CalcularArea();
        
    }
    
}
