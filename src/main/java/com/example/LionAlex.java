package com.example;

import java.util.List;

public class LionAlex extends Lion{


    public LionAlex(Feline feline) throws Exception {
        super("Самец", feline);
    }

    public List<String> getFriends(){
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving(){
        return "Зоопарк В Центральном парке, город Нью-Йорк";
    }

    @Override
    public int getKittens() {
        return feline.getKittens(0);
    }
}
