package algorithmsAndDataStructure.algorithms.parent;

import algorithmsAndDataStructure.domain.Airport;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Searching Algorithms family members will inherite from this.
 */
public abstract class SearchAlgorithm extends Algorithm {


    private static void copySamplePortionFromTo(List<Airport> airportsList, Airport[] exampleArray) {
        airportsList
                .forEach((Airport airport) -> exampleArray[airportsList.indexOf(airport)] = airport);
    }


    public abstract void toFindInArray(String searchingCityInput, Airport[] exampleArray);


    public abstract void toFindInList(String searchingCityInput, List<Airport> airportsList);


    public void doAlgorihtm() {
        System.out.println("Started with preparation");

        File airPortFile = new File("/home/taylan/Desktop/AlgorithmsAndDataStructure/src/algorithmsAndDataStructure/resource/airlines.dat.txt");
        Path airPortPath = airPortFile.toPath();

        List<Airport> airportsList = new ArrayList<>();
        fillInAirportList(airPortPath, airportsList);
        Airport[] exampleArray = new Airport[airportsList.size()];

        if (!airportsList.isEmpty()) {

            copySamplePortionFromTo(airportsList, exampleArray);
            System.out.println("Done with preparation");

            //Search for index in LinearSe
            String searchingCityInput = "\"FlyPortugal\"";
            toFindInArray(searchingCityInput, exampleArray);
            toFindInList(searchingCityInput, airportsList);
        }
    }

    private void fillInAirportList(Path airPortPath, List<Airport> airportsList) {

        try {

            BufferedReader reader = new BufferedReader(new FileReader(airPortPath.toFile()));

            String line;
            while ((line = reader.readLine()) != null) {

            /*
             *  5.- threeLetterCode
             *  6.- City
             *  7.- Country
             * */

                String lineList[] = line.split(",");
                Airport airportRecord = new Airport(lineList[4], lineList[5], lineList[6]);
                airportsList.add(airportRecord);
            } // File ready

        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
