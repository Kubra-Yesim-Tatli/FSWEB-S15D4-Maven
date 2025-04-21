package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList extends ArrayList<Object> {

    @Override
    public boolean add(Object o) {
        if (!this.contains(o)) {
            return super.add(o);
        }
        return false;
    }

    public void sort() {
        Collections.sort((ArrayList) this);
    }

    @Override
    public boolean remove(Object o) {
        boolean result = super.remove(o);
        this.sort();
        return result;
    }
}
