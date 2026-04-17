public class NumberUtils {

    // Phương thức đếm các số chẵn trong mảng
    public int countEvens(int[] arr) {
        int count = 0;

        // Vòng lặp
        for (int i = 0; i < arr.length; i++) {
            // Lệnh rẽ nhánh
            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
