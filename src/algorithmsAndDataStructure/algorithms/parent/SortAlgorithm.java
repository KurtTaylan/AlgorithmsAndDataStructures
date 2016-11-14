package algorithmsAndDataStructure.algorithms.parent;

import algorithmsAndDataStructure.algorithms.commonBehavior.Sortable;
import algorithmsAndDataStructure.domain.Airport;

import java.util.List;

/**
 * Sorting Algorithms family members will inherite from this.
 *
 * Fast order:
 *
 * 1-Merge Sort Algorithm - Built-in with java.util.Collections.sort
 * 2-Quick Sort Algorithm - Built-in with java.util.Arrays.sort
 * 2-Insertion Algorithm
 * 3-Selection Algorithm
 */
public abstract class SortAlgorithm extends Algorithm implements Sortable {


    protected void swap(List<Airport> airportList, int indexOne, int indexTwo) {
        Airport tempMin = airportList.get(indexOne);
        Airport tempSwap = airportList.get(indexTwo);
        airportList.set(indexOne, tempSwap);
        airportList.set(indexTwo, tempMin);
    }

}
