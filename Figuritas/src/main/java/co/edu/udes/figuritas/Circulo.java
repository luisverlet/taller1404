
package co.edu.udes.figuritas;

/**
 *
 * @author LabSispc16
 */
public class Circulo extends FiguraGeometrica{
        double r =12;
        double pi = Math.PI;
        double w =r*r;
        double coso = pi*w;

    public Circulo(int side_number, double area, double coso) {
        super(0,coso);
        
        
    }
    @Override
    public String toString() {
        return "Circulo tiene "+side_number+" lados y area"+ coso;
    }

}
