package io.github.orionlibs.orion_string.tasks;

import io.github.orionlibs.orion_string.StringsService;

public class IsLastCharacterAWhitespaceTask
{
    public static boolean run(String aString)
    {
        boolean isLastCharacterAWhitespace = false;
        String lastCharacter = StringsService.getLastCharacterAsString(aString);
        if(StringsService.isWhitespace(lastCharacter))
        {
            isLastCharacterAWhitespace = true;
        }
        return isLastCharacterAWhitespace;
    }
}