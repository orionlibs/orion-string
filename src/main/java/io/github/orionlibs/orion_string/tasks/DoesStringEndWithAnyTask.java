package io.github.orionlibs.orion_string.tasks;

import java.util.List;

public class DoesStringEndWithAnyTask
{
    public static boolean run(String s, List<String> stringsToCheck)
    {
        for(String stringToCheck : stringsToCheck)
        {
            if(s.endsWith(stringToCheck))
            {
                return true;
            }
        }
        return false;
    }
}