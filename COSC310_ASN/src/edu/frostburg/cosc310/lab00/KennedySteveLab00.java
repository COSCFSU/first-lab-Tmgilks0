/*
 * Steve Kennedy
 * Sept x, 20xx
 * 
 * Please put your name, date, and brief description of this class here.
 */
package edu.frostburg.cosc310.lab00;

/**
 * Your documentation should begin here.
 * @author SteveK
 */
public class KennedySteveLab00 implements Lab00 {

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
    
}
