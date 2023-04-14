

package co.edu.udes.figuritas;

/**
 *
 * @author LabSispc16
 */
public class Figuritas {

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        Cuadrado cuadrado = new Cuadrado();
        Circulo circulo = new Circulo();
        
        String uno = triangulo.toString();
        String dos = cuadrado.toString();
        String tres = circulo.toString();
        
        System.out.println(uno);
        System.out.println(dos);
        System.out.println(tres);
        
        
        }
    }

