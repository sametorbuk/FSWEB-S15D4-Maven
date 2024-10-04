package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class WorkintechList extends ArrayList<Object> {

    private ArrayList<Object> workintechList;

    public WorkintechList() {
        this.workintechList = new ArrayList<>();
    }

    @Override
    public boolean add(Object object) {
        if (!workintechList.contains(object)) {
            workintechList.add(object);
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object object) {
        boolean removed = workintechList.remove(object);
        if (removed) {
           sort();
        }
        return removed;
    }



    @Override
    public int size() {
        return workintechList.size();
    }

    @Override
    public Object get(int index) {
        return workintechList.get(index);
    }

    @Override
    public boolean contains(Object object) {
        return workintechList.contains(object);
    }


}
