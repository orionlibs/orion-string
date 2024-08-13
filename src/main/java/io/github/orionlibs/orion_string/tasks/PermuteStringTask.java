package io.github.orionlibs.orion_string.tasks;

import io.github.orionlibs.orion_assert.Assert;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermuteStringTask
{
    private Set<String> permutations;
    private boolean permutationStarted = false;


    public PermuteStringTask()
    {
        permutations = new HashSet<String>();
        permutationStarted = true;
    }


    public List<String> run(String string)
    {
        Assert.notNull(string, "The given string input cannot be null.");
        return run(string, 0, string.length() - 1);
    }


    public List<String> run(String string, int start, int end)
    {
        if(!permutationStarted)
        {
            permutations = new HashSet<String>();
        }
        String result = string;
        if(start != end)
        {
            for(int i = start; i <= end; i++)
            {
                result = swap(result, start, i);
                run(result, start + 1, end);
                result = swap(result, start, i);
            }
        }
        else
        {
            permutations.add(result);
        }
        return new ArrayList<String>(permutations);
    }


    private String swap(String a, int i, int j)
    {
        char[] charArray = a.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}