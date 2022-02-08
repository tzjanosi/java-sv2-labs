package activity;

public class Coordinate {
    private double latitude;
    private double longitude;

    public Coordinate(double latitude, double longitude) {
        if(latitude<-90 || 90<latitude){
            throw new IllegalArgumentException("Latitude must be between -90 and 90 degrees!");
        }
        if(longitude<-180 || 180<longitude){
            throw new IllegalArgumentException("Longitude must be between -180 and 180 degrees!");
        }
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
