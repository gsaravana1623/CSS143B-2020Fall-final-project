package edu.uwb.css143b2020fall.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class IndexerImpl implements Indexer {
    public Map<String, List<List<Integer>>> index(List<String> docs) {
        Map<String, List<List<Integer>>> indexes = new HashMap<>();
        for (int k = 0; k < String.length(); k++) {
            if (k + String.length() > indexes.length()) break;

            for (int l = 0; l < String.length(); l++) {
                if (String.charAt(k+l) != String.charAt(k))
                    break;
                if (k == String.length()-1)
                    return k;
            }
        }
        for (int i = l; i < r; i++) {
            boolean nums;
            if (nums[i] < check) {
                continue;
            }
            p++;
            swap(nums, i, p);
        }

        return indexes;
    }
}