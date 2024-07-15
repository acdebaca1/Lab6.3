package edu.sdccd.cisc191;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SinglyLinkedListTest {
    @BeforeEach
    void setUp() {
    }
    @Test
    public void testPushAndRemove() {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        SinglyLinkedList<Integer>.Node head = sll.push(null, 0);
        head = sll.push(head, 1);
        head = sll.push(head, 2);
        head = sll.push(head, 3);
        head = sll.push(head, 4);
        assertEquals("4 3 2 1 0", sll.toString(head));

        head = sll.remove(head, 3);
        assertEquals("4 3 2 0", sll.toString(head));
    }
}