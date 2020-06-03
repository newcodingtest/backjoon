
import java.io.*;
public class PRACTICE {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] mn = br.readLine().split(" ");
        int m = Integer.valueOf(mn[0]);
        int n = Integer.valueOf(mn[1]);


        String arr[] = new String[m];
        char MN[][] = new char[m][n];
        char square[][] = new char[8][8];


        for (int i = 0; i < m; i++) {
                arr[i]=br.readLine();
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                MN[i][j] = arr[i].charAt(j);
            }
        }



        int min = 64;
        for (int i = 0; i < m - 7; i++) {
            for (int k = 0; k < n - 7; k++) {

                for(int j=0;j<8;j++){ // 8x8 square
                    for(int l=0;l<8;l++){
                        square[j][l]=MN[i+j][k+l];
                    }
                }

                int tmp = number(square);
                if(tmp<min){
                    min=tmp;
                }
            }
        }

        bw.write(String.valueOf(min));
        //System.out.println("33");
        bw.flush();

    }

    static int number(char[][] square){
        int result=0;

        if(square[0][0]=='B') {                                /////0,0 이 black

            for(int i=0;i<8;i++){ //대각선계산
                if(square[i][i]!='B') {
                    result++;
                }
            }

            for (int i = 1; i < 8; i++) { //대각선제외 나머지 계산
                for (int j = 0; j < 8-i; j++) {

                    if(i%2==0){
                        if(square[i+j][j]!='B'){
                            result++;
                        }
                        if(square[j][i+j]!='B'){
                            result++;
                        }
                    }else if(i%2==1){
                        if(square[i+j][j]!='W'){
                            result++;
                        }
                        if(square[j][i+j]!='W'){
                            result++;
                        }
                    }
                }
            }
        }else if(square[0][0]=='W'){                                   ///////0,0이 white


            for(int i=0;i<8;i++){ //대각선계산
                if(square[i][i]!='W')
                    result++;
            }

            for (int i = 1; i < 8; i++) { //대각선제외 나머지 계산
                for (int j = 0; j < 8-i; j++) {

                    if(i%2==0){

                        if(square[i+j][j]!='W'){
                            result++;
                        }

                        if(square[j][i+j]!='W'){
                            result++;
                        }
                    }else if(i%2==1){
                        if(square[i+j][j]!='B'){
                            result++;
                        }
                        if(square[j][i+j]!='B'){
                            result++;
                        }
                    }
                }
            }
        }// 0,0 이 B일때 , 0,0이 W일떄
        return result;
    }
}

