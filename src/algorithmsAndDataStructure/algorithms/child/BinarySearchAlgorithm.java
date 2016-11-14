package algorithmsAndDataStructure.algorithms.child;

import algorithmsAndDataStructure.algorithms.parent.SearchAlgorithm;
import algorithmsAndDataStructure.algorithms.parent.SortAlgorithm;
import algorithmsAndDataStructure.domain.Airport;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
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


    private SortAlgorithm sortAlgorithm;


    public BinarySearchAlgorithm() {
        this(new MergeSortAlgorithm());
    }

    public BinarySearchAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }


    @Override
    public void searchFor(String word) {
        List<Airport> sampleList = new ArrayList<>();
        util.prepareSampleList(sampleList);

        // Comparativism
        toFindInLinkedList(word, sampleList);
        toFindInArray(word, (Airport[]) sampleList.toArray());
        toFindInLinkedList(word, sampleList);
    }


    // BenchMarking: Data:6050 ,  Algoritm Process took: 0.001 second(s).
    @Override
    public void toFindInLinkedList(String searchingCityInput, List<Airport> airportsList) {
        sortAlgorithm.toSortLinkedList(airportsList);

        System.out.println();
        System.out.println("Start BINARY SEARCH in LINKEDLIST");

        binarySearch(searchingCityInput, airportsList);

        System.out.println("Finish BINARY SEARCH in LINKEDLIST");
        System.out.println();
    }


    // BenchMarking: Data:6050 ,  Algorithm process could not measure by nanoseconds.Constant.
    @Override
    public void toFindInArray(String searchingCityInput, Airport[] exampleArray) {
        sortAlgorithm.toSortArray(exampleArray);

        System.out.println();
        System.out.println("Start BINARY SEARCH in CLASSIC ARRAY");

        binarySearch(searchingCityInput, Arrays.asList(exampleArray));

        System.out.println("Finish BINARY SEARCH in CLASSIC ARRAY");
        System.out.println();
    }


    // BenchMarking: Data:6050 ,  Algorithm process could not measure by nanoseconds.Constant.
    @Override
    public void toFindInList(String searchingCityInput, List<Airport> airportsList) {

        sortAlgorithm.toSortList(airportsList);

        System.out.println();
        System.out.println("Starting BINARY SEARCH in LIST");

        binarySearch(searchingCityInput, airportsList);

        System.out.println("Finished BINARY SEARCH in LIST");
        System.out.println();
    }

    private void binarySearch(String searchingCityInput, List<Airport> airportsList) {
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
    }
}
