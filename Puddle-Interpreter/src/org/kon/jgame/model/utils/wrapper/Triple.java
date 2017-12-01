package org.kon.jgame.model.utils.wrapper;

public class Triple<T, K, G> {
    private T first;
    private K second;;
    private G third;

    public Triple(T first, K second, G third){
        this.setFirst(first);
        this.setSecond(second);
        this.setThird(third);
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public K getSecond() {
        return second;
    }

    public void setSecond(K second) {
        this.second = second;
    }

    public G getThird() {
        return third;
    }

    public void setThird(G third) {
        this.third = third;
    }
}
