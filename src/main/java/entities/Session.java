package entities;

public class Session {

    private Activity activity;

    public void assignActivity(Activity activity) {
        this.activity = activity;
    }

    public double averageBeats() {
        double aab = this.activity == null ? 0 : this.activity.averageBeats();
        return aab;
    }
}
