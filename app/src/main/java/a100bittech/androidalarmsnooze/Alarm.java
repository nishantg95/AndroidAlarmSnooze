package a100bittech.androidalarmsnooze;

public class Alarm {
    private String aTime;
    private String aRecdays;
    private String aName;
    private boolean aToggle;

    public Alarm(String aTime, String aRecdays, String aName, boolean aToggle) {
        this.aTime = aTime;
        this.aRecdays = aRecdays;
        this.aName = aName;
        this.aToggle = aToggle;
    }

    public String getaTime() {
        return aTime;
    }

    public void setaTime(String aTime) {
        this.aTime = aTime;
    }

    public String getaRecdays() {
        return aRecdays;
    }

    public void setaRecdays(String aRecdays) {
        this.aRecdays = aRecdays;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public boolean isaToggle() {
        return aToggle;
    }

    public void setaToggle(boolean aToggle) {
        this.aToggle = aToggle;
    }
}