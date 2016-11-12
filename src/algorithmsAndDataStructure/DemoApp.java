package algorithmsAndDataStructure;

import algorithmsAndDataStructure.algorithms.BinarySearchAlgorithm;
import algorithmsAndDataStructure.algorithms.LinearSearchAlgorithm;
import algorithmsAndDataStructure.algorithms.parent.SearchAlgorithm;

/**
 * Created by taylan on 12.11.2016.
 */
public class DemoApp {

    public static void main(String[] args) {

        // Print out algorithm under linear search process
        SearchAlgorithm linearSearch = new LinearSearchAlgorithm();
        linearSearch.doAlgorihtm();

        // Print out algorithm under binary search process
        SearchAlgorithm binarySearch = new BinarySearchAlgorithm();
        binarySearch.doAlgorihtm();

    }
}
