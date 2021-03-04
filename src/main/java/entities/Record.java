package entities;

/**
 * Esta clase representa un registro del atleta.
 *
 * - beats, no puede ser menor a 30;
 */

public class Record {

    private int beats;

    public Record(int beats) {
        this.beats = beats;
    }

    public double getBeats() {
        return this.beats;
    }
}
