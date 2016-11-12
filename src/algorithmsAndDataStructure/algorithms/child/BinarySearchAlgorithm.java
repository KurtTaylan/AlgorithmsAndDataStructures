package algorithmsAndDataStructure.algorithms.child;

import algorithmsAndDataStructure.algorithms.parent.SearchAlgorithm;
import algorithmsAndDataStructure.algorithms.parent.SortAlgorithm;
import algorithmsAndDataStructure.domain.Airport;

import java.time.LocalTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * BinearSearch is smart search for to dive deep into large collection of data by slicing them by half method
 * under condition of  - 'Data should be sorted' -
 * <p>
 * Pseduo Code:
 * 1-Specify following indexes: min, max, middle = (max + min) / 2
 * 2-After you done that, go to middle and compare searching element with middle element;
 * 2.1- Searching element is smaller than middle element than cut greather half away. max = middle -1
 * 2.2- Searching element is greater than middle element than cut smaller half away. min = middle + 1
 * 3- Until you find it do step 2.
 * <p>
 * Thats it.
 * <p>
 * Big O Notation: Log2(n)..
 */
public class BinarySearchAlgorithm extends SearchAlgorithm {

    private SortAlgorithm selectionSort = new SelectionSortAlgorithm();


    // Data:7000 ,  Algorithm process could not measure by nanoseconds.Constant.
    @Override
    public void toFindInArray(String searchingCityInput, Airport[] exampleArray) {
        selectionSort.toSortArray(exampleArray);  // selection sort algorithm

        System.out.println("Start BINARY SEARCH in CLASSIC ARRAY");

        algorithmTimer.setStartInstant(LocalTime.now());
        for (int minIndex = 0, maxIndex = exampleArray.length - 1; minIndex <= maxIndex; ) {

            int middleIndex = (maxIndex + minIndex) / 2;
            Airport candidateAirport = exampleArray[middleIndex];
            int compareNumber = candidateAirport.getCity().compareTo(searchingCityInput);

            if (compareNumber == 0) {

                algorithmTimer.setFinishInstant(LocalTime.now());
                algorithmTimer.printOutTime();
                break;

            } else if (compareNumber > 0) {

                maxIndex = middleIndex - 1;

            } else {

                minIndex = middleIndex + 1;

            }
        }

        System.out.println("Finish BINARY SEARCH in CLASSIC ARRAY");
    }


    // Data:7000 ,  Algorithm process could not measure by nanoseconds.Constant.
    @Override
    public void toFindInList(String searchingCityInput, List<Airport> airportsList) {
        selectionSort.toSortList(airportsList);// selection sort algorithm

        System.out.println("Starting BINARY SEARCH in LIST");

        algorithmTimer.setStartInstant(LocalTime.now());
        for (int minIndex = 0, maxIndex = airportsList.size() - 1; minIndex <= maxIndex; ) {

            int middleIndex = (maxIndex + minIndex) / 2;
            Airport candidateAirport = airportsList.get(middleIndex);
            int compareNumber = candidateAirport.getCity().compareTo(searchingCityInput);

            if (compareNumber == 0) {

                algorithmTimer.setFinishInstant(LocalTime.now());
                algorithmTimer.printOutTime();
                break;

            } else if (compareNumber > 0) {
                maxIndex = middleIndex - 1;
            } else {
                minIndex = middleIndex + 1;
            }
        }

        System.out.println("Finished BINARY SEARCH in LIST");
    }

    private void sortList(List<Airport> airportList) {
        Comparator<Airport> byCityName = (firstElement, secondElement) ->
                firstElement.getCity().compareTo(secondElement.getCity());

        Collections.sort(airportList, byCityName);
    }
}
