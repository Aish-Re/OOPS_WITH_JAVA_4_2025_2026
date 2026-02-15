package com.proctoring;

public class ProctoringController {

    private IdentityVerification identityVerification;
    private EnvironmentCheck environmentCheck;
    private BehaviourMonitoring behaviourMonitoring;

    // Setter methods (runtime configuration)
    public void setIdentityVerification(IdentityVerification identityVerification) {
        this.identityVerification = identityVerification;
    }

    public void setEnvironmentCheck(EnvironmentCheck environmentCheck) {
        this.environmentCheck = environmentCheck;
    }

    public void setBehaviourMonitoring(BehaviourMonitoring behaviourMonitoring) {
        this.behaviourMonitoring = behaviourMonitoring;
    }

    public void conductExam(String candidate) {

        System.out.println("Starting exam for " + candidate);

        if (identityVerification != null) {
            identityVerification.verify(candidate);
        }

        if (environmentCheck != null) {
            environmentCheck.check(candidate);
        }

        if (behaviourMonitoring != null) {
            behaviourMonitoring.monitor(candidate);
        }

        System.out.println("Exam completed for " + candidate);
    }
}
