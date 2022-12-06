public class Vector<T> implements IArray {

    private T[] array;
    private int vector;
    private int size;

    public Vector(int capacity) {
        vector = capacity;
        array = (T[]) new Object[vector];
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void add(Object item) {

        if (size == array.length) {
            resize();
        }

        array[getSize()] = (T) item;
        size++;
    }

    @Override
    public T get(int index) {
        return array[index];
    }

    @Override
    public void add(Object item, int index) {
        if (get(index) != null) {
            T temp = get(index);
            array[index] = (T) item;
            T[] newArray = (T[]) new Object[array.length + 1];

            for (int i = 0; i < index; i++) {
                newArray[i] = array[i];
            }
            newArray[index] = (T) item;
            newArray[index + 1] = temp;
            for (int i = index + 2; i < array.length; i++) {
                newArray[i] = array[i];
            }
        }else {
            array[index] = (T) item;
        }
    }

    private void resize() {

        var newArray = new Object[array.length + vector];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        array = (T[]) newArray;
    }

    public T[] getArray() {
        return array;
    }

    public int getVector() {
        return vector;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
