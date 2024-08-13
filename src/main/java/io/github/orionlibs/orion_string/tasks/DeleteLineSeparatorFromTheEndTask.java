package io.github.orionlibs.orion_string.tasks;

import io.github.orionlibs.orion_assert.Assert;

public class DeleteLineSeparatorFromTheEndTask
{
    public static String run(String aString)
    {
        Assert.notEmpty(aString, "The aString input cannot be null/empty.");
        if(aString.endsWith(System.lineSeparator()))
        {
            if(System.getProperty("os.name").startsWith("Windows"))
            {
                return aString.substring(0, aString.length() - 4);
            }
            else
            {
                return aString.substring(0, aString.length() - 2);
            }
        }
        return aString;
    }
}