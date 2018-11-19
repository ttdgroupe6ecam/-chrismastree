import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import christmastree.ChrismasTree;

public class ChristmasteeTest {

    private static ChrismasTree tree;


    @Test
    public void testDescription() {
        tree.setDescritpion("test");
        assertEquals(tree.getDescritpion(),"test");
    }

    @Test
    public void testName() {
        tree.setPrice(15.3);
        assertEquals(tree.getPrice(),15.3);
    }

    @Test
    public void testSurname() {
        tree.setColor("rouge");
        assertEquals(tree.getColor(),"rouge");
    }

}
