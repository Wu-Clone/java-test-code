package source.com.generic;

public class GenericTest<T> {
    private T data;

    public GenericTest(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
