package com.jainn;

/**
 * Created by nj on 11/24/18.
 */
public class QueryStringInputString {

    private static int[] matchingStrings(String[] strings, String[] queries) {
        int[] output = new int[queries.length];
        int j = 0;
        for(String query: queries){
            int count = 0;
            for(int i=0; i<strings.length; i++){
                if(query.equals(strings[i])) count++;
            }
            output[j] = count;
            j++;
        }
        return output;
    }

    public static void main(String[] args){
        String[] strings = {"aba","baba","aba","xzxb"};
        String[] queries = {"aba","xzxb","ab"};
        int[] b = matchingStrings(strings,queries);
        for(int element: b){
            System.out.println(element);
        }
    }
}
