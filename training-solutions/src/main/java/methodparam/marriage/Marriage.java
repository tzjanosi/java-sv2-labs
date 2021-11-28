package methodparam.marriage;

import java.time.LocalDate;

public class Marriage {
    public void getMarried(Woman woman, Man man){
        RegisterDate registerDate=new RegisterDate("házasságkötés ideje",LocalDate.now());
        man.addRegisterDate(registerDate);
        woman.addRegisterDate(registerDate);
        updateWomanName(woman, man);
    }
    private void updateWomanName(Woman woman, Man man){
        woman.setName(man.getName()+"né");
    }
}
