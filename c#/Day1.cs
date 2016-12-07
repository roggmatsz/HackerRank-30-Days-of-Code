using System;
using System.IO;

class Solution {
    static void Main(String[] args) {
        int i = 4;
        double d = 4.0;
        string s = "HackerRank ";

        int secInt;
        double secDou;
        string secStr;

        secInt = (int) Console.ReadLine();
        secDou = (double) Console.ReadLine();
        secStr = Console.ReadLine();

        Console.WriteLine(i + secInt);
        Console.WriteLine(d + secDou);
        Console.WriteLine(s + secStr);
    }
}