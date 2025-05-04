package oleg_solutions.trees.tests;

import oleg_solutions.trees.dfs.IterativeDFS;
import oleg_solutions.trees.support.TreeFactory;
import org.junit.jupiter.api.Test;

class IterativeDFSTest {

    @Test
    void maxDepthTest() {
        var root = TreeFactory.getTree1();
        var depth = IterativeDFS.maxDepth(root);
    }
}