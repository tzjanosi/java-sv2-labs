package interfacestaticmethods.vehicle;

import interfacestaticmethods.schoolcild.LowerClassSchoolChild;
import interfacestaticmethods.schoolcild.UpperClassSchoolChild;

public interface Vehicle {
    static Vehicle of(int numberOfWheels){
        if(numberOfWheels==2 || numberOfWheels==4){
            if(numberOfWheels==2){
                return new Bicycle(numberOfWheels);
            }
            else{
                return new Car(numberOfWheels);
            }
        }
        else{
            throw new IllegalArgumentException("This is neither a bicycle nor a car.");
        }
    }
}
