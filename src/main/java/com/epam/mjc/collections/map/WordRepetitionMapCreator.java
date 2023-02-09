package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String ,Integer> map = new LinkedHashMap<>();
        if (sentence.length()==0) return map;
        String s1 = sentence.toLowerCase(Locale.ROOT);
        String[] s = s1.split("[ .,]+");
        for (String value : s) {
            if (map.containsKey(value)) {
                map.put(value,map.get(value)+1);
            }else {
                map.put(value,1);
            }
        }
        return map;
    }
}
