package n23.n2;

public interface Queue {
    // Pre: element != null
    // Post: size' = size + 1 && head' = head && tail' = (tail + 1) % arr.length && arr[tail'] = element
    <N> void enqueue(N element);

    // Pre: size > 0
    // Post: R = arr[head] && size' = size - 1 && head' = (head + 1) % arr.length && tail' = tail
    <N> N dequeue();

    // Pre: size > 0
    // Post: R = arr[head] && size' = size && head' = head && tail' = tail
    <N> N element();

    // Pre: true
    // Post: R = size && size' = size && head' = head && tail' = tail
    int size();

    // Pre: true
    // Post: R = (size == 0) && size' = size && head' = head && tail' = tail
    boolean isEmpty();

    // Pre: true
    // Post: size' = 0 && head' = -1 && tail' = -1
    void clear();

    // Pre: true
    // Post: R = arr && size' = size && head' = head && tail' = tail
    Object[] toArray();
}
