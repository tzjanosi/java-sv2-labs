package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl introcontrol=new IntroControl();
        System.out.println("subtractTenIfGreaterThanTen(9): "+introcontrol.subtractTenIfGreaterThanTen(9));
        System.out.println("subtractTenIfGreaterThanTen(10): "+introcontrol.subtractTenIfGreaterThanTen(10));
        System.out.println("subtractTenIfGreaterThanTen(11): "+introcontrol.subtractTenIfGreaterThanTen(11));

        System.out.println();
        System.out.println("describeNumber(10): "+introcontrol.describeNumber(10));
        System.out.println("describeNumber(0): "+introcontrol.describeNumber(0));

        System.out.println();
        System.out.println("greetingToJoe(Jack): "+introcontrol.greetingToJoe("Jack"));
        System.out.println("greetingToJoe(Joe): "+introcontrol.greetingToJoe("Joe"));
        System.out.println("greetingToJoe(joe): "+introcontrol.greetingToJoe("joe"));

        System.out.println();
        System.out.println("calculateBonus(999999): "+introcontrol.calculateBonus(999999));
        System.out.println("calculateBonus(1000000): "+introcontrol.calculateBonus(1000000));
        System.out.println("calculateBonus(1000009): "+introcontrol.calculateBonus(1000009));
        System.out.println("calculateBonus(1000011): "+introcontrol.calculateBonus(1000011));

        System.out.println();
        System.out.println("calculateConsumption(9900,9998): "+introcontrol.calculateConsumption(9900,9998));
        System.out.println("calculateConsumption(9998,3): "+introcontrol.calculateConsumption(9998,3));
        System.out.println("calculateConsumption(3,3): "+introcontrol.calculateConsumption(3,3));

        System.out.println();
        System.out.println("printNumbers(6):");
        introcontrol.printNumbers(6);

        System.out.println();
        System.out.println("printNumbersBetween(4,7):");
        introcontrol.printNumbersBetween(4,7);

        System.out.println();
        System.out.println("printNumbersBetween(-4,7):");
        introcontrol.printNumbersBetween(-4,7);

        System.out.println();
        System.out.println("printNumbersBetween(7,4):");
        introcontrol.printNumbersBetween(7,4);

        System.out.println();
        System.out.println("printNumbersBetweenAnyDirection(4,7):");
        introcontrol.printNumbersBetweenAnyDirection(4,7);

        System.out.println();
        System.out.println("printNumbersBetweenAnyDirection(-4,7):");
        introcontrol.printNumbersBetweenAnyDirection(-4,7);

        System.out.println();
        System.out.println("printNumbersBetweenAnyDirection(7,4):");
        introcontrol.printNumbersBetweenAnyDirection(7,4);

        System.out.println();
        System.out.println("printOddNumbers(0):");
        introcontrol.printOddNumbers(0);
        System.out.println("printOddNumbers(1):");
        introcontrol.printOddNumbers(1);
        System.out.println("printOddNumbers(2):");
        introcontrol.printOddNumbers(2);
        System.out.println("printOddNumbers(11):");
        introcontrol.printOddNumbers(11);


    }
}
