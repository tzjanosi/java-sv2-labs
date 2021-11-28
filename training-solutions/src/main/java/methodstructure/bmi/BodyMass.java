package methodstructure.bmi;

public class BodyMass {
    private double weight;
    private double height;
    private double bmi;

    public BodyMass(double weight, double height) {
        this.weight = weight;
        this.height = height;
        this.bmi=weight/(height*height);
    }

    public void calculateBodyMassIndex(){
        bmi=weight/(height*height);
    }
    public double getBodyMassIndex(){
        return bmi;
    }
    public BmiCategory getBody(){
        BmiCategory bmiCategory;
        if(bmi<18.5){
            bmiCategory=BmiCategory.UNDERWEIGHT;
        }
        else if(bmi<=25){
            bmiCategory=BmiCategory.NORMAL;
        }
        else{
            bmiCategory=BmiCategory.OVERWEIGHT;
        }
        return bmiCategory;
    }
    public boolean isThinnerThan(BodyMass other){
        return this.getBodyMassIndex()<other.getBodyMassIndex();
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
}
