package algorithmsAndDataStructure.algorithms.parent;

import algorithmsAndDataStructure.algorithms.commonBehavior.Searchable;

/**
 * Searching Algorithms family members will inherite from this.
 */
public abstract class SearchAlgorithm extends Algorithm implements Searchable {

    public abstract void searchFor(String word);
}
