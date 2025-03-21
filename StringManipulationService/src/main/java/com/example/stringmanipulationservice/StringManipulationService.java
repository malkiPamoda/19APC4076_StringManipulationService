package com.example.stringmanipulationservice;

import javax.jws.webMethod;
import javax.jws.webService;

public interface StringManipulationService {
    @WebMethod
    String reverseText(String text);

    @WebMethod
    int countCharacters(String text);
}
