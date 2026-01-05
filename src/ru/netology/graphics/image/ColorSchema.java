package ru.netology.graphics.image;

import java.util.HashMap;
import java.util.Map;

public class ColorSchema implements TextColorSchema{

    protected Map<Integer,Character> symbolColorSchema = new HashMap<>();

    public ColorSchema(){

        // строка символов
        char[] symbolChar = {'#','$','@','%','*','+','-'};

        int countPart = 255/symbolChar.length + 1;

        for (int i = 0; i < symbolChar.length; i++) {

            char symbol = symbolChar[i];

            for (int j = 0; j < countPart; j++) {
                symbolColorSchema.put(j + i * countPart,symbol);
            }
        }
    }

    @Override
    public char convert(int color) {
        return symbolColorSchema.get(color);
    }
}
