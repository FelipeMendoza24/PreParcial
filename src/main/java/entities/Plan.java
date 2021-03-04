package entities;

import java.util.ArrayList;
import java.util.List;

public class Plan {

    public static final int MIN_BEATS = 90;
    public static final int MAX_BEATS = 160;

    private long number;
    private String type;
    private Cyclist cyclist;
    private List<Week> weeks;

    public Plan(long number) {
        this.number = number;
        this.weeks = new ArrayList<>();
    }

    /**
     *
     * @param type H heart care plan
     * @param cyclist
     */
    public Plan(String type, Cyclist cyclist){
        this.type = type;
        this.cyclist = cyclist;

    }
    public void addWeek(Week week) {
        this.weeks.add(week);
    }

    public long getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public Cyclist getCyclist() {
        return cyclist;
    }

    public double averageBeats(){

        double wab = 0;
        for(Week w:this.weeks){
            wab += w.averageBeats();
        }
        return this.weeks.size() == 0 ? 0 : wab / this.weeks.size();
    }
}
