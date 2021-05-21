import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class FindKthMaxMin {
    public static void main(String[] args) {
        int n,k;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] ar = new int[n];

        for(int i=0; i<n; i++) {
            ar[i] = sc.nextInt();
        }

        k = sc.nextInt();

        //create heap
        //for minimum element create max heap
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        //by default min heap, so convert to max heap
        for(int i:ar) {
            q.add(i);
            //remove element if q size > k
            if(k < q.size()) q.poll();
        }
        //complexity - O(nlogk)
        System.out.println(q.peek());
    }
}
