package com.kodilla.collections.adv.exercises.dictionary;

public class EnglishWord {
    private PartOfSpeech partOfSpeech;
    private String word;

    public EnglishWord(String word) {
        this.word = word;
    }

    public EnglishWord(PartOfSpeech partOfSpeech) {
        this.partOfSpeech = partOfSpeech;

    }

    public PartOfSpeech getPartOfSpeech() {
        return partOfSpeech;
    }

    public String getWord() {
        return word;
    }
}

