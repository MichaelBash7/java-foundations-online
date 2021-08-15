package ru.itsjava.collections.lists.linkedlist;



public class MyLinkedList {
    private Node head;


    public int size() {
        if(head == null) return 0;

        int size = 1;
        Node curNode = head;
        while (curNode.getNext() != null){
            curNode = curNode.getNext();
            size++;
        }
        return size;
    }

    public boolean isEmpty() {
        if (head != null) {
            return false;
        } else {
            return true;
        }
    }
    public boolean contains(Object o) {
        Node i;
        for (i = head; i != null; i = i.getNext()){
            if (i.getValue().equals(o)) {
                return true;
            }
        }
        return false;
    }

    public boolean add(Object o) {
        Node resNode = new Node(o, null);
        if (head == null){
            head = resNode;
        }else {

            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(resNode);
        }
        return true;
    }

    public boolean remove(Object o) {
        return false;
    }

    public void clear() {
        head = null;
    }

    public Object get(int index) {

        if (isEmpty()) {
            return null;
        }

        if (index < 0 || index > size()) {
            return null;
        }
        int i = 0;
        Node curNode = head;
        while (curNode != null) {
            if (i == index) {
                return curNode.getValue();
            }
            curNode = curNode.getNext();
            i++;

        }
        return null;
    }

    public Object set(int index, Object element) {

        if (!isCorrectIndex(index)){
            throw new ArrayIndexOutOfBoundsException("Некорректный индекс");

        }
        Node curNode = head;
        int i = 0;
        while (i < index) {
            curNode = curNode.getNext();
            i++;
        }
        Object prevNode = curNode.getValue();
        curNode.setValue(element);

        return prevNode;
    }

    public void add(int index, Object element) {

    }

    //СТРОКА1 -> null
    //СТРОКА1 -> СТРОКА2 -> СТРОКА3-> null
    public Object remove(int index) {
        checkIndex(index);// проверяем корректный индекс или нет. Если он корректный, значит 1 элемент есть (это head)
        if (index == 0) {// если индекс = 0, удаляем head
            Object resValue = head.getValue();
            if (head.getNext() == null) { // если есть только head, присваиваем null
                head = null;
            } else {
                head = head.getNext(); // если нет, то передвиганм ссылку head на след элемент и рассматриваем только ее
            }
            return resValue;
        }
        // если мы не вернули ничего, значит есть минимум 2 элемента

        Node curNode = head; //элемент который хотим удалить
        Node prevNode = head; //предыдущий элемент
        int count = 0;
        while ((curNode = curNode.getNext()) != null) { //теперь curNode.getNext переместили и он равен строке2
            count++;//пробегаемся по листу
            if (count == index) { //проверка на выход
                break;
            }
            prevNode = prevNode.getNext();//если мы не вышли, то перемещаем prevNode
        }
        Object resValue = curNode.getValue();

        if (curNode.getNext() == null) { // если хотим удалить элемент с конца (строка3)
            prevNode.setNext(null); // предыдущему эл-ту (строка2) присваиваем null
        } else { // если это не последний ->
            prevNode.setNext(curNode.getNext()); // если хотим удалить посередине, нужно перекинуть ссылку и (строка2) присвоить null
            // prevNode(строка1).setnext (ссылка) curNode.getNext (строка3)
            curNode.setNext(null);// у текущего элемента делем ссылку null
        }
        return resValue;
    }

    private void checkIndex(int index) {
        if (!isCorrectIndex(index)){
            throw new ArrayIndexOutOfBoundsException("Некорректный индекс");
        }
    }

    private boolean isCorrectIndex(int index){
        if (index > -1 && index < size()){
            return true;
        }
        return false;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "MyLinkedList { " + "head = " + head + " }";
    }
}
