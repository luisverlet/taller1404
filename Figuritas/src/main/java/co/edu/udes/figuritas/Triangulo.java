/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.figuritas;

/**
 *
 * @author LabSispc16
 */
public class Triangulo extends FiguraGeometrica{
    
    

    public Triangulo() {
        super(3);
    }

    @Override
    public String toString() {
        return "Triangulo{" + "Tiene "+side_number+" lados";
    }
    
    
}
