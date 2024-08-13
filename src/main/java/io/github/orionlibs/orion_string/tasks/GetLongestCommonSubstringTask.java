package io.github.orionlibs.orion_string.tasks;

import io.github.orionlibs.orion_assert.Assert;

public class GetLongestCommonSubstringTask
{
    public static String run(String s1, String s2)
    {
        Assert.notNull(s1, "The s1 input cannot be null.");
        Assert.notNull(s2, "The s2 input cannot be null.");
        if(s1.isEmpty() || s2.isEmpty())
        {
            return "";
        }
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n + 1][m + 1];
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= m; j++)
            {
                if(s1.charAt(i - 1) == s2.charAt(j - 1))
                {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                else
                {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        int lcsLen = dp[n][m];
        char[] lcs = new char[lcsLen];
        int index = 0;
        int i = n, j = m;
        while(i >= 1 && j >= 1)
        {
            int v = dp[i][j];
            while(i > 1 && dp[i - 1][j] == v)
            {
                i--;
            }
            while(j > 1 && dp[i][j - 1] == v)
            {
                j--;
            }
            if(v > 0)
            {
                lcs[lcsLen - index++ - 1] = s1.charAt(i - 1);
            }
            i--;
            j--;
        }
        return new String(lcs, 0, lcsLen);
    }
}