package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < word.length && i <pref.length; i++) {
              if (pref[i] == word[i]) {
                }
                else { result = false; }
        }
        return result;
    }

}
