package oleg_solutions.trees.tests;

import oleg_solutions.trees.dfs.MinDepthOfBinaryTreeRec;
import oleg_solutions.trees.support.TreeFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinDepthOfBinaryTreeRecTest {

    @Test
    void maxDepthTest() {
        var root = TreeFactory.getTree1();
        var depth = MinDepthOfBinaryTreeRec.solution(root);
    }
}