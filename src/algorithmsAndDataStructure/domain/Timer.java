package algorithmsAndDataStructure.domain;

import java.time.LocalTime;

/**
 * Created by taylan on 12.11.2016.
 * <p>
 * To see time of Algorithm process isolatedly
 */
public class Timer {


    private LocalTime startInstant;
    private LocalTime finishInstant;


    public void printOutTime() {
        long processTime = this.finishInstant.toNanoOfDay() - this.startInstant.toNanoOfDay();
        if (processTime == 0)
            System.out.println("Algoritm Process took: NO-TIME");
        else
            System.out.println("Algoritm Process took: " + processTime / 1000000000.00 + " second(s).");
    }

    public LocalTime getStartInstant() {
        return startInstant;
    }

    public void setStartInstant(LocalTime startInstant) {
        this.startInstant = startInstant;
    }

    public LocalTime getFinishInstant() {
        return finishInstant;
    }

    public void setFinishInstant(LocalTime finishInstant) {
        this.finishInstant = finishInstant;
    }
}
