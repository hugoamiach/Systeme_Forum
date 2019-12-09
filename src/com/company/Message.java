package com.company;

public final class Message implements IComposite {
    private String titre;
    private String message;

    public Message(String titre, String message) {
        this.message = message;
        this.titre = titre;
    }

    public String getTitre() {
        return titre;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Message : ".concat(this.getTitre()).concat("\n").concat(this.getMessage());
    }
}
