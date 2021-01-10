package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {
    GamblingMachine gamblingMachine = new GamblingMachine();

        @ParameterizedTest
        @CsvFileSource(resources = "/gamblingMachine.csv")
        public void shouldGenerateComputerNumbers(int one, int two, int three, int four, int five, int six) throws InvalidNumbersException {
            Set<Integer> integers = new HashSet<>();
            integers.add(one);
            integers.add(two);
            integers.add(three);
            integers.add(four);
            integers.add(five);
            integers.add(six);


            GamblingMachine gamblingMachine = new GamblingMachine();

            assertThrows(InvalidNumbersException.class, ()->gamblingMachine.howManyWins(integers));
        }

            @ParameterizedTest
   @CsvFileSource(resources = "/gamblingMachine2.csv")
   public void shouldThrowException(String input) {
       Set<Integer> inputSet = Stream.of(input.split("-")).map(Integer::valueOf).collect(Collectors.toCollection(HashSet::new));

       assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(inputSet), "Wrong numbers provided");


   }}


