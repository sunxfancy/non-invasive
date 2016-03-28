package org.sxf;

/**
 * Main Class
 * Created by sxf on 3/28/16.
 */
public class App {
    public static void main(String[] args) {
        new App().run();
    }

    public void run() {
        Base b = new Base(); b.Work();
        Target t = new Target(); t.Work();
        Children c = new Children(); c.Work();
    }
}
