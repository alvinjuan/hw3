package hw3.problem1;

public class LinkedListTests extends Tests {

    public static void testAll() {
        testCopyConstructor();
        testRemove();
        testReverseIterative();
        testMergeSorted();
        testEmptyList();
        testListWithMultipleElements();
        testToString();
    }

    public static void testCopyConstructor() {
        // homework
        SingleLinkedList list = new SingleLinkedList();
        list.add(10000);
        SingleLinkedList copy = new SingleLinkedList(list);
        System.out.println("testCopyConstructor");
        System.out.println("List: " + list.toString());
        System.out.println("Copy: " + copy.toString());
        System.out.println();

    }

    public static void testRemove() {
        // homework
        SingleLinkedList list = new SingleLinkedList();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2);
        System.out.println("testRemove:");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println();
    }

    public static void testReverseIterative() {
        // homework
        SingleLinkedList list = new SingleLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("testReverseIterative");
        System.out.println(list);
        list.reverseIterative();
        System.out.println(list);
        System.out.println();

    }

    public static void testMergeSorted() {
        // homework
        SingleLinkedList list = new SingleLinkedList();
        list.add(1);
        list.add(3);
        SingleLinkedList merge = new SingleLinkedList();
        merge.add(2);
        merge.add(4);
        merge.add(5);
        System.out.println("testMergeSorted:");
        list.mergeSorted(merge);
        System.out.println(list);
    }

    private static void testListWithMultipleElements() {
        Item invalidItem = new Item(-1, false);
        SingleLinkedList list = new SingleLinkedList();

        // list as [-1, 1, 2]
        list.add(1);
        list.add(2);
        list.addFirst(-1);

        if (!assertEquals(list.size(), 3)) {
            System.out.println("testListWithOneElement FAILED");
            return;
        }
        if (!assertEquals(list.get(0), new Item(-1, true))) {
            System.out.println("testListWithOneElement FAILED");
            return;
        }
        if (!assertEquals(list.get(1), new Item(1, true))) {
            System.out.println("testListWithOneElement FAILED");
            return;
        }
        if (!assertEquals(list.get(2), new Item(2, true))) {
            System.out.println("testListWithOneElement FAILED");
            return;
        }
        if (!assertEquals(list.get(3), invalidItem)) {
            System.out.println("testListWithOneElement FAILED");
            return;
        }
        list.removeLast();
        if (!assertEquals(list.get(0), new Item(-1, true))) {
            System.out.println("testListWithOneElement FAILED");
            return;
        }
        if (!assertEquals(list.getLast(), new Item(1, true))) {
            System.out.println("testListWithOneElement FAILED");
            return;
        }
        list.removeFirst();
        if (!assertEquals(list.get(0), new Item(1, true))) {
            System.out.println("testListWithOneElement FAILED");
            return;
        }
        if (!assertEquals(list.getLast(), new Item(1, true))) {
            System.out.println("testListWithOneElement FAILED");
            return;
        }

        System.out.println("testListWithOneElement PASSED");
    }

    private static void testToString() {
        SingleLinkedList list = new SingleLinkedList();
        assertTrue(list.toString().isEmpty());
        list.add(1);
        if (!assertEquals(list.toString(), "1 -> end")) {
            System.out.println("testToString FAILED");
            return;
        }
        list.add(2);
        if (!assertEquals(list.toString(), "1 -> 2 -> end")) {
            System.out.println("testToString FAILED");
            return;
        }
        System.out.println("testToString PASSED");
    }

    private static void testEmptyList() {
        Item invalidItem = new Item(-1, false);
        SingleLinkedList list = new SingleLinkedList();

        if (!assertEquals(list.size(), 0)) {
            System.out.println("testEmptyList FAILED");
            return;
        }
        if (!assertEquals(invalidItem, list.getFirst())) {
            System.out.println("testEmptyList FAILED");
            return;
        }
        if (!assertEquals(invalidItem, list.getLast())) {
            System.out.println("testEmptyList FAILED");
            return;
        }
        if (!assertEquals(invalidItem, list.get(0))) {
            System.out.println("testEmptyList FAILED");
            return;
        }
        if (!assertTrue(list.toString().isEmpty())) {
            System.out.println("testEmptyList FAILED");
            return;
        }
        System.out.println("testEmptyList PASSED");
    }
}

