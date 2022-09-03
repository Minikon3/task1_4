import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr1=new int[10];
        for (int x=0;x< arr1.length;x++){
            arr1[x]=((int)(Math.random()*100)-1);
            System.out.print(arr1[x]+" ");
        }
    }
}