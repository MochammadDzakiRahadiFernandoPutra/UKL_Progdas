import java.util.HashMap;

public class No3 {
    public static void countFrequency(int[] array) {
    
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();


        for (int num : array) {

            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }


        System.out.println("Array: { " + arrayToString(array) + " }");
        for (int key : frequencyMap.keySet()) {
            System.out.println(key + " muncul " + frequencyMap.get(key) + " kali");
        }
    }


    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int c = 0; c < array.length; c++) {
            sb.append(array[c]);
            if (c < array.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        countFrequency(array);
    }
}
