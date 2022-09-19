package TidyNumber;

public class TidyNumber
{
    public static boolean tidyNumber(int number)
    {
        boolean result = true;
        char[] chars = ("" +number).toCharArray();
        for(int i = 0; i < chars.length-1; i++){
            if (chars[i]>chars[i+1]){
                result = false;
            }
        }
        return result;
    }
}