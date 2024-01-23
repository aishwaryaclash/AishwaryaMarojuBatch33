package org.example;



import org.testng.annotations.Test;
import strings.StringRotation;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class StringRotationTest {
    @Test
    void testIsStringRotated() {
        assertTrue(StringRotation.isStringRotated("JavaJ2eeStrutsHibernate", "StrutsHibernateJavaJ2ee"));
    }
    @Test
    void testIsStringRotated1() {
        assertTrue(StringRotation.isStringRotated("123456", "561234"));
    }
    @Test
    void testIsStringRotated2() {
        assertTrue(StringRotation.isStringRotated("abcde", "eabcd"));
    }

    @Test
    void testIsStringRotated3() {
        assertFalse(StringRotation.isStringRotated("hello", "world"));
    }
    @Test
    void testIsStringRotated4() {
        assertTrue(StringRotation.isStringRotated("abcd", "dcba"));
    }
    @Test
    void testIsStringRotated5() {
        assertFalse(StringRotation.isStringRotated("abc", "abcd"));
    }
    @Test
    void testIsStringRotated6() {
        assertTrue(StringRotation.isStringRotated("java", "avaj"));
    }
}
