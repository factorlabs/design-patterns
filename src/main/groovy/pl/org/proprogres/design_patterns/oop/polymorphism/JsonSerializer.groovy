package org.pl.proprogres.design_patterns.oop.polymorphism;

/**
 * JSON serializer
 */
class JsonSerializer implements Serializer {
    /**
     * Serializes data to JSON
     */
    def serialize(data) {
        return "I serialize ${data} to JSON"
    }
}
