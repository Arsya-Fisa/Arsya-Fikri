package dataStructure;

public class SequentialSearch {
    public int[] sequentialSearch(int[] arr, int target) {
        int[] result = new int[arr.length];
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                result[idx++] = i; // simpan index yang cocok
            }
        }

        // Potong array ke ukuran yang sesuai
        int[] found = new int[idx];
        for (int i = 0; i < idx; i++) {
            found[i] = result[i];
        }
        return found;
    }
}
