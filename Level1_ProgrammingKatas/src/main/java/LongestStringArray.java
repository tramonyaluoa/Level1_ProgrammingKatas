public class LongestStringArray {
    public static String getLongestStringInArray(String[] array) {
        int maxLength = 0;
        String longestStringInArray = null;
        for (String a : array) {                    //array of strings
            if (a.length() > maxLength) {
                maxLength = a.length();
                longestStringInArray = a;
            }
        }
        return longestStringInArray;
    }

    public static void main(String[] args) {
        String[] Strings = {"the longest Systems Development", "Stringify", "Umuzi-org", "Teboho Ramonyaluoa"};
        String longString = getLongestStringInArray(Strings);
        System.out.printf("The longest string in the array is : '%s'\n",longString );
    }
}
