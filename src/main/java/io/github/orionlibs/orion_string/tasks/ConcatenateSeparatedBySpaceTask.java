package io.github.orionlibs.orion_string.tasks;

import io.github.orionlibs.orion_assert.Assert;
import java.util.Arrays;
import java.util.List;

public class ConcatenateSeparatedBySpaceTask
{
    public static String run(String... strings)
    {
        return run(Arrays.asList(strings));
    }


    public static String run(List<String> strings)
    {
        Assert.notEmpty(strings, "The strings input cannot be null/empty.");
        String newString = "";
        for(int i = 0; i < strings.size(); i++)
        {
            newString += strings.get(i);
            if(i < strings.size() - 1)
            {
                newString += " ";
            }
        }
        return newString;
    }
}