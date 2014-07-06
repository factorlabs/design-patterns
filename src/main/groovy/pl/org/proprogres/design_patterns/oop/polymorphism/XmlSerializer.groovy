package org.pl.proprogres.design_patterns.oop.polymorphism;

/**
 * XML serializer
 */
class XmlSerializer implements Serializer {
    /**
     * Serializes data to XML
     */
    def serialize(data) {
        return "I serialize ${data} to XML"
    }
}
