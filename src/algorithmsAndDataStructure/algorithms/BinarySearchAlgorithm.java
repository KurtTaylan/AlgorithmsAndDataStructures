package algorithmsAndDataStructure.algorithms;

import algorithmsAndDataStructure.algorithms.parent.SearchAlgorithm;
import algorithmsAndDataStructure.domain.Airport;

import java.time.LocalTime;
import java.util.List;

/**
 * BinearSearch is smart search for to dive deep into large collection of data by slicing them by half method
 * under condition of  - 'Data should be sorted' -
 */
public class BinarySearchAlgorithm extends SearchAlgorithm {


    // Result From record 6000: FOUND: "FlyPortugal", in: 3000000 nanoseconds. CLASSIC ARRAY - FOR EACH LOOP
    @Override
    public void toFindInArray(String searchingCityInput, Airport[] exampleArray) {
        System.out.println("Starting Array in BINARY SEARCH");

        LocalTime startTime = LocalTime.now();

        for (Airport airport : exampleArray) {
            if (airport.getCity().equalsIgnoreCase(searchingCityInput)) {

                LocalTime finishTime = LocalTime.now();
                long resultTime = finishTime.toNanoOfDay() - startTime.toNanoOfDay();
                System.out.println("FOUND: " + searchingCityInput + ", in: " + resultTime + " nanoseconds. CLASSIC ARRAY");
                break;
            }
        }

        System.out.println("Finish Array in BINARY SEARCH");
    }


    // Result From record 6000: FOUND: "FlyPortugal", in: 1000000 nanoseconds. ARRAY LIST FOR EACH LOOP
    @Override
    public void toFindInList(String searchingCityInput, List<Airport> airportsList) {
        System.out.println("Starting List in BINARY SEARCH");
        LocalTime startTime = LocalTime.now();

        for (Airport airport : airportsList) {
            if (airport.getCity().equalsIgnoreCase(searchingCityInput)) {

                LocalTime finishTime = LocalTime.now();
                long resultTime = finishTime.toNanoOfDay() - startTime.toNanoOfDay();
                System.out.println("FOUND: " + searchingCityInput + ", in: " + resultTime + " nanoseconds. ARRAY LIST");
                break;
            }
        }

        System.out.println("Finished List in BINARY SEARCH");
    }
}
