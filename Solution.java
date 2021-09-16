import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        double ones = 0;
        double zeros = 0;
        double negs = 0;
        for(int temp:arr){
            if (temp<0) {
                negs += 1;
            }else if(temp>0) {
                ones += 1;
            }else{
                zeros += 1;
            }
        }
        int total = (int)(ones + zeros + negs);
        ones = ones / total;
        zeros = zeros / total;
        negs = negs / total;
        System.out.println(ones);
        System.out.println(negs);
        System.out.println(zeros);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
