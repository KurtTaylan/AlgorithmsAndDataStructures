package algorithmsAndDataStructure.algorithms.child;

import algorithmsAndDataStructure.algorithms.parent.SortAlgorithm;
import algorithmsAndDataStructure.domain.Airport;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * In most situations the QuickSort is fastest sorting algorithm
 * <p>
 * It works by
 * 1- Partitioning arrays so that the smaller numbers are on the left
 * and the larger are on the right.
 * 2- Recursively sends small parts of larger arrays to itself and partitions again
 * <p>
 * :By partitioning we select pivot value to organize smaller numbers THAN PIVOT VALUE on left side bigger ones on right.
 * <p>
 * <p>
 * Arrays.sort() method uses quick sort algorithm to sort array of primitives. It's different than our algorithm,
 * and uses two pivots. Good thing is that it perform much better than most of the quicksort algorithm available on
 * internet for different data sets, where traditional quick sort perform poorly.
 * <p>
 * Asymtotic Anaylsis:
 * Best Case: O(nLog(n))
 * Worst Case: O(n^2)
 * <p>
 * Memory: O(log(n))
 * Completness: No guarantee of O(nLog(n)) rate
 */
class QuickSortAlgorithm extends SortAlgorithm {


    @Override
    public void toSortArray(Airport[] airports) {
        System.out.println();
        System.out.println("START QuickSortAlgorithm IN CLASIC ARRAY WITH BUILT-IN");
        algorithmTimer.setStartInstant(LocalTime.now());
        Comparator<Airport> byCityName = (firstElement, secondElement) ->
                firstElement.getCity().compareTo(secondElement.getCity());

        Arrays.sort(airports, byCityName);

        algorithmTimer.setFinishInstant(LocalTime.now());
        algorithmTimer.printOutTime();
        System.out.println("FINISH QuickSortAlgorithm IN CLASIC ARRAY WITH BUILT-IN");
        System.out.println();
    }


    //BenchMarking: Algoritm Process took: 10000000 nanoseconds. Merge Sort took 5000000 nanoseconds.
    @Override
    public void toSortList(List<Airport> list) {
        System.out.println();
        System.out.println("START QuickSortAlgorithm IN LIST");
        algorithmTimer.setStartInstant(LocalTime.now());

        quicksort(list, 0, list.size() - 1);

        algorithmTimer.setFinishInstant(LocalTime.now());
        algorithmTimer.printOutTime();
        System.out.println("FINISH QuickSortAlgorithm IN LIST");
        System.out.println();
    }


    @Override
    public void toSortLinkedList(List<Airport> list) {
        System.out.println();
        System.out.println("START QuickSortAlgorithm IN LINKEDLIST");
        algorithmTimer.setStartInstant(LocalTime.now());

        quicksort(list, 0, list.size() - 1);

        algorithmTimer.setFinishInstant(LocalTime.now());
        algorithmTimer.printOutTime();
        System.out.println("FINISH QuickSortAlgorithm IN LINKEDLIST");
        System.out.println();
    }

    private void quicksort(List<Airport> list, int leftIndex, int rightIndex) {

        Airport pivot = list.get(leftIndex + (rightIndex - leftIndex) / 2);
        int leftPoint = leftIndex;
        int rightPoint = rightIndex;


        while (leftPoint <= rightPoint) {
            while (list.get(leftPoint).getCity().compareTo(pivot.getCity()) < 0) {
                leftPoint++;
            }
            while (list.get(rightPoint).getCity().compareTo(pivot.getCity()) > 0) {
                rightPoint--;
            }
            if (leftPoint <= rightPoint) {
                swap(list, leftPoint, rightPoint);
                leftPoint++;
                rightPoint--;
            }
        }

        if (leftIndex < rightPoint)
            quicksort(list, leftIndex, rightPoint);
        if (leftPoint < rightIndex)
            quicksort(list, leftPoint, rightIndex);
    }


}
