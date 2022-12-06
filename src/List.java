public interface List<T> {


    void enqueue(int priority, T item);

    T dequeue();

}
