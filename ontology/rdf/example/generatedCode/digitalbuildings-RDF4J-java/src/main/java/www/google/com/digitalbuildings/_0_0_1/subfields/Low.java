package www.google.com.digitalbuildings._0_0_1.subfields;

import digitalbuildings.global.util.GLOBAL;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.vocabulary.RDF;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
* Class Low 
* Level of control or measurement; below medium and high; opposite of high.
*/
@SuppressWarnings("serial")
public class Low extends www.google.com.digitalbuildings._0_0_1.subfields.Descriptor implements ILow{

	IRI newInstance;
	public Low(String namespace, String instanceId) {
		super(namespace, instanceId);

		newInstance = GLOBAL.factory.createIRI(namespace, instanceId);
		GLOBAL.model.add(this, RDF.TYPE, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1/subfields#Low"));
	}

	public IRI iri()
	{
		return newInstance;
	}

	public static Set<ILow> getAllLowsObjectsCreated(){
		Set<ILow> objects = new HashSet<>();
		objects = GLOBAL.model.filter(null, RDF.TYPE, GLOBAL.factory
		.createIRI("http://www.google.com/digitalbuildings/0.0.1/subfields#Low")).subjects().stream()
		.map(mapper->(ILow)mapper)
		.collect(Collectors.toSet());

		return objects;
	}
}