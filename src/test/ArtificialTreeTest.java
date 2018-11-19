import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import christmastree.ArtificialTree;

public class ArtificialTreeTest {

    private static ArtificialTree tree1;
    private static ArtificialTree tree2;

    @BeforeClass
    public static void setupBeforeClass() {


        tree2 = new ArtificialTree("artificiel",23.8,"jaune","bisphenolA");
    }

    @Test
    public void constructStandard() {
        tree1 =new ArtificialTree();
        assertEquals(tree1.getPlasticType(),"plasticType: bisphenolA");
    }



    @Test
    public void getToString() {
        assertEquals(tree2.toString()," ArtificialTree{plasticType: bisphenolA}");
    }

}