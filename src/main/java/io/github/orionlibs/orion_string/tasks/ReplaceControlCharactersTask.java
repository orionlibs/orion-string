package io.github.orionlibs.orion_string.tasks;

import java.util.HexFormat;

public class ReplaceControlCharactersTask
{
    public static String run(int[] codePoints)
    {
        StringBuilder chars = new StringBuilder();
        for(int cp : codePoints)
        {
            if(Character.getType(cp) == Character.CONTROL && cp != '\n')
            {
                chars.append("\\u").append(HexFormat.of().toHexDigits(cp, 4)); // escape
            }
            else
            {
                chars.appendCodePoint(cp); // this character is ok
            }
        }
        return chars.toString();
    }
}
