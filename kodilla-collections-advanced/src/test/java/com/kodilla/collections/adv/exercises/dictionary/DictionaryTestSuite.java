package com.kodilla.collections.adv.exercises.dictionary;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DictionaryTestSuite {
    @Test
    public void testAddWord(){
        Dictionary dictionary = new Dictionary();
        String polishWord = "stos";
        EnglishWord englishWord= new EnglishWord(PartOfSpeech.NOUN, "stack");
        dictionary.addWord(polishWord,englishWord);
        assertEquals(1, dictionary.size());

    }
}
