package gr.aueb.cf.cf9.ch15;

/**
 * Loosely Coupled
 */
public class GenericSpeakingSchool {
    private final ISpeakable iSpeakable;

    // Dependency Injection
    // Ioc = Inversion of Control
    public GenericSpeakingSchool(ISpeakable iSpeakable) {
        this.iSpeakable = iSpeakable;
    }

    public void speak() {
        iSpeakable.speak();
    }
}
