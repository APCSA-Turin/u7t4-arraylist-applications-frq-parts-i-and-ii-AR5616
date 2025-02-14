package com.example.project.WordPair;

import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs;

    public WordPairList(String[] words) {
        ArrayList<WordPair> allPairs = new ArrayList<WordPair>();
        this.allPairs = allPairs;
        int index = 0;
        for (int i = index; i < words.length ; i++) {
            for (int j = index + 1; j < words.length; j++) {
                WordPair pair = new WordPair(words[index], words[j]);
                allPairs.add(pair);
            }
            index++;
        }
    }

    // The method below was added for testing;
    // it was not part of the original FRQ
    public ArrayList<WordPair> getAllPairs() {
        return allPairs;
    }

    public int numMatches() {
        int count = 0;
        for (int i = 0; i < allPairs.size(); i++) {
            if (allPairs.get(i).getFirst().equals(allPairs.get(i).getSecond())) {
                count++;
            }
        }
        return count;
    }

    // The method below was added for testing;
    // it was not part of the original FRQ
    public String toString() {
        return allPairs.toString();
    }
}
