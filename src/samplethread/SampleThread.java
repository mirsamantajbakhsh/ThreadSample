/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplethread;

/**
 *
 * @author Mir Saman Tajbakhsh
 */
public class SampleThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ThreadClass Hello = new ThreadClass("Hello", true);
        ThreadClass World = new ThreadClass("World", false);
        
        Hello.startThread();
        World.startThread();
    }
    
}
