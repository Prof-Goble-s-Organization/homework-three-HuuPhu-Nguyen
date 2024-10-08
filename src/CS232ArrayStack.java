package hw03;

public class CS232ArrayStack<E> implements CS232Stack<E> {
    private CS232ArrayList<E> stack;

    public CS232ArrayStack() {
        this.stack=new CS232ArrayList();
    }

    @Override
    public void push(E e) {
        this.stack.add(e);
    }

    @Override
    public E pop() {
        return this.stack.remove(this.stack.size()-1);
    }

    @Override
    public E peek() {
        return this.stack.get(this.stack.size()-1);
    }

    @Override
    public int size() {
        return this.stack.size();
    }

}
