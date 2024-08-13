package io.github.orionlibs.orion_string.tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DoesMatchRegularExpressionTask
{
    public static boolean run(String s, String regularExpression)
    {
        if(s != null && !s.isEmpty())
        {
            try
            {
                final Pattern r = Pattern.compile(regularExpression);
                final Matcher m = r.matcher(s);
                return m.matches();
            }
            catch(final Exception e)
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
}