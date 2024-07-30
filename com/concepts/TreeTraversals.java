package com.concepts;

class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class TreeTraversals {
    public static int closest = Integer.MAX_VALUE;

    public static void main(String[] args) {
        BinaryTree root = GetBinaryTree();
        System.out.print("Inorder Traversal : ");
        inorder(root);
        System.out.println();

        System.out.print("Preorder Traversal : ");
        preorder(root);
        System.out.println();

        System.out.print("Postorder Traversal : ");
        postorder(root);
        System.out.println();

        int target = 12;
        int result = closestViaInorder(root, target);
        System.out.println("Closest value to Target '" + target + "' is => '" + result + "'");
    }

    private static void inorder(BinaryTree root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
    }

    private static void preorder(BinaryTree root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        preorder(root.left);
        preorder(root.right);
    }

    private static void postorder(BinaryTree root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value + " ");
    }

    private static int closestViaInorder(BinaryTree root, int target) {
        if (root == null) {
            return closest;
        }

        closestViaInorder(root.left, target);
        if (Math.abs(target - root.value) < Math.abs(target - closest)) {
            closest = root.value;
        }
        closestViaInorder(root.right, target);
        return closest;
    }

    public static int GetClosestValue(BinaryTree tree, int target, int closest) {
        if (Math.abs(target - tree.value) < Math.abs(target - closest)) {
            closest = tree.value;
        }

        if (tree.value > target && tree.left != null) {
            return GetClosestValue(tree.left, target, closest);
        } else if (tree.value < target && tree.right != null) {
            return GetClosestValue(tree.right, target, closest);
        } else {
            return closest;
        }
    }

    static private BinaryTree GetBinaryTree() {
        BinaryTree root = new BinaryTree(10);
        root.left = new BinaryTree(5);
        root.right = new BinaryTree(15);
        root.left.left = new BinaryTree(2);
        root.left.right = new BinaryTree(5);
        root.right.left = new BinaryTree(13);
        root.right.right = new BinaryTree(22);
        root.left.left.left = new BinaryTree(1);
        root.right.left.right = new BinaryTree(14);

        return root;
    }
}
