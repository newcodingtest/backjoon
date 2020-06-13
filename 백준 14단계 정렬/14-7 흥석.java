import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        Point p[] = new Point[input];

        for (int i = 0; i < input; i++) {
            String xy[] = br.readLine().split(" ");
            p[i] = new Point(Integer.parseInt(xy[0]), Integer.parseInt(xy[1]));
        }

        sort(p);
        for (int i = 0; i < input; i++) {
            bw.write(p[i].toString() + "\n");

        }
        bw.flush();
        bw.close();
    }

    static void sort(Point[] p) {
        for (int i = 0; i < p.length; i++) {
            for (int j = i + 1; j < p.length; j++) {
                if (p[j].y< p[i].y) {
                    Point tmp = p[i];
                    p[i] = p[j];
                    p[j] = tmp;
                }else if (p[j].y == p[i].y) {
                    if (p[j].x < p[i].x) {
                        Point tmp = p[i];
                        p[i] = p[j];
                        p[j] = tmp;
                    }
                }
            }
        }
    }
}

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return this.x + " " + y;
    }
}