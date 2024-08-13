package io.github.orionlibs.orion_string.tasks;

public class SurroundWithStringTask
{
    public static String run(String aString, String stringToSurroundInputWith)
    {
        return run(aString, stringToSurroundInputWith, stringToSurroundInputWith);
    }


    public static String run(String aString, String stringPrefix, String stringSuffix)
    {
        StringBuilder stringSurroundedWithSingleQuote = new StringBuilder(stringPrefix);
        stringSurroundedWithSingleQuote.append(aString);
        stringSurroundedWithSingleQuote.append(stringSuffix);
        return stringSurroundedWithSingleQuote.toString();
    }
}