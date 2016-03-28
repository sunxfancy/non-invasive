package org.sxf;

/**
 * The class will used to modify the Target Class
 * Created by sxf on 3/28/16.
 */
public class Target2 extends Target {
    public Target2() {
        System.out.println("Target2 has constructed.");
    }

    @Override
    public void Work() {
        super.Work();
        hello();
        System.out.println("Target changed!");
    }

    public void hello() {
        System.out.println("Hello");
    }
}
