package ru.netology.graphics.image;

import java.util.HashMap;
import java.util.Map;

public class ColorSchema implements TextColorSchema{

    protected char[] symbol;

    public ColorSchema(){

        // строка символов
        symbol = new char[]{'#', '$', '@', '%', '*', '+', '-'};
    }

    @Override
    public char convert(int color) {
        return symbol[(int) Math.floor(color / 256. * symbol.length)];
    }
}

