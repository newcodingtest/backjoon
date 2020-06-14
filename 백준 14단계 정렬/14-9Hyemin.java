// [통과] 메모리 69388 KB / 시간 748 ms
import java.io.*;
import java.util.*;

public class Main {
    static class Member implements Comparable<Member>{
        int orderNum, age;
        String name;
        Member(int orderNum, int age, String name) {
            this.orderNum = orderNum;
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(Member o) {
            if (this.age > o.age) return 1;
            else if (this.age == o.age && this.orderNum > o.orderNum) return 1;
            return -1;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<Member> members = new ArrayList<Member>();
        for (int i = 0; i < n; i++) {
            String[] inputs = br.readLine().split(" ");
            members.add(new Member(i, Integer.parseInt(inputs[0]), inputs[1]));
        }

        Collections.sort(members);
        for (Member m : members) {
            bf.write(m.age + " " + m.name + "\n");
        }
        bf.flush();
        bf.close();
    }
}
