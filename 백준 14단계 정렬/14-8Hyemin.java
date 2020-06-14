// [통과] 메모리 30340 KB / 시간 272 ms
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        quickSort(arr, 0, arr.length - 1);

        String beforeWords = "";
        for (int i = 0; i < n; i++) {
            if (!beforeWords.equals(arr[i]))
                bf.write(arr[i] + "\n");
            beforeWords = arr[i];
        }
        bf.flush();
        bf.close();
    }

    private static void quickSort(String[] arr, int low, int high) {
        if (low >= high) return;
        int mid = swapBasedPivot(arr, low, high);
        quickSort(arr, low, mid - 1);
        quickSort(arr, mid, high);
    }

    private static int swapBasedPivot(String[] arr, int low, int high) {
        String pivot = arr[(low + high) / 2];
        while (low <= high) {
            while (arr[low].length() < pivot.length() || (arr[low].length() == pivot.length() && arr[low].compareTo(pivot) < 0)) low++;
            while (arr[high].length() > pivot.length() || (arr[high].length() == pivot.length() && arr[high].compareTo(pivot) > 0)) high--;
            if (low <= high) {
                String tmp = arr[low];
                arr[low] = arr[high];
                arr[high] = tmp;
                low++;
                high--;
            }
        }
        return low;
    }
}
