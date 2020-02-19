package com.piechowicz.adam2;

import java.util.Iterator;

public class Main<E> implements Iterable<E> {
    private ListaIterable<E> begining;
    private ListaIterable<E> next;

    public Main() {
        begining = null;
    }

    public void wstawNaPoczatek(E data) {
        begining = new ListaIterable<E>(data, begining);
    }

    public ListaIterable<E> usunZPoczatku() {
        ListaIterable<E> temp = begining;
        begining = begining.pobierzNastepny();
        return temp;
    }

    public Iterator<E> iterator() {
        return new IteratorListy();
    }

    private class IteratorListy implements Iterator<E> {

        private ListaIterable<E> temp = begining;

        @Override
        public boolean hasNext() {
            return temp != null;
        }

        @Override
        public E next() {
            E obiekt = temp.pobierzObiekt();
            temp = temp.pobierzNastepny();
            return obiekt;
        }
    }

    public static void printList(Main dupa) {
        Iterator iterator = dupa.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
