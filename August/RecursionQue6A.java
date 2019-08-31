package August;

class RecursionQue6A {
    public static void main(String[] args) {
        // Input
        int n = 0;
        
        // Constant always starts from 0.
        int k = 0;

        // Recursive call to the printing function.
        recursiveCall(n, k, n);
    }

    private static void recursiveCall(int test, int k, int n) {
        System.out.print(n + "\t");

        int returnConditionValue = returnCondition(test);

        if (k == returnConditionValue)
            return;
        if (k < test)
            recursiveCall(test, ++k, --n);
        else
            recursiveCall(test, ++k, ++n);
    }

    private static int returnCondition(int n) {
        return (n * 2);
    }
}