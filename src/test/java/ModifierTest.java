import org.junit.Test;
import org.sxf.*;

import java.lang.reflect.InvocationTargetException;

public class ModifierTest {

    @Test
    public void testModifyClass() {
        System.out.println("Before");
        new App().run();

        Modifier m = new Modifier();
        m.ModifyClass("org.sxf.Target", "org.sxf.Target2");

        System.out.println("\nAfter\n");
        Class c = m.loadClass("org.sxf.App");

        Object app = null;
        try {
            app = c.newInstance();
            c.getMethod("run").invoke(app);

        } catch (InstantiationException | IllegalAccessException
                | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }

}