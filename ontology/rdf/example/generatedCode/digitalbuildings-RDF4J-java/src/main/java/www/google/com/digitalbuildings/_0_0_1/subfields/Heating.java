package www.google.com.digitalbuildings._0_0_1.subfields;

import digitalbuildings.global.util.GLOBAL;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.vocabulary.RDF;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
* Class Heating 
* Process, measured effect or requirement for heating.
*/
@SuppressWarnings("serial")
public class Heating extends www.google.com.digitalbuildings._0_0_1.subfields.Descriptor implements IHeating{

	IRI newInstance;
	public Heating(String namespace, String instanceId) {
		super(namespace, instanceId);

		newInstance = GLOBAL.factory.createIRI(namespace, instanceId);
		GLOBAL.model.add(this, RDF.TYPE, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1/subfields#Heating"));
	}

	public IRI iri()
	{
		return newInstance;
	}

	public static Set<IHeating> getAllHeatingsObjectsCreated(){
		Set<IHeating> objects = new HashSet<>();
		objects = GLOBAL.model.filter(null, RDF.TYPE, GLOBAL.factory
		.createIRI("http://www.google.com/digitalbuildings/0.0.1/subfields#Heating")).subjects().stream()
		.map(mapper->(IHeating)mapper)
		.collect(Collectors.toSet());

		return objects;
	}
}