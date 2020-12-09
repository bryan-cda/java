package br.com.jse.linked.list;

public class Cell {
    private Object element;
    private Cell next;

    public Cell(Object element, Cell next) {
        this.element = element;
        this.next = next;
    }

    public Cell() {
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public Cell getNext() {
        return next;
    }

    public void setNext(Cell next) {
        this.next = next;
    }


    @Override
    public String toString() {
        return "Cell{" +
                "element=" + element +
                ", next=" + next +
                '}';
    }
}
