package polymorphism.architect;

public class Architect {
    public static void main(String[] args) {
        Plan plan1= new SketchPlan(14, "Kertes ház");
        System.out.println("Pages of ducumentation: "+plan1.getPagesOfDocumentation());

        Plan plan2= new PermitPlan(14, "Kertes ház","Jánosi Tibor","Tündér u. 40.");
        System.out.println("Pages of ducumentation: "+plan2.getPagesOfDocumentation());

        Plan plan3= new ConstructionPlan(14, "Kertes ház","Jánosi Tibor","Tündér u. 40.",5);
        System.out.println("Pages of ducumentation: "+plan3.getPagesOfDocumentation());

        SketchPlan sketchPlan1= new SketchPlan(14, "Kertes ház");
        System.out.println("Title: "+sketchPlan1.getTitle()+", pages of ducumentation: "+sketchPlan1.getPagesOfDocumentation());

        SketchPlan sketchPlan2= new PermitPlan(14, "Kertes ház","Jánosi Tibor","Tündér u. 40.");
        System.out.println("Title: "+sketchPlan2.getTitle()+", pages of ducumentation: "+sketchPlan2.getPagesOfDocumentation());

        SketchPlan sketchPlan3= new ConstructionPlan(14, "Kertes ház","Jánosi Tibor","Tündér u. 40.",5);
        System.out.println("Title: "+sketchPlan3.getTitle()+", pages of ducumentation: "+sketchPlan3.getPagesOfDocumentation());

        Header header1= new PermitPlan(14, "Kertes ház","Jánosi Tibor","Tündér u. 40.");
        System.out.println("Name of client: "+header1.getNameOfClient()+", address of building: "+header1.getAddressOfBuilding());

        Header header2= new ConstructionPlan(14, "Kertes ház","Jánosi Tibor","Tündér u. 40.",5);
        System.out.println("Name of client: "+header2.getNameOfClient()+", address of building: "+header2.getAddressOfBuilding());

        PermitPlan permitPlan1= new PermitPlan(14, "Kertes ház","Jánosi Tibor","Tündér u. 40.");
        System.out.println("Title: "+permitPlan1.getTitle()+"; Pages of ducumentation: "+permitPlan1.getPagesOfDocumentation()+"; Name of client: "+permitPlan1.getNameOfClient()+"; Address of building: "+permitPlan1.getAddressOfBuilding());
        System.out.println(permitPlan1.getHeader());

        PermitPlan permitPlan2= new ConstructionPlan(14, "Kertes ház","Jánosi Tibor","Tündér u. 40.",5);
        System.out.println("Title: "+permitPlan2.getTitle()+"; Pages of ducumentation: "+permitPlan2.getPagesOfDocumentation()+"; Name of client: "+permitPlan2.getNameOfClient()+"; Address of building: "+permitPlan2.getAddressOfBuilding());
        System.out.println(permitPlan2.getHeader());

        ConstructionPlan constructionPlan= new ConstructionPlan(14, "Kertes ház","Jánosi Tibor","Tündér u. 40.",5);
        System.out.println("Title: "+constructionPlan.getTitle()+"; Pages of ducumentation: "+constructionPlan.getPagesOfDocumentation()+"; Name of client: "+constructionPlan.getNameOfClient()+"; Address of building: "+constructionPlan.getAddressOfBuilding()+"Number of sheets of counstruction drawings"+constructionPlan.getSheetsOfConstructionDrawings());
        System.out.println(constructionPlan.getHeader());

    }
}
