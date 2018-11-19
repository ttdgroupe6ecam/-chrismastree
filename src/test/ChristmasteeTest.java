import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import christmastree.ChrismasTree;

public class ChristmasteeTest {

    private static ChrismasTree tree;

  @BeforeClass
  public static void setupBeforeClass() {

      tree.setDescritpion("test");
      tree.setPrice(15.3);
      tree.setColor("rouge");
  }

        @Test
        public void testDescription() {

            assertEquals(tree.getDescritpion(),"test");
        }

        @Test
        public void testName() {

            assertEquals(tree.getPrice(),15.3);
        }

        @Test
        public void testSurname() {

            assertEquals(tree.getColor(),"rouge");
        }

}
