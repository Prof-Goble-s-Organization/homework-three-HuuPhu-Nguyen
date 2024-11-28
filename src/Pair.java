package hw03;

public class Pair<T1, T2>{
    private T1 firstValue;
    private T2 secondValue;

    public Pair(T1 firstValue, T2 secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public T1 getFirst() {
        return firstValue;
    }

    public T2 getSecond() {
        return secondValue;
    }

    public void setFirst(T1 firstValue) {
        this.firstValue = firstValue;
    }

    public void setSecond(T2 secondValue) {
        this.secondValue = secondValue;
    }

    public static void main(String[]args){
        Pair intPair = new Pair(Integer.valueOf(1), Integer.valueOf(2));
        Pair mixPair = new Pair(Double.valueOf(1.1), new String("abc"));
        Pair pairPair = new Pair(intPair, mixPair);
    }
}
