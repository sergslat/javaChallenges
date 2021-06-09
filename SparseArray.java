import java.util.ArrayList;
import java.util.List;
import static java.util.Arrays.*;

public class SparseArray {

    public static void main(String[] args) {


        List<String> strings = asList("aba","baba","aba","xzxb");
        List<String> queries = asList("aba","xzxb","ab");
        
        System.out.println(matchingStrings(strings, queries));

    }

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {


        List<Integer> ansList = new ArrayList<Integer>();
        for(int s = 0; s<queries.size(); s++){

            ansList.add(0);


        }
        
        int[] hits = new int[queries.size()];
        
        
        for(String s:strings){

            int fromIndex=0;


            for(String q:queries){

                

                if(q.equals(s)){
  
                    hits[fromIndex]++;
                    ansList.set(fromIndex, hits[fromIndex]);
                }
                fromIndex++;
            }


        }

        return ansList;
        
    }
    
}
