import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        student[] s = new student[n];//n명의 학생 객체 생성

        for (int i = 0; i < n; i++) {
            String[] info = br.readLine().split(" ");
            s[i] = new student(Integer.parseInt(info[0]), Integer.parseInt(info[1])); //각 학생의 키 몸무게를 생성자로 입력
        }

        for (int i = 0; i < n; i++) {
            bw.write(String.valueOf(size(s[i], s)) + " ");// size() -> 학생1명과 학생n명을 비교하여 등수를 구하는 함수
       }
        bw.flush();
        bw.close();
    }


    static int size(Object o1, Object[] o2) {
        int k = 0;
        if ((o1 instanceof student) && (o2 instanceof student[])) {

            student s1 = (student) o1;
            student[] s2 = (student[]) o2;

            for (int i = 0; i < s2.length; i++) {
                if (s1.weight < s2[i].weight && s1.length < s2[i].length) {
                    k++;
                }
            }
        }
        return k + 1;
    }
}

class student {
    int weight;
    int length;

    student(int w, int l) {
        this.weight = w;
        this.length = l;
    }
}