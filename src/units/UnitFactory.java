package units;

//przerobić na singletona
public class UnitFactory extends Factory {
    @Override
    public Unit createUnit(UnitType type) {
        switch(type)  {
            case ObjectA:
                return new ObjectA("pierwszyA", "drugiA", "trzeciA");
            case ObjectB:
                return new ObjectB("pierwszyB", "drugiB", "trzeciB");
            default:
                throw new UnsupportedOperationException("No such typer");
        }
    }
}
