import org.junit.Test;
import org.sxf.Base;
import org.sxf.Children;
import org.sxf.Modifier;
import org.sxf.Target;

import static org.junit.Assert.*;

public class ModifierTest {

    @Test
    public void testModifyClass() throws Exception {
        System.out.println("Before");

        Base b = new Base(); b.Work();
        Target t = new Target(); t.Work();
        Children c = new Children(); c.Work();

        Modifier m = new Modifier();
        m.ModifyClass("org.sxf.Target", "org.sxf.Target2");

        System.out.println("After");

        Base b2 = new Base(); b2.Work();
        Target t2 = new Target(); t2.Work();
        Children c2 = new Children(); c2.Work();
    }

}