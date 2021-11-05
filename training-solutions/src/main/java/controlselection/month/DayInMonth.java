package controlselection.month;

public class DayInMonth {
    public int numberOfDaysInMonth(int year, String honapNev) {
        String nagybetusHonapnev = honapNev.toUpperCase();
        int actualNumberOfDaysInMonth;
        switch (nagybetusHonapnev) {
            case "JANUÁR":
                actualNumberOfDaysInMonth = 31;
                break;
            case "FEBRUÁR":
                actualNumberOfDaysInMonth = (isLeapYear(year) ? 29 : 28);
                break;
            case "MÁRCIUS":
                actualNumberOfDaysInMonth = 31;
                break;
            case "ÁPRILIS":
                actualNumberOfDaysInMonth = 30;
                break;
            case "MÁJUS":
                actualNumberOfDaysInMonth = 31;
                break;
            case "JÚNIUS":
                actualNumberOfDaysInMonth = 30;
                break;
            case "JÚLIUS":
                actualNumberOfDaysInMonth = 31;
                break;
            case "AUGUSZTUS":
                actualNumberOfDaysInMonth = 31;
                break;
            case "SZEPTEMBER":
                actualNumberOfDaysInMonth = 30;
                break;
            case "OKTÓBER":
                actualNumberOfDaysInMonth = 31;
                break;
            case "NOVEMBER":
                actualNumberOfDaysInMonth = 30;
                break;
            case "DECEMBER":
                actualNumberOfDaysInMonth = 31;
                break;
            default:
                actualNumberOfDaysInMonth = 0;
        }
        return actualNumberOfDaysInMonth;
    }
    public boolean isLeapYear(int year){
        if(year%4==0 && (year%100>0 || year%400==0)){
            return true;
        }
        return false;
    }
}
