import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static java.util.Arrays.*;
import java.util.Arrays;

public class ArrayManipulation {

    public static void main(String[] args) {

        int n=10;
        List<List<Integer>> queries = asList(
            asList(1,5,3),
            asList(4,8,7),
            asList(6,9,1));
            
        System.out.println(arrayManipulation(n, queries));
     
    }

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        

        List<Long> array = new ArrayList<Long>();
        for(int x=0; x<n;x++){

            array.add((long) 0);

        }

        for (List q:queries){

            int a = (int) q.get(0)-1;
            int b = (int) q.get(1)-1;
            int k = (int) q.get(2);
    
            for(int i = a; i<=b; i++){


                long newval = array.get(i)+k;
                array.set(i, newval);
            }
        
        }
        
        // System.out.println(array);
        long max = Collections.max(array);
         
        return max;
    
    }
    
}
