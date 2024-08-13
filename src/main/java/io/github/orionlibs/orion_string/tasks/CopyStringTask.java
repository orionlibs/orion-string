package io.github.orionlibs.orion_string.tasks;

import io.github.orionlibs.orion_assert.Assert;

public class CopyStringTask
{
    public static String run(String stringToCopy)
    {
        return new String(stringToCopy);
    }


    public static String run(String stringToCopyFrom, int indexToCopyFrom)
    {
        Assert.notEmpty(stringToCopyFrom, "The stringToCopyFrom input cannot be null/empty.");
        if(indexToCopyFrom < stringToCopyFrom.length())
        {
            return new String(stringToCopyFrom.substring(indexToCopyFrom));
        }
        else
        {
            return "";
        }
    }


    public static String run(String stringToCopyFrom, int indexToCopyFrom, int indexToCopyTo)
    {
        Assert.notEmpty(stringToCopyFrom, "The stringToCopyFrom input cannot be null/empty.");
        if(indexToCopyFrom < stringToCopyFrom.length() && (indexToCopyTo + 1) < stringToCopyFrom.length())
        {
            return new String(stringToCopyFrom.substring(indexToCopyFrom, indexToCopyTo + 1));
        }
        else
        {
            return "";
        }
    }
}