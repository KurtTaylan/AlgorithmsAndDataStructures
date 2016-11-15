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


    public void prepareAirportRoutesList(List<? super Airport> airportsList) throws IllegalArgumentException {

        System.out.println("Started with preparation");

        String projectDir = getProjectDir();
        assert projectDir != null : "File cannot be loaded because property could not fetched";

        File airPortFile = new File(projectDir + "/algorithmsAndDataStructure/resource/routes.txt");
        Path airPortPath = airPortFile.toPath();

        assert airportsList.isEmpty() : "File is empty"; // enable assertion with "-ea" vm argument.
    }


    public void prepareAirportList(List<? super Airport> airportsList) throws IllegalArgumentException {

        // Workaround for Native java project sample
        String projectDir = getProjectDir();
        assert projectDir != null : "File cannot be loaded because property could not fetched";

        File airPortFile = new File(projectDir + "/algorithmsAndDataStructure/resource/airlines.txt");
        Path airPortPath = airPortFile.toPath();
        fillInAirportList(airPortPath, airportsList);

        assert airportsList.isEmpty() : "File is empty"; // enable assertion with "-ea" vm argument.
    }

    private String getProjectDir() {
        String projectDir = null;
        String[] properties = System.getProperty("java.class.path").split(":+");

        for (int i = 0; i < properties.length; i++) {
            String currentProp = properties[i];
            if (currentProp.contains("AlgorihtmsAndDataStructure")) {
                projectDir = currentProp;
                break;
            }
        }
        return projectDir;
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
