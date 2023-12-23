package dev.scheibelhofer;

import io.quarkus.runtime.annotations.QuarkusMain;

import java.security.Security;

import dev.scheibelhofer.crypto.provider.JctProvider;
import io.quarkus.runtime.Quarkus;

@QuarkusMain
public class Main {

    public static void main(String ... args) {
        System.out.println("Running main method");
        Security.addProvider(new JctProvider());
        Quarkus.run(args); 
    }
}