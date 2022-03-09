package com.example.javatest.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {
    @Test
    public void repeat_string_once() {
        String result = StringUtil.repeat("hola", 1);

        Assert.assertEquals("hola", result);
    }

    @Test
    public void repeat_string_multiple_times() {
        String result = StringUtil.repeat("hola", 3);

        Assert.assertEquals("holaholahola", result);
    }

    @Test
    public void repeat_string_zero_times() {
        String result = StringUtil.repeat("hola", 0);

        Assert.assertEquals("", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times() {
        String result = StringUtil.repeat("hola", -1);

        Assert.assertEquals("", result);
    }

    @Test
    public void false_if_string_is_not_empty() {
        boolean result = StringUtil.isEmpty("abc");

        Assert.assertFalse(result);
    }

    @Test
    public void true_if_string_is_empty() {
        boolean result = StringUtil.isEmpty("");

        Assert.assertTrue(result);
    }

    @Test
    public void true_if_string_is_null() {
        boolean result = StringUtil.isEmpty(null);

        Assert.assertTrue(result);
    }

    @Test
    public void true_if_string_has_a_space() {
        boolean result = StringUtil.isEmpty(" ");

        Assert.assertTrue(result);
    }
}