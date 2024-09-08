package io.github.orionlibs.orion_string.tasks;

import io.github.orionlibs.orion_assert.Assert;
import io.github.orionlibs.orion_simple_math.random.RandomNumberGenerationService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class GenerateRandomStringTask
{
    private static final char[] allCharacters;
    private static final char[] charactersWithoutSymbols;

    static
    {
        allCharacters = new char[]
                        {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                                        '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')',
                                        '{', '}', '?', '<', '>', '`', '=', '-', '|', '[', ']',
                                        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                                        'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
                                        'w', 'x', 'y', 'z',
                                        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
                                        'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
                                        'W', 'X', 'Y', 'Z'};
        charactersWithoutSymbols = new char[]
                        {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                                        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                                        'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
                                        'w', 'x', 'y', 'z',
                                        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
                                        'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
                                        'W', 'X', 'Y', 'Z'};
        shuffleCharacters();
    }

    private static void shuffleCharacters()
    {
        List<Character> charactersTemp = new ArrayList<>(allCharacters.length);
        List<Character> charactersWithoutSymbolsTemp = new ArrayList<>(charactersWithoutSymbols.length);
        for(char character : allCharacters)
        {
            charactersTemp.add(character);
        }
        for(char character : charactersWithoutSymbols)
        {
            charactersWithoutSymbolsTemp.add(character);
        }
        Collections.shuffle(charactersTemp);
        Collections.shuffle(charactersWithoutSymbolsTemp);
        for(int i = 0; i < charactersTemp.size(); i++)
        {
            allCharacters[i] = charactersTemp.get(i);
        }
        for(int i = 0; i < charactersWithoutSymbolsTemp.size(); i++)
        {
            charactersWithoutSymbols[i] = charactersWithoutSymbolsTemp.get(i);
        }
    }


    public static String run(int length, boolean useSymbols)
    {
        Assert.isPositive(length, "length has to be >= 1");
        StringBuilder sb = new StringBuilder();
        IntStream indexStream = IntStream.range(0, length);
        if(useSymbols)
        {
            indexStream.forEach(i -> sb.append(allCharacters[RandomNumberGenerationService.getRandomInteger(allCharacters.length)]));
        }
        else
        {
            indexStream.forEach(i -> sb.append(charactersWithoutSymbols[RandomNumberGenerationService.getRandomInteger(charactersWithoutSymbols.length)]));
        }
        return sb.toString();
    }
}