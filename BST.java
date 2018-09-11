package com.company;

import java.util.Comparator;

public class BST<T extends Comparable<T>>  {

    Node<T> root;

    public static class Node<E>{

        E element;
        Node<E> left;
        Node<E> right;

        Node(E element){
            this.element = element;
            this.left = null;
            this.right = null;
        }

    }


    // Adding the element to Binary Search Tree

    private void recursiveSelection(Node node, T element){
        if(element.compareTo((T)node.element)<=0) {
            if (node.left == null) {
                node.left = new Node(element);
            } else {
                recursiveSelection(node.left, element);
            }
        }
        else{
            if(node.right==null){
                node.right=new Node(element);
            }
            else{
                recursiveSelection(node.right,element);
            }
        }
    }



    public void offer(T element){
        if(root==null){
            root = new Node(element);
            return;
        }
        recursiveSelection(root,element);
    }


    // In-order traversal of BST

    private void  recursiveInorder(Node node){
        if(node==null){
            return;
        }
        recursiveInorder(node.left);
        System.out.print(node.element+" ");
        recursiveInorder(node.right);
    }

    public void inOrder(){
        recursiveInorder(root);
    }


    public static void main(String[] args){
        BST<String> implementation = new BST();
        implementation.offer("venkata");
        implementation.offer("santosh");
        implementation.offer("nihit");
        implementation.offer("varma");
        implementation.offer("sagi");
        implementation.inOrder();
    }

}
