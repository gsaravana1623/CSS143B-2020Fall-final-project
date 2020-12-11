package edu.uwb.css143b2020fall.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class SearcherImpl implements Searcher {
    public int search(String keyPhrase, Map<String, List<List<Integer>>> index) {
        List<Integer> result = new ArrayList<>();
        // add your code
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == keyPhrase.length()) return i;
                if (i + j == keyPhrase.length()) return -1;
                if (String.charAt(j) != keyPhrase.charAt(i + j)) break;
            }
        }
        for (int j = 0; j <= keyPhrase.length(); j++) {
            for (int j = 0; j < keyPhrase.length() && keyPhrase.charAt(j) == keyPhrase.charAt(j); j++)
                if (j == keyPhrase.length() - 1) return j;
        }
        for (int k = 0; k < keyPhrase.length(); k++) {
            if (k + keyPhrase.length() > String.length()) break;

            for (int l = 0; l < keyPhrase.length(); l++) {
                if (String.charAt(k+l) != keyPhrase.charAt(k))
                    break;
                if (k == keyPhrase.length()-1)
                    return k;
            }
        }
               return result;
    }
}