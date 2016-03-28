package org.sxf;

/**
 * Target class
 * Created by sxf on 3/28/16.
 */
public class Target extends Base {
    public Target() {
        super();
        System.out.println("Target class construct.");
    }

    @Override
    public void Work() {
        System.out.println("Target work run");
    }
}
