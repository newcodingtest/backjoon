import java.io.*;
import java.util.Scanner;

public class prr {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        for(int i=0; i<=1000000;i++){
            if(cal(i)==input){
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.println(0);
    }
    static int cal(int num){
        int sum=num;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        return  sum;
    }
}