public class LinkedList<T> {
    public static class Node<T>{
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }

    private Node<T> first = null;

    public void push(T data){
        Node<T> newFirst = new Node<T>(data);
        newFirst.next = first;
        first = newFirst;
    }

    public T pop(){
        Node<T> oldFirst = first;
        first = first.next;
        return oldFirst.data;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        Node<T> current = first;
        while (current != null){
            stringBuilder.append(current).append(", ");
            current = current.next;
        }
        return stringBuilder.toString();
    }

    public boolean isEmpty(){
        return first == null;
    }

}
