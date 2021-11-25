package algorithmsmax;

public class Plane {
    public int getLongestOcean(String map){
        String[] waters=map.split("1");
        int maxlength=waters[1].length();
        for(String water:waters)
            if(water.length()>maxlength){
                maxlength=water.length();
            }
        return maxlength;
    }
}
