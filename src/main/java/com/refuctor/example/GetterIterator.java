package com.refuctor.example;

import java.util.Iterator;

class GetterIterator implements Iterator<Getter>, Iterable<Getter> {
    private GetterGetter gg;
    private int part;

    GetterIterator() {
        this.part = 1;
        this.gg = new GetterGetter();
    }

    @Override
    public boolean hasNext() {
        return part <= 5;
    }

    @Override
    public Getter next() {
        return gg.createGetter(part++);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator<Getter> iterator() {
        return this;
    }
}
