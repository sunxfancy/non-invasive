package org.sxf;
import javassist.*;

import java.io.IOException;

/**
 * Modifier based on Javassist
 * Created by sxf on 3/28/16.
 */
public class Modifier {
    protected ClassPool pool;
    protected Loader cl;

    public Modifier() {
        pool = ClassPool.getDefault();
        cl = new Loader(pool);
    }

    public void ModifyClass(String origClass, String targetClass) {
        try {
            CtClass cc = pool.get(origClass);
            CtClass cc2 = pool.get(targetClass);
            cc.setName(origClass + "_orig");
            cc2.stopPruning(true);
            cc2.setSuperclass(cc); // change the superclass and the constructor
            // important! This changed all the class name in it
            cc2.replaceClassName(origClass, origClass + "_orig");
            cc2.setName(origClass); // must be added at the end

        } catch ( CannotCompileException | NotFoundException e) {
            e.printStackTrace();
        }
    }

    public Class loadClass(String s) {
        try {
            return cl.loadClass(s);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }



}
