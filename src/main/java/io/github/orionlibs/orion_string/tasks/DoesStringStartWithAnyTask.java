package io.github.orionlibs.orion_string.tasks;

import java.util.List;

public class DoesStringStartWithAnyTask
{
    public static boolean run(String s, List<String> stringsToCheck)
    {
        for(String stringToCheck : stringsToCheck)
        {
            if(s.startsWith(stringToCheck))
            {
                return true;
            }
        }
        return false;
    }
}