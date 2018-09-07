/*
 * Braden Ebersole
 * sept 7, 2018
 * 
 */
package edu.frostburg.cosc310.lab00;
import java.util.ArrayList; 
import java.util.LinkedList; 

/**
 * @version 2018.7.9
 * @author Braden Ebersole
 */
public class EbersoleBradenLab00 implements Lab00{
    
    @Override
    public long problem0(int size) {
        System.out.println("This is just an example, but please follow this template.");
        String s = "";
        long start = System.currentTimeMillis();

        for (int i=0; i<size; i++) {
            s = s + i;
        }
        
        long end = System.currentTimeMillis();
        return end - start;
    }
    
    @Override
    public long problem1(int size) {
        StringBuilder sb = new StringBuilder();
        long start = System.currentTimeMillis();
        for (int i=0; i<size; i++) {
            sb.append(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
    
    @Override
    public long problem2() {
        ArrayList<String> arrList = new ArrayList<>();
        long start = System.currentTimeMillis(); 
        for(int i = 0; i<1234567; i++){
            arrList.add(Integer.toString(i));
        }
        long end = System.currentTimeMillis();  
        return end - start;        
    }
    
    public long problem2b(){
        LinkedList<String> linkList = new LinkedList<>();
        long start = System.currentTimeMillis(); 
        for(int i = 0; i<1234567; i++){
            linkList.add(Integer.toString(i));
        }
        long end = System.currentTimeMillis();
        return end - start; 
    }
}
