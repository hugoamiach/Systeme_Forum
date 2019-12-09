package com.company;

public class Theme extends AbstractSubject<Salon> implements IComposite {
    public Theme(String s) {
        super(s);
    }

    @Override
    public String getType() {
        return "Theme : ";
    }
}
