package person;

public class Person {
    public int number;
    public long longNumber;
    public double doubleNumber;
    public boolean isItTrueOrFalse;
    public String sayYourName;

    public Person(int number, long longNumber, double doubleNumber, boolean isItTrueOrFalse, String sayYourName) {
        this.number = number;
        this.longNumber = longNumber;
        this.doubleNumber = doubleNumber;
        this.isItTrueOrFalse = isItTrueOrFalse;
        this.sayYourName = sayYourName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "number=" + number +
                ", longNumber=" + longNumber +
                ", doubleNumber=" + doubleNumber +
                ", isItTrueOrFalse=" + isItTrueOrFalse +
                ", sayYourName='" + sayYourName + '\'' +
                '}';
    }
}
