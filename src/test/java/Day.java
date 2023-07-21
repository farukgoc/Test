public enum Day {
    MONDAY("Mon"),
    TUESDAY("Tue"),
    WEDNESDAY("Wed"),
    THURSDAY("Thu"),
    FRIDAY("Fri"),
    SATURDAY("Sat"),
    SUNDAY("Sun");

    private String shortName;

    Day(String shortName) {
        this.shortName = shortName;
    }

    public String getShortName() {
        return shortName;
    }


}
