package org.example.calculusracinator;

public sealed abstract class Statement permits Truth, Lie, GeneralStatement {
    protected String description;

    public Statement(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract Boolean evaluate();
}
