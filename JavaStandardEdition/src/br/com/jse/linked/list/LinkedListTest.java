package br.com.jse.linked.list;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addOnInit("a");
        list.addOnInit("b");
        list.addOnInit("c");

        list.addOnEndOfList("end");

        Cell cell = new Cell();
        cell.setElement("m");

        list.addOnMiddle(cell, 2);

        System.out.println(list.toString());


    }
}
