
public class Main {
    public static void main(String[] args) {

        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("test");
        myArrayList.add("test1");
        myArrayList.add("test2");
        myArrayList.add("test3");
        myArrayList.add("test4");
        myArrayList.add("test5");
        myArrayList.add("test6");
        myArrayList.add("test7");
        myArrayList.add("test8");
        myArrayList.add("test9");
        myArrayList.add("test10");
        myArrayList.add("test11");
        myArrayList.add("test12");
        myArrayList.add("test13");

        System.out.println("myArrayList index 0 = " + myArrayList.get(0));
        System.out.println("myArrayList index 13 = " + myArrayList.get(13));
        myArrayList.remove(10);
        System.out.println("myArrayList index 12 = " + myArrayList.get(12));
        System.out.println("myArrayList size = " + myArrayList.size());
        System.out.println("Clearing.....");
        myArrayList.clear();
        System.out.println("myArrayList size = " + myArrayList.size());
        System.out.println("_________________________________________________");


        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        myLinkedList.add("test1");
        myLinkedList.add("test2");
        myLinkedList.add("test3");
        myLinkedList.remove(2);
        System.out.println("myLinkedList index 0 = " + myLinkedList.get(0));
        System.out.println("myLinkedList size = " + myLinkedList.size());
        System.out.println("Clearing.....");
        myLinkedList.clear();
        System.out.println("myLinkedList size = " + myLinkedList.size());
        System.out.println("_________________________________________________");
        System.out.println("MyQueue");
        MyQueue<String> myQueue = new MyQueue<>();

        myQueue.add("testFirst");
        myQueue.add("test");
        myQueue.add("testLast");
        System.out.println("myQueue peek = " + myQueue.peek());
        System.out.println("myQueue size = " + myQueue.size());
        System.out.println("myQueue pool = " + myQueue.poll());
        System.out.println("myQueue size = " + myQueue.size());
        System.out.println("Clearing.....");
        myQueue.clear();
        System.out.println("myQueue size = " + myQueue.size());
        System.out.println("_________________________________________________");

        System.out.println("MyStack");
        MyStack<String> myStack = new MyStack<>();

        myStack.push("test1");
        myStack.push("test2");
        myStack.push("test3");
        myStack.pop();
        System.out.println("myStack size = " + myStack.size());

        System.out.println("myStack peek = " + myStack.peek());
        System.out.println("myStack size = " + myStack.size());
        System.out.println("Removing index 0 element.....");
        myStack.remove(0);
        System.out.println("myStack size = " + myStack.size());
        System.out.println("Clearing.....");
        myStack.clear();
        System.out.println("myStack size = " + myStack.size());
        System.out.println("_________________________________________________");

        System.out.println("MyHashMap");
        MyHashMap<String, String> myHashMap = new MyHashMap<>();
        myHashMap.put("element1key", "element1value");
        myHashMap.put("element2key", "element2value");
        myHashMap.put("element3key", "element3value");

        System.out.println("myHashMap size = " + myHashMap.size());
        System.out.println("myHashMap element 1 value = " + myHashMap.get("element1key"));

        System.out.println("Removing element 1.....");
        myHashMap.remove("element1key");
        System.out.println("myHashMap size = " + myHashMap.size());
        System.out.println("Clearing.....");
        myHashMap.clear();
        System.out.println("myHashMap size = " + myHashMap.size());
    }
}