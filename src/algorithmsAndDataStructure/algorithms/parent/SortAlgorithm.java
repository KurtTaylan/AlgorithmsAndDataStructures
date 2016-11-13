package algorithmsAndDataStructure.algorithms.parent;

import algorithmsAndDataStructure.domain.Airport;

import java.util.List;

/**
 * Sorting Algorithms family members will inherite from this.
 *
 * Fast order:
 *
 * 1-Merge Sort Algorithm - Built-in with java.util.Collections
 * 2-Insertion Algorithm
 * 3-Selection Algorithm
 */
public abstract class SortAlgorithm extends Algorithm {


    public abstract void toSortArray(Airport[] array);


    public abstract void toSortList(List<Airport> list);


    protected void swap(List<Airport> airportList, int indexMin, int i) {
        Airport tempMin = airportList.get(indexMin);
        Airport tempSwap = airportList.get(i);
        airportList.set(indexMin, tempSwap);
        airportList.set(i, tempMin);
    }

}
