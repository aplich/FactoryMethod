import units.*;

public class Main {
    public static void main(String args[]) {
    Factory factory = new UnitFactory();
    Unit objectA = factory.createUnit(UnitType.ObjectA);
    Unit objectB = factory.createUnit(UnitType.ObjectB);

        System.out.println("ObjectA: "+objectA);
        System.out.println("ObjectB: "+objectB);
    }
}
