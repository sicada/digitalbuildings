package www.google.com.digitalbuildings._0_0_1.hvac;

import digitalbuildings.global.util.GLOBAL;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.vocabulary.RDF;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import www.google.com.digitalbuildings._0_0_1.IMonitoring;
import www.google.com.digitalbuildings._0_0_1.Monitoring;
import www.google.com.digitalbuildings._0_0_1.fields.IShade_tilt_percentage_command;
import www.google.com.digitalbuildings._0_0_1.fields.Shade_tilt_percentage_command;

/**
* Class Stpm 
* Shade tilt monitoring.
*/
@SuppressWarnings("serial")
public class Stpm extends www.google.com.digitalbuildings._0_0_1.Monitoring implements IStpm{

	IRI newInstance;
	public Stpm(String namespace, String instanceId) {
		super(namespace, instanceId);

		newInstance = GLOBAL.factory.createIRI(namespace, instanceId);
		GLOBAL.model.add(this, RDF.TYPE, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1/hvac#Stpm"));
	}

	public IRI iri()
	{
		return newInstance;
	}


  public void addUsesShade_tilt_percentage_command (IShade_tilt_percentage_command parameter)
	{
		GLOBAL.model.add(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#uses"), parameter);
	}

	public Set<IShade_tilt_percentage_command> getUsesShade_tilt_percentage_command (){
		Set<IShade_tilt_percentage_command> UsesShade_tilt_percentage_command = new HashSet<>();
		GLOBAL.model.filter(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#uses"), null)
		.objects().forEach(action->{
			if(action instanceof Shade_tilt_percentage_command) {
				UsesShade_tilt_percentage_command.add((Shade_tilt_percentage_command)action);
			}
		});
		return UsesShade_tilt_percentage_command;
	}

	public static Set<IStpm> getAllStpmsObjectsCreated(){
		Set<IStpm> objects = new HashSet<>();
		objects = GLOBAL.model.filter(null, RDF.TYPE, GLOBAL.factory
		.createIRI("http://www.google.com/digitalbuildings/0.0.1/hvac#Stpm")).subjects().stream()
		.map(mapper->(IStpm)mapper)
		.collect(Collectors.toSet());

		return objects;
	}
}