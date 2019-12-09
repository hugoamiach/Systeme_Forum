package com.company;

public final class Salon extends AbstractSubject<Message> implements IComposite {
    public Salon(String s) {
        super(s);
    }

    @Override
    public String getType() {
        return "Salon : ";
    }
}
