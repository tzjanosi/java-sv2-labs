package activity;

public class TrackPoint {
    private Coordinate coordinate;
    private double height;

    public TrackPoint(Coordinate coordinate, double height) {
        this.coordinate = coordinate;
        this.height = height;
    }

    public double getDistanceFrom(TrackPoint anotherPoint){
        int earthRadiusInMeter=6371000;
        double latDistance = distanceInRad (anotherPoint.getCoordinate().getLatitude()-this.getCoordinate().getLatitude());
        double lonDistance = Math.toRadians(anotherPoint.getCoordinate().getLongitude()-this.getCoordinate().getLongitude());

        double temp = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(this.getCoordinate().getLatitude())) * Math.cos(Math.toRadians(anotherPoint.getCoordinate().getLatitude()))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double differenceInRadian = 2 * Math.atan2(Math.sqrt(temp), Math.sqrt(1 - temp));

        double lateralDistanceInMeter = earthRadiusInMeter * differenceInRadian; // convert to meters

        double height = anotherPoint.getElevation() - this.getElevation();

        double distance = Math.pow(lateralDistanceInMeter, 2) + Math.pow(height, 2);

        return Math.sqrt(distance);
    }

    private double distanceInRad(double differenceInDegree){
        return  Math.toRadians(differenceInDegree);
    }




    public Coordinate getCoordinate() {
        return coordinate;
    }

    public double getElevation() {
        return height;
    }
}
