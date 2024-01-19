package org.example;

public class Main {

    public static int[] problem1 (int[] nums,int n){
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == n)
                    return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }

    public static boolean problem2 (int n) {
        if (n < 0) {
            return false;
        }
        int i = 0;
        while ( n > 0){
            i = i * 10 + n % 10;
            n /= 10;
        }
        if ( n != i){
            return false;
        }
        return true;
    }

    public static String problem3 (String[] words){

        int size = words.length;
        int i = 0;
        int j = 0;
        String prefix="";
        while ( i < size-1){
            i++;
            if (words[i].charAt(j) == words[i+1].charAt(j));
            prefix += words[0].charAt(j);
        }
        return prefix;
    }
    }


