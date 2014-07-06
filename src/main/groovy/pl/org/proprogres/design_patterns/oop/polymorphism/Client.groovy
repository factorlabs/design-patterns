package org.pl.proprogres.design_patterns.oop.polymorphism;

/**
 * Client
 */
class Client {
    /**
     * Client
     */
    def call(Serializer serializer) {
        return serializer.serialize("Some data")
    }
}
