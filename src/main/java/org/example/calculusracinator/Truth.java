package org.example.calculusracinator;

public final class Truth extends Statement {

    public Truth(String description) {
        super(description);
    }

    @Override
    public Boolean evaluate() {
        return true;
    }
}
