package oleg_solutions.trees.support;

public class TreeFactory {
    public static TreeNode getTree1() {
        var root = new TreeNode(3);
        var left1 = new TreeNode(5);
        var right2 = new TreeNode(1);
        root.left = left1;
        root.right = right2;
        var left3 = new TreeNode(6);
        var right4 = new TreeNode(2);
        left1.left = left3;
        left1.right = right4;
        var left5 = new TreeNode(7);
        var right6 = new TreeNode(4);
        right4.left = left5;
        right4.right = right6;
        var left7 = new TreeNode(0);
        var right8 = new TreeNode(8);
        right2.left = left7;
        right2.right = right8;
        return root;
    }
}
