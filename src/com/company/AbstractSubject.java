package com.company;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSubject<T extends IComposite> {
    private String subject;
    private List<T> tList;


    public AbstractSubject(String s) {
        subject = s;
        tList = new ArrayList<>();
    }

    public boolean add(T element) {
        return tList.add(element);
    }

    public String getSubject() {
        return subject;
    }

    public List<T> gettList() {
        return tList;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return getType().concat(this.getSubject()).concat(this.gettList().toString());
    }
}
