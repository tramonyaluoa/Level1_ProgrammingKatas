import java.util.*;
public class LongestStringsinArray {

    static ArrayList<String> longestStringsinArray(String[] longString) {

        ArrayList<String> list = new ArrayList<String>();

        String longest = longString[0];


        int longestLength = longest.length();

        for(int i = 0; i < longString.length; i++ ){
            if (longString[i].length() > longestLength) {
                list.clear();
                longestLength = longString[i].length();            //longest string
                longest = longString[i];
                list.add(longString[i]);
            }
            if (longString[i].length() == longestLength) {
                longestLength = longString[i].length();
                longest = longString[i];
                list.add(longString[i]);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        String [] longestStrings = {"once", "upon", "a", "time"};
        System.out.println("The Longest word(s) of the Array {\"once\", \"upon\", \"a\", \"time\"} are :\n"+longestStringsinArray(longestStrings));
    }
}