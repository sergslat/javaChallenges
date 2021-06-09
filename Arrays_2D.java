import java.util.List;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

import static java.util.Arrays.*;

public class Arrays_2D {

    public static void main(String[] args) {

        List<List<Integer>> arr = asList(
            asList(-9, -9, -9,  1, 1, 1 ),
            asList(0,  -9,  0,  4, 3, 2),
            asList(-9, -9, -9,  1, 2, 3),
            asList(0,  0,  8,   6, 6, 0),
            asList(0,  0,  0,  -2, 0, 0),
            asList(0,  0,  1,   2, 4, 0)
            );



    //  int sum [] = hourglassSum(arr);
     
    //  for(int i =0 ; i< sum.length; i++){

    //     System.out.println(sum[i]);
    //  }

        System.out.println(hourglassSum(arr));

        
        
    }

    public static int hourglassSum(List<List<Integer>> arr) {
       
       int[][] matrix = new int[6][6];
       int[] sum = new int[16];
       int count =0;
       
       //CONVERT LIST TO INT[][] MATRIX
        for(int n=0; n<6; n++){

            matrix[n] = arr.get(n).stream()
            .mapToInt(Integer::intValue)
            .toArray();

            // sum[n] = IntStream.of(matrix[n]).sum();
            
        }

        //ITERATE TROUGH THE MATRIX

        for(int x=0; x<4;x++){

            for(int i=0; i<4 ;i++){

                for(int j =x; j<x+3;j++){
    
                    sum[count] = sum[count] + matrix[i][j]+matrix[i+2][j];
    
                }
                sum[count] = sum[count] + matrix[i+1][x+1];
                count++;             
    
    
    
            }


        }
        

        // int max = asList( Collections.max(sum));
        int max = Arrays.stream(sum).max().getAsInt();
        

        return max;

    }
 
    

    
}
