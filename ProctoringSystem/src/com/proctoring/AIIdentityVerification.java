package com.proctoring;

public class AIIdentityVerification implements IdentityVerification {

    @Override
    public void verify(String candidate) {
        System.out.println("AI verifying identity of " + candidate);
    }
}
