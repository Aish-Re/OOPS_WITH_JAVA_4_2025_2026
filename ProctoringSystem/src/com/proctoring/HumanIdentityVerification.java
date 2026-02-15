package com.proctoring;

public class HumanIdentityVerification implements IdentityVerification {

    @Override
    public void verify(String candidate) {
        System.out.println("Human verifying identity of " + candidate);
    }
}
