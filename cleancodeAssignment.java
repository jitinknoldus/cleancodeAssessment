import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;

//program to sort an array by index
public class Main{

    //function that takes numbersArray as input and sort on the basis of index
    public static int[] sortByIndex(int[] numbersArray,int length){
         HashMap<Integer,Integer>map = new HashMap<>();

        for(int index=0; index<length; index++){
            map.put(numbersArray[index],index);
        }
        Arrays.sort(numbersArray);
         for(int index=0; index<length; index++){
            numbersArray[index] = map.get(numbersArray[index]); 
        }
        return numbersArray;
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        int[] numbersArray = new int[length];

        for(int index=0; index<length; index++){
            numbersArray[index] = sc.nextInt();
        }

         numbersArray  = sortByIndex(numbersArray,length);

        for(int index=0; index < numbersArray.length; index++){
            System.out.print(numbersArray[index] + " ");
        }     
    }
}
