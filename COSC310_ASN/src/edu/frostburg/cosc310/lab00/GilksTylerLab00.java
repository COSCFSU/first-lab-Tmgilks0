/*
 * Tyler Gilks
 * September 7, 2018
 * Compares the length of time it takes to create large lists using arrays and linked lists
 */
package edu.frostburg.cosc310.lab00;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author TylerG
 */
public class GilksTylerLab00 implements Lab00{
    /**
     * Makes a long string using Java concatenation.
     * @param size the # of times
     * @return how long it took
     */
    @Override
    public long problem0(int size) {
        //System.out.println("This is just an example, but please follow this template.");
        String s = "";
        long start = System.currentTimeMillis();

        for (int i=0; i<size; i++) {
            s = s + i;
        }
        
        long end = System.currentTimeMillis();
        System.out.println("Creating the String with Java concatenation took:");
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
        System.out.println("Creating the String with String Builder took:");
        return end - start;
    }
    
    /**
     * Creates an ArrayList and Linked list of the same size and compares the time it takes to do either
     * @return the difference between the completion times
     */
    @Override
    public long problem2() {
        ArrayList<String> aList= new ArrayList<String>();
        LinkedList<String> lList= new LinkedList<String>();
        
        //ArrayList test
        long start0 = System.currentTimeMillis();
        for (int i=0; i<1000000; i++){ 
            aList.add(Integer.toString(i));
        }
        long end0 = System.currentTimeMillis();
        
        //LinkedList test
        long start1 = System.currentTimeMillis();
        for (int i=0; i<1000000; i++){ 
            lList.add(Integer.toString(i));
        }
        long end1 = System.currentTimeMillis();
        
        //time calculations
        long aTime = end0-start0;
        long lTime = end1-start1;
        
        if(aTime>lTime){
            long difA= aTime-lTime;
            System.out.println("The Array List was faster by ");
            return difA;
        }else if (aTime<lTime){
            long difL= lTime-aTime;
            System.out.println("The Linked List was faster by ");
            return difL;
        }else {
            System.out.println("The Array List and Linked List took the same amount of time.");
            return aTime;
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
