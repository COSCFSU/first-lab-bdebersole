/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cosc310_test;

import edu.frostburg.cosc310.lab00.KennedySteveLab00;
import edu.frostburg.cosc310.lab00.EbersoleBradenLab00; 

/**
 *
 * @author SK
 */
public class COSC310_Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KennedySteveLab00 lab = new KennedySteveLab00();
        System.out.println(lab.problem0(9999));
        System.out.println(lab.problem1(9999));
        EbersoleBradenLab00 lab2 = new EbersoleBradenLab00();
        System.out.println(lab2.problem2());
        System.out.println(lab2.problem2b()); 
    }
    
}
