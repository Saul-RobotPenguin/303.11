package GLAB7;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */




            HashMap<String, Integer> phoneAndNames = new HashMap<String, Integer>();

            Scanner input = new Scanner(System.in);

            int numbersToRegister = input.nextInt();
        input.nextLine();


            int numbersThatHaveRegistered = 0;

            while (numbersThatHaveRegistered < numbersToRegister){
                String name = input.nextLine();
                System.out.println(name);


                int phoneNumber = input.nextInt();
                input.nextLine();
                System.out.println(phoneNumber);

                phoneAndNames.put(name,phoneNumber);
                numbersThatHaveRegistered++;
            }


            ArrayList<String> namesToLookFor = new ArrayList<>();
            numbersThatHaveRegistered = 0;


            while( numbersThatHaveRegistered < numbersToRegister ){
                String name= input.nextLine();
                namesToLookFor.add(name);
                numbersThatHaveRegistered++;
            }

            for(int i = 0; i < namesToLookFor.size() ; i++){

                if ( phoneAndNames.get(namesToLookFor.get(i)) != null){
                    System.out.println(namesToLookFor.get(i) + "=" + phoneAndNames.get(namesToLookFor.get(i)));
                } else {
                    System.out.println("Not found");
                }

            }

    }
}
