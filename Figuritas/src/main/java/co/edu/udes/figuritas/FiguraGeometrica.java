
package co.edu.udes.figuritas;

/**
 *
 * @author LabSispc16
 */
public class FiguraGeometrica {
    int side_number;
    private double area;
    private double perimeter;

    public FiguraGeometrica(int side_number, double area) {
        this.side_number = side_number;
        this.area = area;
    }
    

    public int getSide_number() {
        return side_number;
    }

    public void setSide_number(int side_number, double area) {
        this.side_number = side_number;
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "side_number=" + side_number + ", area=" + area + ", perimeter=" + perimeter + '}';
    }
    
    
    
}
