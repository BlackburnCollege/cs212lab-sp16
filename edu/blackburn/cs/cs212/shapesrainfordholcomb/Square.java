/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212.shapesrainfordholcomb;

/**
 *
 * @author shelby.rainford
 */
public class Square extends Rectangle {
    
    private Measurement side;
    //private Measurement side2;
    
    public Square(double side1, String units) {
         super (side1, side1, units);
    }
}
