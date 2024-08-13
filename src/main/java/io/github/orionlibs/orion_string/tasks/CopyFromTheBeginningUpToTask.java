package io.github.orionlibs.orion_string.tasks;

import io.github.orionlibs.orion_assert.Assert;

public class CopyFromTheBeginningUpToTask
{
    public static String run(String stringToCopyFrom, int indexToCopyTo)
    {
        Assert.notEmpty(stringToCopyFrom, "The stringToCopyFrom input cannot be null/empty.");
        if(indexToCopyTo < stringToCopyFrom.length())
        {
            return new String(stringToCopyFrom.substring(0, indexToCopyTo + 1));
        }
        else
        {
            return "";
        }
    }
}