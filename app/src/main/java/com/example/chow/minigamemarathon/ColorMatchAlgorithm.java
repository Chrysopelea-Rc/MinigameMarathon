package com.example.chow.minigamemarathon;

/**
 * Created by per6 on 11/28/17.
 */

public class ColorMatchAlgorithm {
    String colorStr1,colorStr2;
    public int getColorNumber(String colorstring)
    {
        //red-0
        //yellow-1
        //green-2
        //cyan-3
        //blue-4
        //magenta-5
        if (colorstring.equals("red")){return 0;}
        else if (colorstring.equals("yellow")){return 1;}
        else if (colorstring.equals("green")){return 2;}
        else if (colorstring.equals("cyan")){return 3;}
        else if (colorstring.equals("blue")){return 4;}
        else if (colorstring.equals("magenta")){return 5;}
        else {return -1;}
    }
}
