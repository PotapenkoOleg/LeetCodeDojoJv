package oleg_solutions.trees.tests;

import oleg_solutions.trees.dfs.RecoursiveDFS;
import oleg_solutions.trees.support.TreeFactory;
import org.junit.jupiter.api.Test;

class RecursiveDFSTest {

    @Test
    void preorderDFSTest() {
        var root = TreeFactory.getTree1();
        RecoursiveDFS.preorderDFS(root);
    }

    @Test
    void inorderDFSTest() {
        var root = TreeFactory.getTree1();
        RecoursiveDFS.inorderDFS(root);
    }

    @Test
    void postorderDFSTest() {
        var root = TreeFactory.getTree1();
        RecoursiveDFS.postorderDFS(root);
    }
}