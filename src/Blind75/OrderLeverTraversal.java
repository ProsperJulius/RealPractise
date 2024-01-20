package Blind75;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class OrderLeverTraversal {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> nodeQueue = new LinkedList<>();
        List<List<Integer>> results = new ArrayList<>();
        if (root == null) {
            return results;
        }
        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()) {
            int size = nodeQueue.size();
            List<Integer> levelNodes = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode treeNode = nodeQueue.poll();

                levelNodes.add(treeNode.val);

                if (treeNode.left != null) {
                    nodeQueue.add(treeNode.left);
                }

                if (treeNode.right != null) {
                    nodeQueue.add(treeNode.right);
                }

            }
            results.add(levelNodes);
        }
        return results;

    }

    public List<Double> averageOfLevels(TreeNode root) {

        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        List<Double> results = new ArrayList<>();
        if (root == null) return new ArrayList<>();
        treeNodeQueue.add(root);
        while (!treeNodeQueue.isEmpty()) {

            int size = treeNodeQueue.size();
            double sum = 0;
            List<Double> interResult = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = treeNodeQueue.poll();
                sum+= node.val;
                if (node.left != null) {
                    treeNodeQueue.add(node.left);
                }

                if (node.right != null) {
                    treeNodeQueue.add(node.right);
                }
            }
            results.add(sum/size);

        }



        return results;


    }

}
