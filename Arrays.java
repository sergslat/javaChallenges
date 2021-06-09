import java.util.List;
import java.util.stream.IntStream;
import java.util.ArrayList;
import static java.util.Arrays.*;


public class Arrays {

    public static void main(String[] args) {

      List<Integer> arr = asList(1,2,3,56,3,1,87,6,1);
      
    //   int[] arrint = new int[] {1,2,3,56,3,1,87,6,1};



      System.out.println(reverseArray(arr));

                
    }
    
    public static List<Integer> reverseArray(List<Integer> a) {
        
        
        List<Integer> rev = new ArrayList<Integer>();
        
        for(int n=a.size()-1; n>= 0;n--){

            rev.add(a.get(n));


        }

        return rev;



        
    
    }

    public static IntStream stream(int[] sum) {
        return null;
    }
    
}
