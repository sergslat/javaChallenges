import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Queue {

    public static void main(String[] args) {

        // List<String> input = new ArrayList<String>();
        String[] input;

        Scanner sc= new Scanner(System.in);
        // input.add(sc.nextLine().split(" "));
        input = sc.nextLine().split(" ");

        // System.out.println(input);

        for(String s:input){

            System.out.print(s + ", ");
        }


        
        
    }
    
}
