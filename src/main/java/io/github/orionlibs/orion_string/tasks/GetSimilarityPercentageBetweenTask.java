package io.github.orionlibs.orion_string.tasks;

import org.apache.commons.text.similarity.LevenshteinDistance;

public class GetSimilarityPercentageBetweenTask
{
    public static double run(String s1, String s2)
    {
        String shorterString = s1;
        String longerString = s2;
        if(s1.length() > s2.length())
        {
            longerString = s1;
            shorterString = s2;
        }
        int longerLength = longerString.length();
        if(longerLength == 0)
        {
            return 1.0;
        }
        return (longerLength - LevenshteinDistance.getDefaultInstance().apply(shorterString, longerString)) / (double)longerLength;
    }
}