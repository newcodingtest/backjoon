import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();

        char inputChar[] = new char[input.length()];
        char inverse[] = new char[input.length()];

        inputChar = input.toCharArray();
        Arrays.sort(inputChar);

        for(int i=0; i<input.length();i++){
            inverse[i]=inputChar[input.length()-1-i];
        }
        System.out.println(inverse);

    }
}