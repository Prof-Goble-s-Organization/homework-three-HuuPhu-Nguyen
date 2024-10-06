package hw03;

/**
 * Interface specifying a Queue ADT
 *
 * @author William Goble
 * @author Dickinson College
 * @version Feb 8, 2024
 */
public interface CS232Queue<T> {
    /**
     * Add the provided Object to the end of the Queue.
     *
     * @param T
     *              the Object to add
     */
    public void add(T T);

    /**
     * Remove and return the Object at the head of the Queue.
     *
     * @return T
     *          the Object at the head of the Queue or null
     *          if the Queue is empty.
     */
    public T remove();

    /**
     * Return a reference to the Object at the head of the Queue without
     * removing it from the Queue.
     *
     * @return T
     *          a reference to the Object at the head of the Queue or
     *          null if the Queue is empty.
     */
    public T peek();

    /**
     * Return the number of elements in the Queue.
     *
     * @return
     *          the size of the Queue.
     */
    public int size();
}
