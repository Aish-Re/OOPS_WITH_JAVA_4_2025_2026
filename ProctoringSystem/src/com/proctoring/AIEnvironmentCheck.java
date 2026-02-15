package com.proctoring;

public class AIEnvironmentCheck implements EnvironmentCheck {

    @Override
    public void check(String candidate) {
        System.out.println("AI checking environment for " + candidate);
    }
}
