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
public class ThreadClass implements Runnable {

    Thread t;
    String tName;
    boolean Hello;

    public ThreadClass(String ThreadName, boolean Hello) {
        tName = ThreadName;
        this.Hello = Hello;
        t = new Thread(this, getName());
    }

    @Override
    public void run() {
        while (true) {
            if (Hello) {
                System.out.println(getName() + " thread -> Hello");
            } else {
                System.out.println(getName() + " thread -> World");
            }
        }
    }

    private String getName() {
        return tName;
    }

    public void startThread() {
        t.start();
    }
}
