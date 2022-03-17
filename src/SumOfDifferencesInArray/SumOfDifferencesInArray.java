package SumOfDifferencesInArray;
import java.util.Arrays;
import java.util.Comparator;
/*
Your task is to sum the differences between consecutive pairs in the array in descending order.
For example:
sumOfDifferences([2, 1, 10])
Returns 9
Descending order: [10, 2, 1]
Sum: (10 - 2) + (2 - 1) = 8 + 1 = 9
If the array is empty or the array has only one element the result should be 0 (Nothing in Haskell).
 */

public class SumOfDifferencesInArray {
    public static int sumOfDifferences(int[] arr) {
        int[] newArray = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(x -> x)
                .toArray();

        if(newArray == null || newArray.length == 0){
            return 0;
        } else return newArray[0]-newArray[newArray.length-1];
    }
}
