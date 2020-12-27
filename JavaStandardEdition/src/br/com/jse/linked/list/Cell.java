package br.com.jse.linked.list;

public class Cell {
    private Object element;
    private Cell next;
    private int indice;

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

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "element=" + element +
                ", next=" + next +
                '}';
    }
}
