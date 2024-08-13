package io.github.orionlibs.orion_string.tasks;

import io.github.orionlibs.orion_assert.Assert;
import io.github.orionlibs.orion_string.StringsService;
import java.util.List;

public class SeparateByStringTask
{
    public static String run(List<String> strings, String separator)
    {
        Assert.notEmpty(strings, "The strings input cannot be null/empty.");
        Assert.notEmpty(separator, "The separator input cannot be null/empty.");
        StringBuffer separatedList = new StringBuffer();
        for(int i = 0; i < strings.size(); i++)
        {
            if(StringsService.isNotEmpty(strings.get(i)))
            {
                separatedList.append(strings.get(i));
                if(i < strings.size() - 1)
                {
                    separatedList.append(separator);
                }
            }
        }
        return separatedList.toString();
    }
}