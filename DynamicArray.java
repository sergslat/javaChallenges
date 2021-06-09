import java.util.ArrayList;
import java.util.List;
import static java.util.Arrays.*;


public class DynamicArray {

    public static void main(String[] args) {

        int n = 2;

        List<List<Integer>> queries = asList(
        asList(1,0,5),
        asList(1,1,7),
        asList(1,0,3),
        asList(2,1,0),
        asList(2,1,1)
        );

        
        System.out.println(dynamicArray(n, queries));



        
    }

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {

        int lastAnswer = 0;
        List<Integer> answersList = new ArrayList<Integer>();
        int idx=0;
        
        /* Create 2-D ArrayList */
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(new ArrayList<Integer>());
        }

        /* Perform Q Queries */
        for (int i = 0; i < queries.size(); i++) {
            int q = queries.get(i).get(0);
            int x = queries.get(i).get(1);
            int y = queries.get(i).get(2);
            
            ArrayList<Integer> seq = (ArrayList<Integer>) arrayList.get((x ^ lastAnswer) % n);
            if (q == 1) {
                seq.add(y);
            } else if (q == 2) {
                lastAnswer = seq.get(y % seq.size());
                answersList.add(lastAnswer);
            }
        }
       
        return answersList;

      
        // int currentindex1=0;
        // int currentindex2=0;
        // for(List x:queries){

        //     int a = (int) x.get(0);

        //    if(a == 1){

        //         idx = ((int) x.get(1) ^ lastAnswer)%2;
        //         // arr.get(idx).add((Integer) x.get(2));
                
        //         if(idx == 0){
        //             arr[idx][currentindex1] = (int) x.get(2);
        //             currentindex1++;


        //         } else if (idx == 1) {
        //             arr[idx][currentindex2] = (int) x.get(2);
        //             currentindex2++;

        //         }
               

        //     } else {

        //         idx = ((int) x.get(1) ^ lastAnswer)%2;
        //         if(idx==0){

        //             int index1 = (int) x.get(2) % currentindex1;
        //             lastAnswer = arr[idx][index1];
        //             answersList.add(lastAnswer);

        //         }
        //         else if(idx==1){

        //             int index2 = (int) x.get(2) % currentindex2;
        //             lastAnswer = arr[idx][index2];
        //             answersList.add(lastAnswer);
        //         }
                
        //     }
   

        // }

        // // for(List i:arr){
        // //     System.out.println(i);
        // // }

        
    

    }


    
}
