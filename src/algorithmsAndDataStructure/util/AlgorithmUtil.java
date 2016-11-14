package algorithmsAndDataStructure.util;

import algorithmsAndDataStructure.domain.Airport;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

/**
 * Helper class to handle preparation.
 */
public class AlgorithmUtil {


    public void prepareSampleList(List<? super Airport> airportsList) throws IllegalArgumentException {

        System.out.println("Started with preparation");

        File airPortFile = new File("/home/taylan/Desktop/AlgorithmsAndDataStructure/src/algorithmsAndDataStructure/resource/airlines.dat.txt");
        Path airPortPath = airPortFile.toPath();
        fillInAirportList(airPortPath, airportsList);

        assert airportsList.isEmpty() : "File is empty"; // enable assertion with "-ea" vm argument.
    }

    private void fillInAirportList(Path airPortPath, List<? super Airport> airportsList) {

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
