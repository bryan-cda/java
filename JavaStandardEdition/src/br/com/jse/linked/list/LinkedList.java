package br.com.jse.linked.list;

public class LinkedList {

    private Cell first = null;

    private int totalElements = 0;

    private Cell last = null;



    public void addOnInit(Object element){

        Cell cell = new Cell(element, first);

        this.first = cell;

        if(totalElements == 0){
            this.last = this.first;
        }

        this.first = cell;

        totalElements++;

    }

    public void addOnEndOfList(Object element){
        if(this.totalElements == 0){
            addOnInit(element);
        } else{
            Cell cell = new Cell(element, null);

            this.last.setNext(cell);
            this.last = cell;
            this.totalElements++;
        }
    }

    public boolean isValidPosition(int position){
        return position >= 0  && position < totalElements;
    }

    public Cell getCell(int position){
        if(!isValidPosition(position)){
            throw new IllegalArgumentException("invalid position");
        }
        Cell cell =  first;
        for(int i = 0; i < position; i++){
            cell = first.getNext();
        }
        return cell;
    }

    public void addOnMiddle(Cell cell, int position){
        Cell backCell = getCell(position-1);

        cell.setNext(backCell.getNext());
        backCell.setNext(cell);
    }

    public Cell getFirst() {
        return first;
    }

    public void setFirst(Cell first) {
        this.first = first;
    }

    public int getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(int totalElements) {
        this.totalElements = totalElements;
    }

    public Cell getLast() {
        return last;
    }

    public void setLast(Cell last) {
        this.last = last;
    }

    @Override
    public String toString () {

        if(this.totalElements == 0) {
            return "[]";
        }

        Cell current = first;

        StringBuilder builder = new StringBuilder("[");

        for(int i = 0; i < totalElements; i++) {
            builder.append(current.getElement());
            builder.append(",");

            current = current.getNext();
        }

        builder.append("]");

        return builder.toString();
    }
}
