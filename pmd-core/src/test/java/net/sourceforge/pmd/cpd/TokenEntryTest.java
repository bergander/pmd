/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.cpd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TokenEntryTest {

    @Test
    void testSimple() {
        Tokens tokens = new Tokens();
        TokenEntry mark = tokens.addToken("public", "/var/Foo.java", 1, 2, 3, 4);
        assertEquals(1, mark.getBeginLine());
        assertEquals("/var/Foo.java", mark.getFileName());
        assertEquals(0, mark.getIndex());
        assertEquals(2, mark.getBeginColumn());
        assertEquals(4, mark.getEndColumn());
    }

}
