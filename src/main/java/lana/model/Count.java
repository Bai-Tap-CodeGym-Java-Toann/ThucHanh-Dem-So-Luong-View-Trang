package lana.model;

public class Count {
    private int countNumber;

    public Count(int countNumber) {
        this.countNumber = countNumber;
    }

    public Count() {
    }

    public int getCountNumber() {
        return countNumber;
    }

    public void setCountNumber(int countNumber) {
        this.countNumber = countNumber;
    }

    public void increment() {
        countNumber++;
    }
}
