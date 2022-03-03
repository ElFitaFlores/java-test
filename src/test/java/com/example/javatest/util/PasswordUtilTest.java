package com.example.javatest.util;

import org.junit.Test;

import static com.example.javatest.util.PasswordUtil.SecurityLevel.WEAK;
import static com.example.javatest.util.PasswordUtil.SecurityLevel.MEDIUM;
import static com.example.javatest.util.PasswordUtil.SecurityLevel.STRONG;
import static org.junit.Assert.*;

public class PasswordUtilTest {
    @Test
    public void weak_when_has_less_than_8_letters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("1234567"));
    }

    @Test
    public void weak_when_has_only_letters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("abcdefgh"));
    }

    @Test
    public void medium_when_has_letters_and_numbers() {
        assertEquals(MEDIUM, PasswordUtil.assessPassword("a1b2c3d4"));
    }

    @Test
    public void strong_when_has_letters_numbers_and_symbols() {
        assertEquals(STRONG, PasswordUtil.assessPassword("abc134.!"));
    }
}