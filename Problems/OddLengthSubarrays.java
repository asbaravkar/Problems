package Problems;

public class OddLengthSubarrays {
    public static int sumOddLengthSubarrays(int[] arr) {
        int answer = 0;
        int len = arr.length;
        // nums   1  4  2  5  3
        // start  5  4  3  2  1
        // end    1  2  3  4  5
        // total  5  8  9  8  5 (start * end)
        // oddlen 3  4  5  4  3 (ceil(total/2))
        // ans    3  16 10 20 9 (nums * oddlen) --> 58

        for(int i=0; i<len; i++)
        {
            int startTimes = len-i;
            int endTimes = i+1;
            int total = startTimes * endTimes;
            int oddTimes = total/2;
            if(total%2 == 1) oddTimes++;
            answer += oddTimes * arr[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,4,2,5,3};
        //len-1 : 1+4+2+5+3 = 15
        //len-3 : (1+4+2)+(4+2+5)+(2+5+3) = 28
        //len-5 : 1+4+2+5+3 = 15
        //total : 58
    }
}
