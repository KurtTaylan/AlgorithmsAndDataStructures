package algorithmsAndDataStructure.algorithms.child;

import algorithmsAndDataStructure.algorithms.parent.SortAlgorithm;
import algorithmsAndDataStructure.domain.Airport;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

/**
 * This type of algorithm is logicly working on opposite direction with SelectionSortAlgorithm.
 * <p>
 * Pseudo Code:
 * <p>
 * 1- We are starting position 1 and each loop we are checking if 1 less position is smaller or not
 * 2-If its not;
 * 2.1-Swap them
 * 2.2- if it is, continue for next position.
 */
class MysterySortAlgorithm extends SortAlgorithm {


    // Data: 6050 , Algoritm Process took: 141000000 nanoseconds. // half of Selection Sort algorithm: 305000000
    @Override
    public void toSortArray(Airport[] airports) {
        System.out.println("START mysterySorty ALGORITHM in CLASSIC ARRAY");

        algorithmTimer.setStartInstant(LocalTime.now());
        int currentId;

        for (int position = 1; position < airports.length; position++) {
            currentId = position;

            while (currentId > 0 && airports[currentId].getCity().compareTo(airports[currentId - 1].getCity()) < 0) {

                swap(Arrays.asList(airports), currentId, currentId - 1);
                currentId = currentId - 1;
            }
        }
        algorithmTimer.setFinishInstant(LocalTime.now());
        algorithmTimer.printOutTime();

        System.out.println("FINISH mysterySorty ALGORITHM in CLASSIC ARRAY");
    }


    // Data: 6050 , Algoritm Process took: 115000000 nanoseconds. // half of Selection Sort algorithm: 323000000
    @Override
    public void toSortList(List<Airport> airportList) {

        System.out.println("START mysterySorty ALGORITHM in LIST");

        algorithmTimer.setStartInstant(LocalTime.now());
        int currentId;

        for (int position = 1; position < airportList.size(); position++) {
            currentId = position;

            while (currentId > 0 && airportList.get(currentId).getCity().compareTo(airportList.get(currentId - 1).getCity()) < 0) {

                swap(airportList, currentId, currentId - 1);
                currentId = currentId - 1;
            }

        }
        algorithmTimer.setFinishInstant(LocalTime.now());
        algorithmTimer.printOutTime();

        System.out.println("FINISH mysterySorty ALGORITHM in LIST");

    }
}
