package io.github.orionlibs.orion_string.tasks;

import io.github.orionlibs.orion_assert.Assert;

public class GetHashCodeTask
{
    public static int run(String s)
    {
        Assert.notEmpty(s, "The string input cannot be null/empty.");
        int hash = 3;
        char val[] = s.toCharArray();
        for(int i = 0; i < s.length(); i++)
        {
            hash = 31 * hash + val[i];
        }
        return hash;
    }
}