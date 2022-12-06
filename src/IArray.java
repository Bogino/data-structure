public interface IArray<T> {

    int size();

    void add(T item);

    void add(T item, int index);

    T get(int index);
}
