package com.example.stringmanipulationservice;

import javax.jws.WebService;

@WebService(endpointInterface = "com.example.StringManipulationService")
public class StringManipulationServiceImpl implements StringManipulationService {

    @Override
    public String reverseText(String text) {
        StringBuilder reversedText = new StringBuilder(text);
        return reversedText.reverse().toString();
    }

    @Override
    public int countCharacters(String text) {
        return text.length();
    }
}
