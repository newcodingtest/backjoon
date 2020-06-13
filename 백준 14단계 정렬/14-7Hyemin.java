import java.io.*;

public class Main {
    static class Point {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Point[] arr = new Point[n];
        for (int i = 0; i < n; i++) {
            String[] pointStr = br.readLine().split(" ");
            int x = Integer.parseInt(pointStr[0]);
            int y = Integer.parseInt(pointStr[1]);
            arr[i] = new Point(x, y);
        }
        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < n; i++) {
            bf.write(arr[i].x + " " + arr[i].y + "\n");
        }

        bf.flush();
        bf.close();
    }

    private static void quickSort(Point[] arr, int low, int high) {
        if (low >= high) return;
        int mid = swapBasedPivot(arr, low, high);
        quickSort(arr, low, mid - 1);
        quickSort(arr, mid, high);
    }

    private static int swapBasedPivot(Point[] arr, int low, int high) {
        Point pivot = arr[(low + high) / 2];
        while (low <= high) {
            while (arr[low].y < pivot.y || (arr[low].y == pivot.y && arr[low].x < pivot.x)) low++;
            while (arr[high].y > pivot.y || (arr[high].y == pivot.y && arr[high].x > pivot.x)) high--;

            if (low <= high) {
                Point tmp = arr[low];
                arr[low] = arr[high];
                arr[high] = tmp;
                low++;
                high--;
            }
        }
        return low;
    }
}