package lesson3;

import java.util.Collection;
import java.util.Iterator;

public class CustomList<T> implements Collection<T> {

    private Object [] data;
    private int size;

    public CustomList() {
        data = new Object[100];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @SuppressWarnings(value = "unchecked")
    public T get(int index) {
        return (T) data[index];
    }

    public void set(T value, int index) {
        if (index < 0 || index >= size()) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        data[index] = value;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        data[size++] = t;
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < size; i++) {
            s.append(data[i]).append(' ');
        }
        return s.toString();
    }

    @Override
    public void clear() {

    }
}
