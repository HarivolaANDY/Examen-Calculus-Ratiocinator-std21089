package org.example.calculusracinator;

public final class Lie extends Statement {

    public Lie(String description) {
        super(description);
    }

    @Override
    public Boolean evaluate() {
        return false;
    }
}
