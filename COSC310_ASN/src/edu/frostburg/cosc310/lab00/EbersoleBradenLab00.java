/*
 * Braden Ebersole
 * sept 7, 2018
 * This class is used to conduct a time analysis between concatenating strings
 * and string builder and then between array lists and linked lists. 
 */
package edu.frostburg.cosc310.lab00;
import java.util.ArrayList; 
import java.util.LinkedList; 

/**
 * Class used in Lab00 to get familiar with Github and conduct a time analysis
 * @version 2018.7.9
 * @author Braden Ebersole
 */
public class EbersoleBradenLab00 implements Lab00{
    
    /**
     * Makes a long string using Java concatenation.
     * @param size the # of times
     * @return how long it took
     */
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
    
    /**
     * Makes a long string using Java StringBuilder
     * @param size the # of times
     * @return how long it took
     */
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
    
    /**
     * This method shows the time it takes to add elements to an array list. 
     * @return long The time to add elements to an array list
     */
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
    
    /**
     * This method shows the time it takes to add elements to a linked list
     * @return long The time to add to a linked list
     */
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
