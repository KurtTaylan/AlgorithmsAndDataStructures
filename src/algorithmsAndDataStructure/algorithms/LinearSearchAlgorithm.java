package algorithmsAndDataStructure.algorithms;

import algorithmsAndDataStructure.algorithms.parent.SearchAlgorithm;
import algorithmsAndDataStructure.domain.Airport;

import java.time.LocalTime;
import java.util.List;

/**
 * Created by taylan on 12.11.2016.
 * <p>
 * LinearSearch is just Brute-Force algorithm type that you are starting from index 0 at collection
 * than you try over each element in pool of data.
 */
public class LinearSearchAlgorithm extends SearchAlgorithm {

    // Result From record 6000: FOUND: "FlyPortugal", in: 3000000 nanoseconds. CLASSIC ARRAY - FOR EACH LOOP
    public void toFindInArray(String searchingCityInput, Airport[] exampleArray) {
        System.out.println("Starting Array in LINEAR SEARCH");

        LocalTime startTime = LocalTime.now();

        for (Airport airport : exampleArray) {
            if (airport.getCity().equalsIgnoreCase(searchingCityInput)) {

                LocalTime finishTime = LocalTime.now();
                long resultTime = finishTime.toNanoOfDay() - startTime.toNanoOfDay();
                System.out.println("FOUND: " + searchingCityInput + ", in: " + resultTime + " nanoseconds. CLASSIC ARRAY");
                break;
            }
        }

        System.out.println("Finish Array in LINEAR SEARCH");
    }


    // Result From record 6000: FOUND: "FlyPortugal", in: 1000000 nanoseconds. ARRAY LIST FOR EACH LOOP
    public void toFindInList(String searchingCityInput, List<Airport> airportsList) {
        System.out.println("Starting List in LINEAR SEARCH");
        LocalTime startTime = LocalTime.now();

        for (Airport airport : airportsList) {
            if (airport.getCity().equalsIgnoreCase(searchingCityInput)) {

                LocalTime finishTime = LocalTime.now();
                long resultTime = finishTime.toNanoOfDay() - startTime.toNanoOfDay();
                System.out.println("FOUND: " + searchingCityInput + ", in: " + resultTime + " nanoseconds. ARRAY LIST");
                break;
            }
        }

        System.out.println("Finished List in LINEAR SEARCH");
    }
}
