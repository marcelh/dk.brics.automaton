package dk.brics.automaton.util;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestCollections {

    // helper method to create a hash set with the given set of elements.
    public static <T> Set<T> newSet(final T ... elements) {
        final HashSet<T> set = new HashSet<>();
        Collections.addAll(set, elements);
        return set;
    }
}
