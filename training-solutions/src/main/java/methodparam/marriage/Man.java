package methodparam.marriage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Man {
    private String name;
    private List<RegisterDate> registerDates=new ArrayList<>();

    public Man(String name, LocalDate dateOfBirth) {
        if (name.isBlank()){
            throw new IllegalArgumentException("Name cannot be empty!");
        }
        if (dateOfBirth==null){
            throw new IllegalArgumentException("We need a date of birth!");
        }
        this.name = name;
        RegisterDate registerDate=new RegisterDate("születés ideje",dateOfBirth);
        addRegisterDate(registerDate);
    }
    public void addRegisterDate(RegisterDate registerDate){
        registerDates.add(registerDate);
    }

    public List<RegisterDate> getRegisterDates() {
        return registerDates;
    }

    public String getName() {
        return name;
    }

}
