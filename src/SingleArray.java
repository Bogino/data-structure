public class SingleArray<T> implements IArray {

    private T[] array;

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public void add(Object item) {

        resize();
        array[array.length] = (T) item;
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
        return array[index];
    }

    private void resize() {

        var newArray = new Object[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        array = (T[]) newArray;
    }
}
