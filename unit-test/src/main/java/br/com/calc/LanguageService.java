package br.com.calc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LanguageService {
    public  List<String> getMainLang(String key) {
        List<String> filteredList = languagesDatabase()
                .stream()
                .filter(main -> main
                        .toLowerCase()
                        .startsWith(key.toLowerCase()))
                .collect(Collectors.toList());
        return filteredList;
    }

    public List<String> languagesDatabase(){
        List<String> languageList = new ArrayList<>();

        languageList.add("Java");
        languageList.add("Python");
        languageList.add("JavaScript");
        languageList.add("Golang");
        languageList.add("R");
        languageList.add("Rust");
        languageList.add("PHP");
        languageList.add("Elixir");
        languageList.add("Lua");
        languageList.add("Clojure");
        languageList.add("Julia");
        languageList.add("Assembly");
        languageList.add("Fortran");
        languageList.add("Cobol");

        return languageList;
    }
}
