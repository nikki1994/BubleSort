import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    int[] unsorted;
    Scanner s = new Scanner(System.in);
    int[] setArray(){
        System.out.println("what lengh your array is?");
        int aryLength = s.nextInt();
        unsorted = new int[aryLength];
        for (int i=0;i<unsorted.length;i++) {
            System.out.println("enter "+(i+1)+" number");
            unsorted[i]=s.nextInt();
        }
        return unsorted;
    }
    int[] sort(int[] unsorted){
        this.unsorted = unsorted;
        int[] sorted;
        for(int i=0;i< unsorted.length-1;i++){
            for (int j=0;j< unsorted.length-1;j++){
                if (unsorted[j]>unsorted[j+1]){
                    int temp=unsorted[j];
                    unsorted[j]=unsorted[j+1];
                    unsorted[j+1]=temp;
                }
            }
        }
        sorted = unsorted;
        return sorted;
    }

}
