package ru.job4j.dequeue;

import java.util.*;

public class ReconstructPhrase {
    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder str = new StringBuilder();
        Iterator<Character> it = evenElements.iterator();
        for (int i = 0; it.hasNext(); i++) {
            if (i % 2 == 0) {
                str.append(it.next());
            } else {
                it.next();
            }
        }
        return str.toString();
    }

    private String getDescendingElements() {
        StringBuilder str = new StringBuilder();
        Iterator<Character> it = descendingElements.descendingIterator();
        for (int i = 0; it.hasNext(); i++) {
            str.append(it.next());
        }
        return str.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
