package Problems;

import java.util.HashMap;

public class ContiguousArray {
    static int contiguousArray(int[] a)
    {
        int res = 0;
        int sum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, -1);

        //treat 0 as -1
        for(int i=0; i<a.length; i++)
        {
            if(a[i] == 0) sum += 1;
            else if(a[i] == 1) sum -= 1;

            //store sum in map
            //if found same sum then get index from map and subtract from current
            if(hm.containsKey(sum))
            {
                int len = i - hm.get(sum);
                if(len > res) res = len;
            }
            else hm.put(sum, i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = new int[]{0,0,1,0,1,0,1,1,0,0,1,1,1};
        System.out.println(contiguousArray(a));
    }
}
