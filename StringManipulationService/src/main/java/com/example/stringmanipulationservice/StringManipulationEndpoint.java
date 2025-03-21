package com.example.stringmanipulationservice;

import javax.xml.ws.Endpoint;

public class StringManipulationEndpoint {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/StringManipulationService", new StringManipulationServiceImpl());
    }
}
