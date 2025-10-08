package cpe211.secondexamination.reyes;

import static kvx.jcandyexamedition.Std.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

// main
public class Reyes_SecondExamination {
    public static void main( String[] args ) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        clear();
        printf("> ");
        String input = in.readLine();
        String cleaned = input.replaceAll("[.,?!]", " ");
        
        String[] words = cleaned.split(" ");
        
        Algo bst = new Algo();

        for (int i = 0; i < words.length; i++) {
            String w = words[i].trim();
            if (w.length() > 0) {
                bst.insert(w.toLowerCase());
            }
        }

        ArrayList<String> preOrderWords = bst.getUniqueWordsPreOrder();
        ArrayList<String> inOrderWords = bst.getUniqueWords();
        ArrayList<String> postOrderWords = bst.getUniqueWordsPostOrder();

        int maxRows = Math.max(Math.max(preOrderWords.size(), inOrderWords.size()), postOrderWords.size());

        for (int i = 0; i < maxRows; i++) {
            String pre = (i < preOrderWords.size()) ? preOrderWords.get(i) : "";
            String inOrder = (i < inOrderWords.size()) ? inOrderWords.get(i) : "";
            String post = (i < postOrderWords.size()) ? postOrderWords.get(i) : "";
            
            printf("%-16s%-16s%-16s%n", pre, inOrder, post);
        }
        
        in.close();
    }
}
