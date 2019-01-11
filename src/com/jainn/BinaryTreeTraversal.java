package com.jainn;



    class Node1 {
        int key;
        Node1 left , right;

        public Node1(int item){
            this.key = item;
            left = right = null;
        }
    }

    class BinaryTreeTraversal {

        Node1 root;

        public BinaryTreeTraversal() {
            root = null;
        }

        //Inorder
        private void TraverseInorder(Node1 node) {
            if (node == null)
                return;

            TraverseInorder(node.left);
            System.out.print(node.key + " ");
            TraverseInorder(node.right);
        }

        //Preorder
        private void TraversePreorder(Node1 node) {
            if (node == null)
                return;

            System.out.print(node.key + " ");
            TraversePreorder(node.left);
            TraversePreorder(node.right);
        }

        //Postorder
        private void TraversePostorder(Node1 node) {
            if (node == null)
                return;

            TraversePostorder(node.left);
            TraversePostorder(node.right);
            System.out.print(node.key + " ");
        }

        public void TraverseInorder() {
            TraverseInorder(root);
        }

        public void TraversePreorder() {
            TraversePreorder(root);
        }

        public void TraversePostorder() {
            TraversePostorder(root);
        }


        public static void main(String[] args) {
            BinaryTreeTraversal tree = new BinaryTreeTraversal();
            tree.root = new Node1(1);
            tree.root.left = new Node1(2);
            tree.root.right = new Node1(3);
            tree.root.left.left = new Node1(4);
            tree.root.left.right = new Node1(5);

            System.out.println("Preorder traversal of binary tree is ");
            tree.TraversePreorder();

            System.out.println("\nInorder traversal of binary tree is ");
            tree.TraverseInorder();

            System.out.println("\nPostorder traversal of binary tree is ");
            tree.TraversePostorder();
        }
    }
