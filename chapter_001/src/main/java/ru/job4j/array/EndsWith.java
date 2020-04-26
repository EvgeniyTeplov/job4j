package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int i = 0;
        int j = 0;
        for (i = post.length - 1, j = post.length - 1; i == j; i--, j--) {
          //  for (int j = post.length-1; j > 0; j--) {
            if (word[i] == post[i] ) {
                    //if (i == 0) {
                  //      break;
                 //   }
                } else {
                    result = false;
                }
            }
        return result;
    }
}
