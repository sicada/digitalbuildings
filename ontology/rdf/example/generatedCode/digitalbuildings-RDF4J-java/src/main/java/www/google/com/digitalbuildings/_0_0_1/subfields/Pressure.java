package www.google.com.digitalbuildings._0_0_1.subfields;

import digitalbuildings.global.util.GLOBAL;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.vocabulary.RDF;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
* Class Pressure 
* Measured force per unit area within a system or process.
*/
@SuppressWarnings("serial")
public class Pressure extends www.google.com.digitalbuildings._0_0_1.subfields.Measurement implements IPressure{

	IRI newInstance;
	public Pressure(String namespace, String instanceId) {
		super(namespace, instanceId);

		newInstance = GLOBAL.factory.createIRI(namespace, instanceId);
		GLOBAL.model.add(this, RDF.TYPE, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1/subfields#Pressure"));
	}

	public IRI iri()
	{
		return newInstance;
	}

	public static Set<IPressure> getAllPressuresObjectsCreated(){
		Set<IPressure> objects = new HashSet<>();
		objects = GLOBAL.model.filter(null, RDF.TYPE, GLOBAL.factory
		.createIRI("http://www.google.com/digitalbuildings/0.0.1/subfields#Pressure")).subjects().stream()
		.map(mapper->(IPressure)mapper)
		.collect(Collectors.toSet());

		return objects;
	}
}