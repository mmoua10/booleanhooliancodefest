package javaCode;

public interface List<T> car {

    boolean add(T element) throws NullPointerException;
    T get(int index) throws IndexOutOfBoundsException;
    boolean update(int index, T element) throws IndexOutOfBoundsException, NullPointerException;
}
