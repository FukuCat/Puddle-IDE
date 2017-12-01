package org.kon.jgame.model.utils.wrapper;

public class Tuple<T, K, G, N> {
    private T first;
    private K second;;
    private G third;
    private N fourth;

    public Tuple(T first, K second, G third, N fourth){
        this.setFirst(first);
        this.setSecond(second);
        this.setThird(third);
        this.setFourth(fourth);
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

    public N getFourth() {
        return fourth;
    }

    public void setFourth(N fourth) {
        this.fourth = fourth;
    }
}
