package cpe211.secondexamination.reyes;

import java.util.ArrayList;

class Node {
    String word;
    int counter;
    Node left;
    Node right;
    
    Node(String w) {
        word = w;
        counter = 1;
        left = null;
        right = null;
    }
}

public class Algo {
    
    Node root;
    
    public Algo() {
        root = null;
    }
    
    public void insert(String word) {
        root = insertNode(root, word);
    }
    
    Node insertNode(Node node, String word) {
        if (node == null) {
            return new Node(word);
        }
        
        if (word.compareTo(node.word) < 0) {
            node.left = insertNode(node.left, word);
        } else if (word.compareTo(node.word) > 0) {
            node.right = insertNode(node.right, word);
        } else {
            node.counter++;
        }
        
        return node;
    }
    
    public ArrayList<String> getUniqueWords() {
        ArrayList<String> list = new ArrayList<>();
        traverse(root, list);
        return list;
    }
    
    public ArrayList<String> getUniqueWordsPreOrder() {
        ArrayList<String> listPre = new ArrayList<>();
        doPreOrderStuff(root, listPre);
        return listPre;
    }
    
    public ArrayList<String> getUniqueWordsPostOrder() {
        ArrayList<String> listPost = new ArrayList<>();
        doPostOrderStuff(root, listPost);
        return listPost;
    }
     
    void traverse(Node node, ArrayList<String> list) {
        if (node != null) {
            traverse(node.left, list);
            if (node.counter == 1) {
                list.add(node.word);
            }
            traverse(node.right, list);
        }
    }

    void doPreOrderStuff(Node currentNode, ArrayList<String> myList) {
        if (currentNode == null) {
            return;
        }

        if (currentNode.counter == 1) {
            String wordToAdd = currentNode.word;
            myList.add(wordToAdd);
        }

        if (currentNode.left != null) {
            doPreOrderStuff(currentNode.left, myList);
        }

        if (currentNode.right != null) {
            doPreOrderStuff(currentNode.right, myList);
        }
    }

    void doPostOrderStuff(Node currentNode, ArrayList<String> myList) {
        if (currentNode == null) {
            return;
        }

        if (currentNode.left != null) {
            doPostOrderStuff(currentNode.left, myList);
        }

        if (currentNode.right != null) {
            doPostOrderStuff(currentNode.right, myList);
        }

        if (currentNode.counter == 1) {
            String wordToAdd = currentNode.word;
            myList.add(wordToAdd);
        }
    }
}
