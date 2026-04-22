class Practical7Part1 {

    // ==============================
    // TASK 1 — FACTORIAL
    // ==============================

    // 1. Iterative Factorial 
    static long factorialIterative(int n) {
        if (n < 0)
            return -1;   // invalid input

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }


    // 2. Recursive Factorial
    static long factorialRecursive(int n) {
        if (n < 0)
            return -1;   // invalid input

        if (n == 0)
            return 1;

        return n * factorialRecursive(n - 1);
    }



    // ==============================
    // TASK 2 — STRING COUNT
    // ==============================

    // -------- ITERATIVE METHODS --------

    // 1. Character Comparison
    static int countIterative1(String str1, String str2) {

        if (str1 == null || str2 == null || str2.length() == 0)
            return 0;

        int count = 0;

        for (int i = 0; i <= str1.length() - str2.length(); i++) {

            boolean match = true;

            for (int j = 0; j < str2.length(); j++) {

                if (str1.charAt(i + j) != str2.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (match)
                count++;
        }

        return count;
    }



    // 2. Using substring()
    static int countIterative2(String str1, String str2) {

        if (str1 == null || str2 == null || str2.length() == 0)
            return 0;

        int count = 0;

        for (int i = 0; i <= str1.length() - str2.length(); i++) {

            String part = str1.substring(i, i + str2.length());

            if (part.equals(str2))
                count++;
        }

        return count;
    }



    // 3. Using indexOf() 
    static int countIterative3(String str1, String str2) {

        if (str1 == null || str2 == null || str2.length() == 0)
            return 0;

        int count = 0;
        int index = str1.indexOf(str2);

        while (index != -1) {

            count++;

            index = str1.indexOf(str2, index + 1);
        }

        return count;
    }



    // -------- RECURSIVE METHODS --------

    // 1. Check From Start
    static int countRecursive1(String str1, String str2) {

        if (str1 == null || str2 == null || str2.length() == 0)
            return 0;

        if (str1.length() < str2.length())
            return 0;

        if (str1.substring(0, str2.length()).equals(str2))
            return 1 + countRecursive1(str1.substring(1), str2);
        else
            return countRecursive1(str1.substring(1), str2);
    }



    // 2. Using indexOf()
    static int countRecursive2(String str1, String str2) {

        if (str1 == null || str2 == null || str2.length() == 0)
            return 0;

        int index = str1.indexOf(str2);

        if (index == -1)
            return 0;

        return 1 + countRecursive2(str1.substring(index + 1), str2);
    }



    // 3. With Index Parameter
    static int countRecursive3(String str1, String str2, int i) {

        if (str1 == null || str2 == null || str2.length() == 0)
            return 0;

        if (i > str1.length() - str2.length())
            return 0;

        boolean match = true;

        for (int j = 0; j < str2.length(); j++) {

            if (str1.charAt(i + j) != str2.charAt(j)) {
                match = false;
                break;
            }
        }

        if (match)
            return 1 + countRecursive3(str1, str2, i + 1);
        else
            return countRecursive3(str1, str2, i + 1);
    }
    
    public static void main(String[] args) {

    	int num = 5;

    	System.out.println("Iterative Factorial of " + num + " = "
            + factorialIterative(num));

    	System.out.println("Recursive Factorial of " + num + " = "
            + factorialRecursive(num));

    	String str1 = "SGGSIE&TSGGS";
    	String str2 = "SGGS";

    	System.out.println("\nIterative Method 1 = "
            + countIterative1(str1, str2));

    	System.out.println("Iterative Method 2 = "
            + countIterative2(str1, str2));

    	System.out.println("Iterative Method 3 = "
            + countIterative3(str1, str2));

    	System.out.println("Recursive Method 1 = "
            + countRecursive1(str1, str2));

    	System.out.println("Recursive Method 2 = "
            + countRecursive2(str1, str2));

   	 System.out.println("Recursive Method 3 = "
            + countRecursive3(str1, str2, 0));
	}
    
    

}
