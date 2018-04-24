public class LinkedListStack<T> {
    private final LinkedList<T> linkedList = new LinkedList<T>();

    public void push(T data){
        linkedList.push(data);
    }

    public T pop(){
        return linkedList.pop();
    }

    public String toString(){
        return linkedList.toString();
    }

    public boolean isEmpty(){
        return linkedList.isEmpty();
    }
}
