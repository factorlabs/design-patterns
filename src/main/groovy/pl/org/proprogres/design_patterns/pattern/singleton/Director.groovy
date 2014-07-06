package org.pl.proprogres.design_patterns.pattern.singleton;

/**
 * Representation of ACME director which is represents as Singleton
 */
class Director {
    /**
     * Stores the instance of Director instance (itself)
     */
    private static final INSTANCE = new Director()
    /**
     * Constructor should not be public to avoid explicite instantiation
     */
    private Director() {}
    /**
     * Returns instance of Director
     */
    static getInstance() {
        return INSTANCE
    }
    /**
     * Sample method just for examples
     */
    def makeDecision() {
        return "I am making decision"
    }
}
