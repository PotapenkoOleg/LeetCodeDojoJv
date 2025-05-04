package oleg_solutions.trees.tests;

import oleg_solutions.trees.bfs.BFS;
import oleg_solutions.trees.support.TreeFactory;
import org.junit.jupiter.api.Test;

class BFSTest {

    @Test
    void BFSTest() {
        var root = TreeFactory.getTree1();
        BFS.printNodes(root);
    }
}