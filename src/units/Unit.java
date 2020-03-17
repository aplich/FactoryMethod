package units;

abstract public class Unit {
        private String paramOne;
        private String paramTwo;
        private String paramThree;

    protected Unit(String paramOne, String paramTwo, String paramThree) {
        this.paramOne = paramOne;
        this.paramTwo = paramTwo;
        this.paramThree = paramThree;
    }

    public String getParamOne() {
        return paramOne;
    }

    public String getParamTwo() {
        return paramTwo;
    }

    public String getParamThree() {
        return paramThree;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "paramOne='" + paramOne + '\'' +
                ", paramTwo='" + paramTwo + '\'' +
                ", paramThree='" + paramThree + '\'' +
                '}';
    }
}
