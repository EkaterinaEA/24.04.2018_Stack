public class App {
    public static void main(String[] args) {
        LinkedListStack linkedListStack = new LinkedListStack();
        linkedListStack.push(10);
        linkedListStack.push(20);
        linkedListStack.push(30);
        linkedListStack.push(40);
        System.out.println(linkedListStack.toString());
        linkedListStack.pop();
        linkedListStack.pop();
        System.out.println(linkedListStack.toString());
        linkedListStack.pop();
        System.out.println(linkedListStack.toString());
    }
}
