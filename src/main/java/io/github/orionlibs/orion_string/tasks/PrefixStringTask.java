package io.github.orionlibs.orion_string.tasks;

import io.github.orionlibs.orion_assert.Assert;

public class PrefixStringTask
{
    public static String run(String s, String prefix)
    {
        Assert.notNull(s, "The main string input cannot be null.");
        Assert.notNull(prefix, "The prefix input cannot be null.");
        return prefix + s;
    }
}