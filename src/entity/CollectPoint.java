package entity;

public class CollectPoint {
    private final Double latitude;
    private final Double longitute;

    public CollectPoint(Double latitude, Double longitute) {
        this.latitude = latitude;
        this.longitute = longitute;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitute() {
        return longitute;
    }
    
}
