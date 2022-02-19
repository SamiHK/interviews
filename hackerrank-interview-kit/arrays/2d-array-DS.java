
import java.util.*;

class Result {

    /*
     * Question: calculate largest sum of hourglasses in a [6]x[6] array 
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
        Integer xLen = (arr.get(0).size())-3;
            Integer yLen = xLen;
            Integer maxSum = Integer.MIN_VALUE;        
            for(int i = 0; i <= xLen; i++){
                for(int j = 0; j<=yLen; j++){
                    Integer sum = 0;
                    sum += (arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2));
                    sum += (arr.get(i+1).get(j+1));
                    sum += (arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2)); 
                    maxSum = Math.max(maxSum, sum);
                }
            }
            return maxSum;
    }


    public static void main(String[] args){

        Integer[] numbers = {-9,-9,-9,1,1,1};
		List<Integer> list = Arrays.asList(numbers);

        List<List<Integer>> lists = new ArrayList<>();
        lists.add(list);
        lists.add(list);
        lists.add(list);
        lists.add(list);
        lists.add(list);
        lists.add(list);

        System.out.println(hourglassSum(lists));
    }
}