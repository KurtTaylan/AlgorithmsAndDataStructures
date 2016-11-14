package algorithmsAndDataStructure.algorithms.commonBehavior;

import algorithmsAndDataStructure.domain.Airport;

import java.util.List;

/**
 * Sample try for Basic Data structure
 */
public interface Searchable {


    void toFindInArray(String searchingCityInput, Airport[] exampleArray);


    void toFindInList(String searchingCityInput, List<Airport> airportsList);


    void toFindInLinkedList(String searchingCityInput, List<Airport> airportsList);
}
