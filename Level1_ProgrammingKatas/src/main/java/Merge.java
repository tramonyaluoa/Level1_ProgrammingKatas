import java.util.Arrays;
public class Merge {

    public static void main(String[] args) {
        int[] array1 = {11, 22, 33};
        int[] array2 = {1, 2, 3};
        int[] merge = new int[array1.length + array2.length];


        for (int i = 0; i < array1.length; i++) {
            merge[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            merge[i + array1.length] = array2[i];

        }
        Arrays.sort(merge);
        System.out.println(Arrays.toString(merge));
    }
}
