package catalog;

import java.util.ArrayList;
import java.util.List;

public class CatalogItem {
    private String regNo;
    private int price;
    private List<Feature> features=new ArrayList<>();

    public CatalogItem(String regNo, int price, Feature ... features) {
        this.regNo = regNo;
        this.price = price;
        for(Feature feature:features){
            this.features.add(feature);
        }
    }

    public int numberOfPagesAtOneItem(){
        int total=0;
        for(Feature feature:features){
            total+=feature.getNumberOfPages();
        }
        return total;
    }

    public int fullLengthAtOneItem(){
        int total=0;
        for(Feature feature:features){
            total+=feature.getLength();
        }
        return total;
    }

    public List<String> getContributors(){
        List<String> output = new ArrayList<String>();

        for(Feature feature:features){
            output.addAll(feature.getContributors());
        }
        return output;
    }

    public List<String> getTitles(){
        List<String> output = new ArrayList<String>();

        for(Feature feature:features){
            output.add(feature.getTitle());
        }
        return output;
    }

    public boolean hasAudioFeature(){
        for(Feature feature:features){
            if(feature.getClass().getName()=="catalog.AudioFeatures"){
                return true;
            }
        }
        return false;
    }

    public boolean hasPrintedFeature(){
        for(Feature feature:features){
            if(feature.getClass().getName()=="catalog.PrintedFeatures"){
                return true;
            }
        }
        return false;
    }

    public String getRegistrationNumber() {
        return regNo;
    }

    public int getPrice() {
        return price;
    }

    public List<Feature> getFeatures() {
        return features;
    }
}
