/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212.lab01.tebbevanwormer.bank;

/**
 * Something
 * @author joshua.gross
 */
public class Runner {
    public static void main(String[] args) {
        Money m = new Money("USD", 0);
        System.out.println("currency = " + m.getCurrency());
        System.out.println("value = " + m.getValue());
    }
}
