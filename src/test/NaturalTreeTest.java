import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import christmastree.NaturalTree;

public class NaturalTreeTest {

    private static NaturalTree tree1;
    private stattic NaturalTree tree2;

    @BeforeClass
    public static void setupBeforeClass() {


        tree2 = new NaturalTree("naturel",23.8,"jaune","pin",6);
    }

    @Test
    public void constructStandard() {
        tree1 =new NaturalTree();
        assertEquals(tree1.getLifeTime(),50);
    }

    @Test
    public void getDescriptionPersonnalise() {
        assertEquals(tree2.getTreeType(),"pin");
    }

    @Test
    public void getToString() {
        assertEquals(tree2.toString()," NaturalTree{ TreeType: pin, lifetime=6 }");
    }

}