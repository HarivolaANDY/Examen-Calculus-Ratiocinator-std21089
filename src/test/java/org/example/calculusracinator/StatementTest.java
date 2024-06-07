package org.example.calculusracinator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatementTest {
    @Test
    public void StatementTest1() {
        Statement louBeau = new Truth("Lou est beau");
        Statement louPauvre = new Lie("Lou est pauvre");

        assertEquals("jenesaispas", CalculusRatiocinator.and(louBeau, louPauvre));
        assertEquals("true", CalculusRatiocinator.and(louBeau, louBeau));
    }

    @Test
    public void StatementTest2() {
        Statement louBeau = new Truth("Lou est beau");
        Statement louPauvre = new Lie("Lou est pauvre");
        Statement louGenereux = new GeneralStatement("Lou est généreux");

        assertEquals("true", CalculusRatiocinator.or(louBeau, louGenereux));
        assertEquals("jenesaispas", CalculusRatiocinator.or(louGenereux, louGenereux));
        assertEquals("false", CalculusRatiocinator.or(louPauvre, louPauvre));
    }
}
