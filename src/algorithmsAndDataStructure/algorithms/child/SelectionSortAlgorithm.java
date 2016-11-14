package algorithmsAndDataStructure.algorithms.child;

import algorithmsAndDataStructure.algorithms.parent.SortAlgorithm;
import algorithmsAndDataStructure.domain.Airport;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

/**
 * Logic is basic:
 * <p>
 * 1- Find smallest
 * 2- Put it onto most far side you pick for smallest
 * 3- Continue for opposite direction to do same on remainings.
 */
class SelectionSortAlgorithm extends SortAlgorithm {


    // BenchMarking: Data: 6050 , Algoritm Process took: 305000000 nanoseconds.
    @Override
    public void toSortArray(Airport[] airportList) {
        System.out.println("START SELECTIONSORT ALGORITHM in CLASSIC ARRAY");

        algorithmTimer.setStartInstant(LocalTime.now());
        int indexMin;
        for (int i = 0; i < airportList.length - 1; i++) {
            indexMin = i;

            for (int j = i + 1; j < airportList.length; j++)
                if (airportList[j].getCity().compareTo(airportList[indexMin].getCity()) < 0)
                    indexMin = j;

            swap(Arrays.asList(airportList), indexMin, i);
        }
        algorithmTimer.setFinishInstant(LocalTime.now());
        algorithmTimer.printOutTime();

        System.out.println("FINISH SELECTIONSORT ALGORITHM in CLASSIC ARRAY");
    }


    // BenchMarking: Data: 6050 , Algoritm Process took: 323000000 nanoseconds.
    @Override
    public void toSortList(List<Airport> airportList) {
        System.out.println("START SELECTIONSORT ALGORITHM IN LIST");

        algorithmTimer.setStartInstant(LocalTime.now());
        int indexMin;
        for (int i = 0; i < airportList.size() - 1; i++) {

            indexMin = i;

            for (int j = i + 1; j < airportList.size(); j++)
                if (airportList.get(j).getCity().compareTo(airportList.get(indexMin).getCity()) < 0)
                    indexMin = j;

            swap(airportList, indexMin, i);
        }
        algorithmTimer.setFinishInstant(LocalTime.now());
        algorithmTimer.printOutTime();

        System.out.println("FINISH SELECTIONSORT ALGORITHM IN LIST");
    }
}
