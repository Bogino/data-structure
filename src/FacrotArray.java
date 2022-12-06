public class FacrotArray<T> implements IArray {

    private T[] array;
    private int size;
    private int coefficient = 2;

    public FacrotArray(int capacity) {
        array = (T[]) new Object[capacity];
    }

    public FacrotArray() {
        array = (T[]) new Object[0];
    }

    @Override
    public int size() {
        return size;
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

    @Override
    public T get(int index) {
        return null;
    }

    private void resize() {

        var newArray = new Object[array.length * coefficient + 1];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        array = (T[]) newArray;
    }

    public T[] getArray() {
        return array;
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
