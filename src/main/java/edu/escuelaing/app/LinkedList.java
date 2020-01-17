package edu.escuelaing.app;

/**
E especifica el tipo de dato que entra a la LinkedList */
public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Serializable, Cloneable { 
    int size=0;
    Node<E> first;
    Node<E> last;

    public LinkedList(){
        List lista = new List();
    }

    /**
        Enlaza a en el primer elemento
    */
    private void linkFirst(E e) {
        Node<E> f = first;
        Node<E> newNode = new Node<E>(null, e, f);
        first = newNode;
        if (f == null){
            last = newNode;
        }else{
            f.prev = newNode;
        }
        size++;
    }

    /**
     * Enlaza en el ultimo elemento.
    */
    void linkLast(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null){
            first = newNode;   
        }else{
            l.next = newNode;
        }
        size++;
    }

    /**
     * Inserta el elemento e antes del nodo que no este null.
     */
    void linkBefore(E e, Node<E> succ){
        // assert succ != null;
        final Node<E> pred = succ.prev;
        final Node<E> newNode = new Node<>(pred, e, succ);
        succ.prev = newNode;
        if (pred == null){
            first = newNode;
        }else{
            pred.next = newNode;
        }
        size++;
    }

    /**
     * Desenlaza el primer nodo non-null
     */
    private E unlinkFirst(Node<E> f) {
        final E element = f.item;
        final Node<E> next = f.next;
        f.item = null;
        f.next = null; // help GC
        first = next;
        if (next == null){
            last = null;
        }else{
            next.prev = null;
        }
        size--;
        return element;
    }

     /**
     * Desenlaza el ultimo nodo non-null.
     */

    private E unlinkLast(Node<E> l) {
        // assert l == last && l != null;
        final E element = l.item;
        final Node<E> prev = l.prev;
        l.item = null;
        l.prev = null; // help GC
        last = prev;
        if (prev == null){
            first = null;
        }else{
            prev.next = null;
        }
        size--;
        return element;
    }

    /**
     * Desenlaza un nodo x que no sea null.
     */
    E unlink(Node<E> x) {
        final E element = x.item;
        final Node<E> next = x.next;
        final Node<E> prev = x.prev;
        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }
        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }
        x.item = null;
        size--;
        return element;
    }

    /**
     * Retorna el primer elemento en la lista
     *
     * @return the first element in this list
     * @throws NoSuchElementException if this list is empty
     */
    public E getFirst() {
        final Node<E> f = first;
        if (f == null){
            throw new NoSuchElementException();
        }
        return f.item;
    }

    /**
     * Retorna el ultimo elemento en la lista.
     *
     * @return the last element in this list
     * @throws NoSuchElementException if this list is empty
     */
    public E getLast() {
        final Node<E> l = last;
        if (l == null){
            throw new NoSuchElementException();
        }
        return l.item;
    }

    /**
     * Elimina el primer elemento de la lista.
     *
     * @throws NoSuchElementException if this list is empty
     */
    public E removeFirst() {
        final Node<E> f = first;
        if (f == null){
            throw new NoSuchElementException();
        }else{
            unlinkFirst(f);
        }
    }

    /**
     * Elimina el ultimo elemento de la lista.
     *
     * @throws NoSuchElementException if this list is empty
     */
    public E removeLast() {
        final Node<E> l = last;
        if (l == null){
            throw new NoSuchElementException();
        }else{
            unlinkLast(l);
        }
    }

    /**
     *Inserta el elemento especificado al inicio de la lista.
     *
     * @param e the element to add
     */
    public void addFirst(E e) {
        linkFirst(e);
    }

    /**
     * Inserta el elemento especificado al final de la lista..
     *
     * @param e the element to add
     */
    public void addLast(E e) {
        linkLast(e);
    }

    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements in this list
     */
    public int size() {
        return size;
    }



    static class Node { 
        int data; 
        Node next; 
        
        Node(int d){ 
            data = d; 
            next = null;
        } 
    } 
	
    public LinkedList addNode(LinkedList list, int data){ 
        Node new_node = new Node(data);
        new_node.next = null;
		
        if (list.head == null){ 
            list.head = new_node; 
		} 
        else{ 
            Node last = list.head; 
            while (last.next != null){ 
                last = last.next; 
            } 
            last.next = new_node; 
        } 
        return list; 
    }
	
    public static void printList(LinkedList list){ 
        Node currNode = list.head; 
        System.out.print("LinkedList: "); 
        while (currNode != null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next; 
        }
    }
}