package com.trees;

import java.util.ArrayList;
import java.util.List;

public class CheckIfTwoBinaryTreesAreIdentical {

    public static void main(String[] args) {
        final TreeNode leaf1 = new TreeNode(3, null, null);
        final TreeNode leaf2 = new TreeNode(4, null, null);
        final TreeNode leaf3 = new TreeNode(7, null, null);
        final TreeNode leaf4 = new TreeNode(8, null, null);

        final TreeNode leftNodeFirst = new TreeNode(5, leaf1, leaf2);
        final TreeNode rightNodeFirst = new TreeNode(6, leaf3, leaf4);
        final TreeNode rootFirst = new TreeNode(1, leftNodeFirst, rightNodeFirst);

        final TreeNode leftNodeSecond = new TreeNode(5, leaf1, leaf2);
        final TreeNode rightNodeSecond = new TreeNode(6, leaf3, leaf4);
        final TreeNode rootSecond = new TreeNode(1, leftNodeSecond, rightNodeSecond);

        final TreeNode leaf5 = new TreeNode(13, null, null);
        final TreeNode leftNodeThird = new TreeNode(5, leaf5, leaf2);
        final TreeNode rightNodeThird = new TreeNode(6, leaf3, leaf4);
        final TreeNode rootThird = new TreeNode(1, leftNodeThird, rightNodeThird);

        System.out.println("ARE BINARY TREES IDENTICAL "+ areIdenticalTrees(rootFirst, rootSecond));
        System.out.println("ARE BINARY TREES IDENTICAL "+ areIdenticalTrees(rootSecond, rootFirst));
        System.out.println("ARE BINARY TREES IDENTICAL "+ areIdenticalTrees(rootFirst, rootThird));
    }

    private static boolean areIdenticalTrees(final TreeNode root1, final TreeNode root2) {
        final List<TreeNode> firstPreOrderTraversal = new ArrayList<>();
        final List<TreeNode> secondPreOrderTraversal = new ArrayList<>();
        performPreOrderTraversal(root1, firstPreOrderTraversal);
        performPreOrderTraversal(root2, secondPreOrderTraversal);
        for (int i = 0; i < firstPreOrderTraversal.size(); i++) {
            if (secondPreOrderTraversal.get(i).getData() != firstPreOrderTraversal.get(i).getData()) {
                return false;
            }
        }
        return true;
    }

    private static void performPreOrderTraversal(final TreeNode root, final List<TreeNode> result) {
        if (root == null) {
            return;
        }
        result.add(root);
        performPreOrderTraversal(root.getLeft(), result);
        performPreOrderTraversal(root.getRight(), result);
    }
}
