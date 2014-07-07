package org.pl.proprogres.design_patterns.oop.polymorphism;

/**
 * Client
 */
class Client {
    /**
     * Client
     */
    static call(Serializer serializer) {
        return serializer.serialize("Some data")
    }
}
