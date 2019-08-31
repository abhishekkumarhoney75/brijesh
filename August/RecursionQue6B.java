package August;

class RecursionQue6B {
    public static void main(String[] args) {

        int[] arr = { 2, 3, 4, 5, 6, 7, 1, 1 };

        int count = recursiveCall(arr, 0);
        System.out.println(count);
    }

    private static int recursiveCall(int[] arr, int i) {
        if (i == arr.length)
            return 0;
        else {
            if (isOdd(arr, i)) {
                return 1 + recursiveCall(arr, ++i);
            } else {
                return recursiveCall(arr, ++i);
            }
        }
    }

    private static boolean isOdd(int[] arr, int i) {
        return (arr[i] & 1) != 0;
    }

}