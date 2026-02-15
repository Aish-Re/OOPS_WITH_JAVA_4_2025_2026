package com.proctoring;

public class Main {

    public static void main(String[] args) {

        ProctoringController controller = new ProctoringController();

    
        controller.setIdentityVerification(new AIIdentityVerification());
        controller.setEnvironmentCheck(new AIEnvironmentCheck());
        controller.setBehaviourMonitoring(new AIBehaviourMonitoring());

        controller.conductExam("Student A");
    }
}
