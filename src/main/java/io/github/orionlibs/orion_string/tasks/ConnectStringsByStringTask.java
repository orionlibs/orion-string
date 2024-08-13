package io.github.orionlibs.orion_string.tasks;

import java.util.List;

public class ConnectStringsByStringTask
{
    public static String run(String connectorString, String... strings)
    {
        return String.join(connectorString, strings);
    }


    public static String run(String connectorString, List<String> strings)
    {
        return String.join(connectorString, strings);
    }
}