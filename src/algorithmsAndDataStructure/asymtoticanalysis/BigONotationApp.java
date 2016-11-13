package algorithmsAndDataStructure.asymtoticanalysis;

/**
 * Big O Classes are one of the ways of 'Asymptotic Analyis' to keep track how two funtions grows with some RATE.
 * <p>
 * We are only care about biggest impact to our outcome.
 * <p>
 * For example:
 * Think about you function operation is : 3n + 3
 * The BigO of this function is : O(3n)
 * 3n+3 = O(3n) = O(n) - 'drop constants'
 */
public class BigONotationApp {


    public static void main(String[] args) {


    }


    /*
     * Sample to analyze for to specify rate.
     *
     * Note: Runtimes are independent!
     *
     * */
    public static void reduce(int[] values) {


        int minIndex = 0;  //  O(1) point =  constant : This don't depend on the input size(n)


        /*
         * Real question is;
         * -How does this loop depend on the size of input ?
         *
         * There will be n loop iterations with 'i < values.length','if (values[i] < values[minIndex])','minIndex = i;'
         * since with drop the constants in Big O classes we don't care about too deep calculations.
         *
         * Each loop is doing O(n) growing-rate; 1 * 1 * 1 * O(n)
         *
         */
        for (int i = 0; i < values.length; i++) { // O(n) point.

            if (values[i] < values[minIndex]) {

                minIndex = i;

            }

        }


        int minValue = values[minIndex]; //  O(1) point =  constant : This don't depend on the input size(n)


        //Here is the same with previous for-loop
        for (int i = 0; i < values.length; i++) { // O(n) point.

            values[i] -= minValue;

        }
    } // Result is 2*O(n) + 2 * O(1) =  O(n)


    /**
     * Big O with nested operations
     */
    public static int maxDifference(int[] values) {

        int max = 0;

        // When you see nested operations: COUNT FROM INSIDE OUT

        for (int i : values) { // until here 0(n^2) RESULT IS:   O(n^2)

            for (int j : values) { // until here 0(n)

                if (values[i] - values[j] > max) { // until here 0(1)

                    max = values[i] - values[j]; // 0(1)
                }
            }
        }

        return max;
    }
}
