package com.proctoring;

public class AIBehaviourMonitoring implements BehaviourMonitoring {

    @Override
    public void monitor(String candidate) {
        System.out.println("AI monitoring behaviour of " + candidate);
    }
}
