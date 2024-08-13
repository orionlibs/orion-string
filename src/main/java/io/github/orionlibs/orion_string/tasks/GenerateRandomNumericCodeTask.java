package io.github.orionlibs.orion_string.tasks;

import io.github.orionlibs.orion_assert.Assert;
import io.github.orionlibs.orion_simple_math.RandomNumberGenerationService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class GenerateRandomNumericCodeTask
{
    private static final char[] allCharacters;

    static
    {
        allCharacters = new char[]
                        {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        shuffleCharacters();
    }

    private static void shuffleCharacters()
    {
        List<Character> charactersTemp = new ArrayList<>(allCharacters.length);
        for(char character : allCharacters)
        {
            charactersTemp.add(character);
        }
        Collections.shuffle(charactersTemp);
        for(int i = 0; i < charactersTemp.size(); i++)
        {
            allCharacters[i] = charactersTemp.get(i);
        }
    }


    public static String run(int length)
    {
        Assert.isPositive(length, "length has to be >= 1");
        StringBuilder sb = new StringBuilder();
        IntStream indexStream = IntStream.range(0, length);
        indexStream.forEach(i -> sb.append(allCharacters[RandomNumberGenerationService.getRandomInteger(allCharacters.length)]));
        return sb.toString();
    }
}