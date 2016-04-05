package fibonaccittree;

import org.junit.Test;

import static fibonaccittree.FibonacciTree.nodes;
import static org.junit.Assert.assertEquals;

public class FibonacciTreeTest {

    @Test
    public void testSingleNode() {
        assertEquals(1, nodes(0));
        assertEquals(1, nodes(1));
    }

    @Test
    public void testTwoNodes() {
        assertEquals(3, nodes(2));
    }

    @Test
    public void tesFiveNodes() {
        assertEquals(5, nodes(3));
    }

    @Test
    public void tesNineNodes() {
        assertEquals(9, nodes(4));
    }

    @Test
    public void tesMoreNodes() {
        assertEquals(41, nodes(7));
    }

    @Test
    public void tesLotsOfNodes() {
        assertEquals(369101177, nodes(79));
    }

    @Test
    public void tesLotsLotsOfNodes() {
        //System.out.println(nodes(10000000));
    }

}
