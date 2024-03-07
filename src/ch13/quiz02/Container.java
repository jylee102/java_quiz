package ch13.quiz02;

public class Container<A, B> {
    private A key;
    private B value;

    public A getKey() {
        return key;
    }

    public B getValue() {
        return value;
    }

    public void set(A key, B value) {
        this.key = key;
        this.value = value;
    }
}
