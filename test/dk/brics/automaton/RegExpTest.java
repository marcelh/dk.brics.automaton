package dk.brics.automaton;


import org.junit.Test;

import static dk.brics.automaton.util.TestCollections.newSet;
import static org.junit.Assert.assertEquals;

public class RegExpTest {

    @Test
    public void testToString() {
        final RegExp regExp = new RegExp("a[ab]*c");
        assertEquals("a((a|b))*c", regExp.toString());
    }

    @Test
    public void testGetIdentifiers() {
        final RegExp regExp = new RegExp("a[ab]*<jaap>c<aap>");
        assertEquals(newSet("jaap", "aap"), regExp.getIdentifiers());
    }

    @Test
    public void testToAutomatonGeneratesSameOrderOfStates() {
        final String expected = new RegExp("a[ab]*c").toAutomaton().toString();
        for (int i = 0; i < 10; i++) {
            final Automaton automaton = new RegExp("a[ab]*c").toAutomaton();
            assertEquals("Iteration " + i, expected, automaton.toString());
        }
    }
}