package io.github.orionlibs.orion_string.tasks;

import io.github.orionlibs.orion_assert.Assert;
import io.github.orionlibs.orion_string.StringsService;

public class ConvertFirstCharacterOfEachWordToUppercaseTask
{
    public static String run(String[] stringTokens)
    {
        Assert.notNull(stringTokens, "The stringTokens input cannot be null.");
        String stringTemp = "";
        if(stringTokens.length > 0)
        {
            for(String stringToken : stringTokens)
            {
                stringTemp += StringsService.convertFirstCharacterToUppercase(stringToken) + " ";
            }
        }
        return stringTemp.trim();
    }


    public static String run(String aString)
    {
        Assert.notNull(aString, "The aString input cannot be null.");
        if(!aString.isEmpty())
        {
            return run(aString.split(" "));
        }
        else
        {
            return "";
        }
    }
}