package org.pl.proprogres.design_patterns

import org.pl.proprogres.design_patterns.pattern.singleton.Director
import org.pl.proprogres.design_patterns.oop.polymorphism.Serializer
import org.pl.proprogres.design_patterns.oop.polymorphism.JsonSerializer
import org.pl.proprogres.design_patterns.oop.polymorphism.XmlSerializer
import org.pl.proprogres.design_patterns.oop.polymorphism.Client

class Main {
    def static void main(String[] args) {
        def jsonSerializer = new JsonSerializer()
        def xmlSerializer = new XmlSerializer()
        println Client.call(jsonSerializer)
        println Client.call(xmlSerializer)
    
        def director = Director.getInstance()
        println director.makeDecision()
        
        println "It works"
    }
}
