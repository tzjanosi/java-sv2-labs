package controlselection.week;

public class DayOfWeeks {
    public String descriptionToDays(String dayOfWeekArg){
        String nagybetusHetNapja = dayOfWeekArg.toUpperCase();
        String description;
        switch(nagybetusHetNapja){
            case "HÉTFŐ":
                description="hét eleje";
                break;
            case "KEDD":
            case "SZERDA":
            case "CSÜTÖRTÖK":
                description="hét közepe";
                break;
            case "PÉNTEK":
                description="majdnem hétvége";
                break;
            case "SZOMBAT":
            case "VASÁRNAP":
                description="hétvége";
                break;
            default:
                description="ismeretlen nap";
        }
        return description;
    }

}

