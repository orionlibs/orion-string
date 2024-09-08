package io.github.orionlibs.orion_string.tasks;

import io.github.orionlibs.orion_assert.Assert;
import io.github.orionlibs.orion_simple_math.random.RandomNumberGenerationService;

public class ShuffleStringTask
{
    public static String run(String stringToShuffle)
    {
        Assert.notEmpty(stringToShuffle, "The stringToShuffle input cannot be null/empty.");
        String[] stringArray = stringToShuffle.split("");
        for(int i = 0; i < stringToShuffle.length(); i++)
        {
            int r1 = i;
            int r2 = RandomNumberGenerationService.getRandomInteger(stringToShuffle.length());
            String temp = stringArray[r1];
            stringArray[r1] = stringArray[r2];
            stringArray[r2] = temp;
        }
        String shuffledString = "";
        for(int i = 0; i < stringArray.length; i++)
        {
            shuffledString += stringArray[i];
        }
        return shuffledString;
    }
}