public class Main {
    public static void main(String[] args) {
        // program entry point

    }

    public static Object[] reversArr(Object[] arr) {
        // create a cycle
        for (int i = 0; i < arr.length / 2; i++) {
            Object temp = arr[i];
            // temp variable to save first value
            arr[i] = arr[arr.length - 1 - i];
            // change first variable to the last
            arr[arr.length - 1 - i] = temp;
            // change last variable to first (saved in temp)
        }

        return arr; // return changed array

    }


}