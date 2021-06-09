import java.util.List;
import java.util.ArrayList;
import static java.util.Arrays.*;

public class LeftRotation {
    
    public static void main(String[] args) {
        
        List<Integer> arr = asList(41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1 ,86 ,58, 26, 10, 86, 51);
        int d = 4; 

        System.out.println(rotateLeft(10, arr));

    }

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {

        int n = arr.size()-1;
    
        List<Integer> newarr = new ArrayList<Integer>();
        for(int s = 0; s<n+1; s++){

            newarr.add(null);


        }

        

        for(int x:arr){

            
            
            int index =  arr.indexOf(x);
            int res = index - d;

            if(res>=0){

                newarr.set(res, x);


            } else {

                
                newarr.set(n+res+1, x);
            }

            arr.set(index, null );
            

            
        }
        
        
        return newarr;
        }
}
