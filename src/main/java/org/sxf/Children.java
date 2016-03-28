package org.sxf;

/**
 * Children class
 * Created by sxf on 3/28/16.
 */
public class Children extends Target {
    public Children () {
        System.out.println("Children construct");
    }

    @Override
    public void Work() {
        System.out.println("Children work run.");
    }
}
