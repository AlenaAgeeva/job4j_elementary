package ru.job4j.queue;

import java.util.Iterator;
import java.util.Queue;

public class AppleStore {
    private final Queue<Customer> queue;

    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        Customer customer = null;
        Iterator<Customer> it = queue.iterator();
        for (int i = 1; it.hasNext(); i++) {
            if (i == count) {
                customer = it.next();
                break;
            } else {
                it.next();
            }
        }
        return customer.name();
    }

    public String getLastUpsetCustomer() {

        Customer customer = null;
        Iterator<Customer> it = queue.iterator();
        for (int i = 1; it.hasNext(); i++) {
            if (i == count + 1) {
                customer = it.next();
                break;
            } else {
                it.next();
            }
        }
        return customer.name();
    }
}
