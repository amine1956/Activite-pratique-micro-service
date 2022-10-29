package org.example;

import jakarta.xml.ws.Endpoint;
import org.example.ws.BanckService;

public class Main {
    public static void main(String[] args) {
         Endpoint.publish("http://localhost:8080/", new BanckService());
         System.out.println("Server started ...");
    }
}