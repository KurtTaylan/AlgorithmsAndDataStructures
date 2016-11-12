package algorithmsAndDataStructure.algorithms.child;

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
        System.out.println("Start LINEAR SEARCH in CLASSIC ARRAY");

        algorithmTimer.setStartInstant(LocalTime.now());

        for (Airport airport : exampleArray) {
            if (airport.getCity().equalsIgnoreCase(searchingCityInput)) {

                algorithmTimer.setFinishInstant(LocalTime.now());
                algorithmTimer.printOutTime();
                break;
            }
        }

        System.out.println("Finish LINEAR SEARCH in CLASSIC ARRAY");
    }


    // Result From record 6000: FOUND: "FlyPortugal", in: 1000000 nanoseconds. ARRAY LIST FOR EACH LOOP
    public void toFindInList(String searchingCityInput, List<Airport> airportsList) {
        System.out.println("Start LINEAR SEARCH in LIST");

        algorithmTimer.setStartInstant(LocalTime.now());

        for (Airport airport : airportsList) {
            if (airport.getCity().equalsIgnoreCase(searchingCityInput)) {

                algorithmTimer.setFinishInstant(LocalTime.now());
                algorithmTimer.printOutTime();
                break;
            }
        }

        System.out.println("Finished LINEAR SEARCH in LIST");
    }
}
