package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        for (Map.Entry<Integer, Integer> entry : functionMap.entrySet()) {
            if (entry.getValue() == requiredValue){
                return true;
            }
        }
        return false;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer,Integer> map = new HashMap<>();
        int value = 0;
        for (int i = 0; i < sourceList.size(); i++) {
            value = 5 * sourceList.get(i) +2;
            map.put(sourceList.get(i),value);
        }
        return map;
    }
}
