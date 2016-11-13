package algorithmsAndDataStructure.algorithms.child;

import algorithmsAndDataStructure.algorithms.parent.SortAlgorithm;
import algorithmsAndDataStructure.domain.Airport;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * We are going to use Built-in method which implemented merge-sort:
 * <p>
 * Strategy of Merge sort is: Divide - Conquer. 1- Divide whole list smaller list
 * 2- Sort and merge them at the end.
 */
class MergeSortAlgorithm extends SortAlgorithm {


    // Data: 6050 , Algoritm Process took: 8000000 nanoseconds.- FUCKING FAST than insertion (Mystry) sort even.
    @Override
    public void toSortArray(Airport[] airports) {
        System.out.println("START MergeSortAlgorithm in CLASSIC ARRAY");

        algorithmTimer.setStartInstant(LocalTime.now());

        Comparator<Airport> byCityName = (firstElement, secondElement) ->
                firstElement.getCity().compareTo(secondElement.getCity());
        Collections.sort(Arrays.asList(airports), byCityName);

        algorithmTimer.setFinishInstant(LocalTime.now());
        algorithmTimer.printOutTime();

        System.out.println("FINISH MergeSortAlgorithm in CLASSIC ARRAY");
    }


    // Data: 6050 , Algoritm Process took: 5000000 nanoseconds...
    @Override
    public void toSortList(List<Airport> airportList) {

        System.out.println("START MergeSortAlgorithmin LIST");

        algorithmTimer.setStartInstant(LocalTime.now());

        Comparator<Airport> byCityName = (firstElement, secondElement) ->
                firstElement.getCity().compareTo(secondElement.getCity());
        Collections.sort(airportList, byCityName);

        algorithmTimer.setFinishInstant(LocalTime.now());
        algorithmTimer.printOutTime();

        System.out.println("FINISH MergeSortAlgorithm in LIST");

    }
}
