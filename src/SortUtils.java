import java.util.ArrayList;
import java.util.Random;
/** Static methods for aiding in the creation of sorting algorithms */
public class SortUtils
{
    /** Add static int that counts memory accesses*/

    /** Add static int that counts comparisons */

    /** Add public static getters and setters for both 
     /** Checks if an array of integers is non-descending order */
    public static boolean isSorted(ArrayList<Integer> intArr)
    {
        int previous = intArr.get(0);
        for (int num : intArr) {
            if (num < previous) {
                return false;
            }
            previous = num;
        }
        return true;
    }
    /** Checks if an array of String is non-descending order */
    public static boolean isSortedStr(String[] strArr)
    {
        String previous = strArr[0];
        for (String string : strArr) {
            if (string.compareTo(previous) < 0) {
                return false;
            }
            previous = string;
        }
        return true;
    }
    /** Creates a random ArrayList of Strings of a given length */
    public static Integer[] randomIntAL(Integer[] intArr)
    {
        Integer[] randomList = new Integer[intArr.length];
        for (int i = 0; i < randomList.length; i++) {
            int randomNum = (int) (Math.random() * 10 + 1);
            randomList[i] = randomNum;
        }
        return randomList;
    }
    /** Creates a random ArrayList of Integers of a given length */
    public static String[] randomStrAL(String[] strArr)
    {
        String[] randomList = new String[strArr.length];
        for (int i = 0; i < randomList.length; i++) {
            Random r = new Random();
            String randomString = "";
            for (int j = 1; j < 6; j++) {
                char c = (char)(r.nextInt(26) + 'a');
                randomString += c;
            }
            randomList[i] = randomString;
        }
        return randomList;
    }
    /** Creates a random ArrayList of Strings of a given length */
    public static ArrayList<Integer> randomIntAL(ArrayList<Integer> intArr)
    {
        ArrayList<Integer> randomList = new ArrayList();
        for (int i = 0; i < intArr.size(); i++) {
            int randomNum = (int) (Math.random() * 10 + 1);
            randomList.add(randomNum);
        }
        return randomList;
    }
    /** Creates a random ArrayList of Integers of a given length */
    public static ArrayList<String> randomStrAL(ArrayList<String> strArr)
    {
        ArrayList<String> randomList = new ArrayList();
        for (int i = 0; i < strArr.size(); i++) {
            Random r = new Random();
            String randomString = "";
            for (int j = 1; j < 6; j++) {
                char c = (char)(r.nextInt(26) + 'a');
                randomString += c;
            }
            randomList.add(randomString);
        }
        return randomList;
    }
}