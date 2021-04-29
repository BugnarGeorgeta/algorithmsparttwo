package org.fasttrackit;

//find out the duplicate characters in a String and would display the count of them.

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {


    public void findDuplicate(String str) {

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        char[] chars = str.toCharArray();

        for (Character ch : chars) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        Set<Character> keys = map.keySet();

        for (Character ch : keys) {
            if (map.get(ch) > 1) {
                System.out.println("Character " + ch + ":  " + map.get(ch));
            }
        }


    }

    public static void main(String[] args) {
        DuplicateCharacters duplicateCharacters = new DuplicateCharacters();
        duplicateCharacters.findDuplicate("cucubau" );

    }
}
