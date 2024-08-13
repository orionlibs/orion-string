package io.github.orionlibs.orion_string.tasks;

import java.util.Arrays;

public class ArePermutationsOfEachOtherTask
{
    public static boolean run(String s1, String s2)
    {
        if(s1 == null || s2 == null)
        {
            return false;
        }
        char[] s1Characters = s1.toCharArray();
        char[] s2Characters = s2.toCharArray();
        Arrays.sort(s1Characters);
        Arrays.sort(s2Characters);
        return Arrays.equals(s1Characters, s2Characters);
    }
}