package oleg_solutions.trees.tests;

import oleg_solutions.trees.bfs.ZigZagLevelOrderTraversal;
import oleg_solutions.trees.support.TreeFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZigZagLevelOrderTraversalTest {

    @Test
    void ZigZagLevelOrderTraversalTest1() {
        var root = TreeFactory.getTree1();
        var depth = ZigZagLevelOrderTraversal.solution(root);
    }
}