package algorithmsAndDataStructure;

import algorithmsAndDataStructure.algorithms.child.BinarySearchAlgorithm;
import algorithmsAndDataStructure.algorithms.child.LinearSearchAlgorithm;
import algorithmsAndDataStructure.algorithms.parent.SearchAlgorithm;

/**
 * Highest level of application =  Client-side
 */
public class DemoApp {

    public static void main(String[] args) {

        String searchingCityInput = "\"FlyPortugal\"";

        // Print out algorithm under linear search process
        SearchAlgorithm linearSearch = new LinearSearchAlgorithm();
        linearSearch.searchFor(searchingCityInput);

        System.out.println();
        System.out.println();
        System.out.println();

        // Print out algorithm under binary search process with different kind of sort algorithms
        SearchAlgorithm binarySearch = new BinarySearchAlgorithm();
        binarySearch.searchFor(searchingCityInput);

    }
}
