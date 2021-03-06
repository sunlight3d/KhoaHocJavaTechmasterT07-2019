package com.company;

public class Step6 extends Step1 {
    @Override
    public void show() {
        System.out.println("Step 6 - Check LG G-space");
    }

    @Override
    public int getNext(char c) {
        Boolean isNormalCharacter = (c >= 'a' && c <= 'z') ||
                                    (c >= 'A' && c <= 'Z') ||
                                    (c >= '0' && c <= '9');
        if(c == ' ' || !isNormalCharacter) {
            return 7;
        }
        return 2;
    }
}
