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


    // BenchMarking: Result From record 6050: FOUND: "FlyPortugal", in: Algoritm Process took: 0.002 second(s).
    @Override
    public void toFindInLinkedList(String searchingCityInput, List<Airport> airportsList) {
        System.out.println();
        System.out.println("Start LINEAR SEARCH in LINKEDLIST");

        algorithmTimer.setStartInstant(LocalTime.now());

        for (Airport airport : airportsList) {
            if (airport.getCity().equalsIgnoreCase(searchingCityInput)) {

                algorithmTimer.setFinishInstant(LocalTime.now());
                algorithmTimer.printOutTime();
                break;
            }
        }

        System.out.println("Finish LINEAR SEARCH in LINKEDLIST");
        System.out.println();
    }

    // BenchMarking: Result From record 6050: FOUND: "FlyPortugal", in: Algoritm Process took: 0.003 second(s).
    public void toFindInArray(String searchingCityInput, Airport[] exampleArray) {
        System.out.println();
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
        System.out.println();
    }


    // BenchMarking: Result From record 6050: FOUND: "FlyPortugal", in: Algoritm Process took: 0.003 second(s).
    public void toFindInList(String searchingCityInput, List<Airport> airportsList) {
        System.out.println();
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
        System.out.println();
    }
}
