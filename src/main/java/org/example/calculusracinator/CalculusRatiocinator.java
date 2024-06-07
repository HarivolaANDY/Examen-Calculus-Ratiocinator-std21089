package org.example.calculusracinator;

public class CalculusRatiocinator {

    public static String and(Statement a1, Statement a2) {
        Boolean val1 = a1.evaluate();
        Boolean val2 = a2.evaluate();

        if (val1 != Boolean.TRUE && val2 != Boolean.TRUE) {
            return String.valueOf(val1 && val2);
        } else {
            return "jenesaispas";
        }
    }

    public static String or(Statement a1, Statement a2) {
        Boolean val1 = a1.evaluate();
        Boolean val2 = a2.evaluate();

        if (val1 != Boolean.FALSE && val2 != null) {
            return String.valueOf(val1 || val2);
        } else {
            return "jenesaispas";
        }
    }

    public static String implies(Statement a1, Statement a2) {
        Boolean val1 = a1.evaluate();
        Boolean val2 = a2.evaluate();

        if (val1 != null && val2 != null) {
            return String.valueOf(!val1 || val2);
        } else {
            return "jenesaispas";
        }
    }
}
