package br.com.jse.collections;

import java.util.*;

public class OptionalExam {
    public static void main(String[] args) {
        Optional<String> word = Optional.of("present");
        Optional<String> wordEmpty = Optional.empty();
        Optional<String> wordNull = Optional.ofNullable(null);

        word.ifPresentOrElse(System.out::println, () -> System.out.println("optional not found"));

        wordNull.ifPresentOrElse(System.out::println, () -> System.out.println("null"));

        OptionalInt.of(1).ifPresentOrElse(System.out::println, () -> System.out.println("not found"));

        OptionalLong.of(1L).ifPresentOrElse(System.out::println, () -> System.out.println("not found"));

        OptionalDouble.of(1).ifPresentOrElse(System.out::println, () -> System.out.println("not found"));

        System.out.println(wordEmpty.isEmpty());

        word.map((value) -> value.concat("ation * * * * *")).ifPresentOrElse(System.out::println, () -> System.out.println("not found"));

        word = Optional.empty();
        Optional<String> finalWord = word;
        word.ifPresentOrElse(System.out::println, () -> finalWord.orElseThrow(NoSuchFieldError::new));
    }
}
