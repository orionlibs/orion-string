package io.github.orionlibs.orion_string.builder;

import io.github.orionlibs.orion_assert.Assert;
import io.github.orionlibs.orion_string.StringsService;

public class StringBuilderService
{
    private StringBuilder sb;


    public StringBuilderService()
    {
        sb = new StringBuilder();
    }


    public StringBuilderService(StringBuilder stringBuilder)
    {
        sb = stringBuilder;
    }


    public StringBuilder get()
    {
        return sb;
    }


    public String getAsString()
    {
        return sb.toString();
    }


    public StringBuilderService add(String aString)
    {
        sb.append(aString).toString();
        return this;
    }


    public StringBuilderService add(StringBuilder stringBuilder)
    {
        sb.append(stringBuilder).toString();
        return this;
    }


    public StringBuilderService add(char[] characters)
    {
        sb.append(characters).toString();
        return this;
    }


    public StringBuilderService add(boolean aBoolean)
    {
        sb.append(aBoolean).toString();
        return this;
    }


    public StringBuilderService add(Object aString)
    {
        sb.append(aString).toString();
        return this;
    }


    public StringBuilderService reverse()
    {
        sb.reverse().toString();
        return this;
    }


    public StringBuilderService delete(int start, int end)
    {
        sb.delete(start, end);
        return this;
    }


    public StringBuilderService delete(int position)
    {
        sb.deleteCharAt(position);
        return this;
    }


    public StringBuilderService insertAtPosition(int position, String aString)
    {
        if(position <= 0)
        {
            position = 1;
        }
        sb.insert(position - 1, aString);
        return this;
    }


    public StringBuilderService insertAfterPosition(int position, String aString)
    {
        if(position <= 0)
        {
            position = 1;
        }
        sb.insert(position, aString);
        return this;
    }


    public StringBuilderService replaceAtPosition(int position, String aString)
    {
        Assert.notEmpty(aString, "The aString input cannot be null/empty.");
        if(position <= 0)
        {
            position = 1;
        }
        sb.replace(position - 1, aString.length() + 1, aString);
        return this;
    }


    public String substring(int start, int end)
    {
        return sb.substring(start, end + 1);
    }


    public String substring(int start)
    {
        return sb.substring(start);
    }


    public char getCharacterAtPosition(int position)
    {
        return sb.charAt(position);
    }


    public String getCharacterAsStringAtPosition(int position)
    {
        return Character.toString(sb.charAt(position));
    }


    public int indexOf(String aString)
    {
        return sb.indexOf(aString);
    }


    public int lastIndexOf(String aString)
    {
        return sb.lastIndexOf(aString);
    }


    public String copy()
    {
        return StringsService.copy(toString());
    }


    public String copy(int indexToCopyFrom)
    {
        return StringsService.copy(toString(), indexToCopyFrom);
    }


    public String copy(int indexToCopyFrom, int indexToCopyTo)
    {
        return StringsService.copy(toString(), indexToCopyFrom, indexToCopyTo);
    }


    public void copyFromTheBeginningUpTo(int indexToCopyTo)
    {
        sb = new StringBuilder(StringsService.copyFromTheBeginningUpTo(toString(), indexToCopyTo));
    }


    public String copyFromTheBeginningUpToAsString(int indexToCopyTo)
    {
        return StringsService.copyFromTheBeginningUpTo(toString(), indexToCopyTo);
    }


    public boolean doSubstringsMatch(int string1Offset, String string2, int string2Offset, int lengthOfSubstringToCheck)
    {
        return toString().regionMatches(string1Offset, string2, string2Offset, lengthOfSubstringToCheck);
    }


    public boolean doSubstringsMatch(boolean ignoreCase, int string1Offset, String string2, int string2Offset, int lengthOfSubstringToCheck)
    {
        return toString().regionMatches(ignoreCase, string1Offset, string2, string2Offset, lengthOfSubstringToCheck);
    }


    public static StringBuilder removeLastCommaAndSpace(StringBuilder stringBuilder)
    {
        StringBuilderService stringBuilderService = new StringBuilderService(stringBuilder);
        stringBuilderService.copyFromTheBeginningUpTo(stringBuilder.length() - 3);
        return stringBuilderService.get();
    }


    public int getLength()
    {
        return sb.length();
    }


    public String toString()
    {
        return sb.toString();
    }
}