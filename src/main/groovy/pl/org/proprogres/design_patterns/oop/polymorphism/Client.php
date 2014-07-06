package org.pl.proprogres.design_patterns.oop.polymorphism;

import org.pl.proprogres.design_patterns.oop.polymorphism.*

/**
 * Client
 */
class Client {
    /**
     * Client call
     */
    def call(Serializer serializer) {
        return serializer.serialize("Some data")
    }
}
