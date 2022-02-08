package activity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Track {
    private List<TrackPoint> trackPointsList=new ArrayList<>();

    public void addTrackPoint(TrackPoint trackPoint){
        trackPointsList.add(trackPoint);
    }

    public void loadFromGpx(InputStream resource){
        List<String> lines =
                new BufferedReader(new InputStreamReader(resource,
                        StandardCharsets.UTF_8)).lines().collect(Collectors.toList());
        process(lines);
    }

    private void process(List<String> lines) {
        for(int i=1;i< lines.size();i++){
            if(lines.get(i).trim().startsWith("<trkpt")){
                processTrackPoint(lines.get(i).trim(),lines.get(i+1).trim());
            }
        }
    }

    private void processTrackPoint(String coordinatesLine, String heightLine) {
        double lat= Double.parseDouble(coordinatesLine.substring(12,22));
        double lon= Double.parseDouble(coordinatesLine.substring(29,39));
        double height=Double.parseDouble(heightLine.substring(5,10));
//        System.out.println(lat+" - "+lon+" - "+height);
        addTrackPoint(new TrackPoint(new Coordinate(lat,lon),height));
    }

    public List<TrackPoint> getTrackPoints() {
        return trackPointsList;
    }

    public double getDistance(){
        double totalDistance=0;
        for(int i=1;i<trackPointsList.size();i++){
            totalDistance+=trackPointsList.get(i).getDistanceFrom(trackPointsList.get(i-1));
        }
        return totalDistance;
    }

    public double getFullElevation(){
        double fullElevation=0;
        double elevation;
        for(int i=1;i<trackPointsList.size();i++){
            elevation=trackPointsList.get(i).getElevation()-trackPointsList.get(i-1).getElevation();
            if(elevation>0){
                fullElevation+=elevation;
            }
        }
        return fullElevation;
    }

    public double getFullDecrease(){
        double fullDecrease=0;
        double decrease;
        for(int i=1;i<trackPointsList.size();i++){
            decrease=trackPointsList.get(i).getElevation()-trackPointsList.get(i-1).getElevation();
            if(decrease<0){
                fullDecrease+=decrease;
            }
        }
        return -1.0*fullDecrease;
    }

    public Coordinate findMinimumCoordinate(){
        double minLat=trackPointsList.get(1).getCoordinate().getLatitude();
        double minLon=trackPointsList.get(1).getCoordinate().getLongitude();
        Coordinate coordinate;
        for(int i=1;i<trackPointsList.size();i++){
            coordinate=trackPointsList.get(i).getCoordinate();
            if(coordinate.getLatitude()<minLat){
                minLat=coordinate.getLatitude();
            }
            if(coordinate.getLongitude()<minLon){
                minLon=coordinate.getLongitude();
            }
        }
        return new Coordinate(minLat,minLon);
    }
    public Coordinate findMaximumCoordinate(){
        double maxLat=trackPointsList.get(1).getCoordinate().getLatitude();
        double maxLon=trackPointsList.get(1).getCoordinate().getLongitude();
        Coordinate coordinate;
        for(int i=1;i<trackPointsList.size();i++){
            coordinate=trackPointsList.get(i).getCoordinate();
            if(coordinate.getLatitude()>maxLat){
                maxLat=coordinate.getLatitude();
            }
            if(coordinate.getLongitude()>maxLon){
                maxLon=coordinate.getLongitude();
            }
        }
        return new Coordinate(maxLat,maxLon);
    }

    public double getRectangleArea(){
        Coordinate minimumCoordinate=findMinimumCoordinate();
        Coordinate maximumCoordinate=findMaximumCoordinate();
        Coordinate intermediateCoordinate=new Coordinate(minimumCoordinate.getLatitude(),maximumCoordinate.getLongitude());

        TrackPoint minimumTrackpoint=new TrackPoint(minimumCoordinate,0);
        TrackPoint maximumTrackpoint=new TrackPoint(maximumCoordinate,0);
        TrackPoint intermediateTrackpoint=new TrackPoint(intermediateCoordinate,0);

        double side1=minimumTrackpoint.getDistanceFrom(intermediateTrackpoint);
        double side2=maximumTrackpoint.getDistanceFrom(intermediateTrackpoint);

        //return side1*side2;
        return (maximumCoordinate.getLongitude()-minimumCoordinate.getLongitude())*(maximumCoordinate.getLatitude()-minimumCoordinate.getLatitude());
    }

}
