package org.kon.jgame.model.utils.wrapper;

public class Pair<T, K> {
    private T first;
    private K second;

    public Pair(T first, K second){
        this.setFirst(first);
        this.setSecond(second);
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
}
