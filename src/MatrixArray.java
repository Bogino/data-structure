public class MatrixArray<T> implements IArray {

    private IArray<IArray<T>> arrays;
    private final int defaultSize = 10;
    private int size;

    public MatrixArray() {

        var arrays = new FacrotArray<IArray<T>>();
        this.arrays = arrays;
        size = 0;
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Object item) {

        if (size == arrays.size() * defaultSize) {
            arrays.add(new FacrotArray<T>());
        }

        arrays.get(size() / defaultSize).add((T) item);
        size++;
    }

    @Override
    public void add(Object item, int index) {
    }


    @Override
    public T get(int index) {

        int outerIndex = index / defaultSize;
        int innerIndex = index % defaultSize;
        T item = arrays.get(outerIndex).get(innerIndex);

        return item;
    }
}
