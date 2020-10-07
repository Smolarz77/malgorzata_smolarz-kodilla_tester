package com.kodilla.collections.adv.exercises.dictionary;

import java.util.*;

import static java.util.Collections.*;

public class Dictionary {
    Map<String, List<EnglishWord>> dictionary = new HashMap<>();

    public void addWord(String polishWord, EnglishWord englishWord) {
        List<EnglishWord>englishWords=dictionary.getOrDefault(polishWord, new ArrayList<>());
        englishWords.add(englishWord);
        dictionary.put(polishWord, englishWords);

    }
    public int size(){
        return dictionary.size();
    }

    public List<EnglishWord> findEnglishWords(String polishWord) {
        return emptyList();
    }

    public List<EnglishWord> findEnglishWords(String polishWord, PartOfSpeech partOfSpeech) {
        return Collections.emptyList();
    }

}