package com.company;

public final class Forum extends AbstractSubject<Theme> {
    public Forum(String s) {
        super(s);
    }

    @Override
    public String getType() {
        return "Forum : ";
    }
}
