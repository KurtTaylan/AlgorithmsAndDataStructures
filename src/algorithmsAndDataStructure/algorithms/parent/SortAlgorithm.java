package algorithmsAndDataStructure.algorithms.parent;

import algorithmsAndDataStructure.domain.Airport;

import java.util.List;

/**
 * Sorting Algorithms family members will inherite from this.
 */
public abstract class SortAlgorithm extends Algorithm {


    public abstract void toSortArray(Airport[] array);

    public abstract void toSortList(List<Airport> list);

}
