package www.google.com.digitalbuildings._0_0_1.fields;

import digitalbuildings.global.util.GLOBAL;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.vocabulary.RDF;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import www.google.com.digitalbuildings._0_0_1.subfields.ITemperature;
import www.google.com.digitalbuildings._0_0_1.subfields.Temperature;
import www.google.com.digitalbuildings._0_0_1.subfields.IMixed;
import www.google.com.digitalbuildings._0_0_1.subfields.Mixed;
import www.google.com.digitalbuildings._0_0_1.subfields.ISetpoint;
import www.google.com.digitalbuildings._0_0_1.subfields.Setpoint;
import www.google.com.digitalbuildings._0_0_1.subfields.IAir;
import www.google.com.digitalbuildings._0_0_1.subfields.Air;


@SuppressWarnings("serial")
public class Mixed_air_temperature_setpoint extends www.google.com.digitalbuildings._0_0_1.fields.Field implements IMixed_air_temperature_setpoint{

	IRI newInstance;
	public Mixed_air_temperature_setpoint(String namespace, String instanceId) {
		super(namespace, instanceId);

		newInstance = GLOBAL.factory.createIRI(namespace, instanceId);
		GLOBAL.model.add(this, RDF.TYPE, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1/fields#Mixed_air_temperature_setpoint"));
	}

	public IRI iri()
	{
		return newInstance;
	}


  public void addComposedOfAir (IAir parameter)
	{
		GLOBAL.model.add(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#isComposedOf"), parameter);
	}

	public Set<IAir> getComposedOfAir (){
		Set<IAir> ComposedOfAir = new HashSet<>();
		GLOBAL.model.filter(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#isComposedOf"), null)
		.objects().forEach(action->{
			if(action instanceof Air) {
				ComposedOfAir.add((Air)action);
			}
		});
		return ComposedOfAir;
	}


  public void addComposedOfMixed (IMixed parameter)
	{
		GLOBAL.model.add(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#isComposedOf"), parameter);
	}

	public Set<IMixed> getComposedOfMixed (){
		Set<IMixed> ComposedOfMixed = new HashSet<>();
		GLOBAL.model.filter(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#isComposedOf"), null)
		.objects().forEach(action->{
			if(action instanceof Mixed) {
				ComposedOfMixed.add((Mixed)action);
			}
		});
		return ComposedOfMixed;
	}


  public void addComposedOfSetpoint (ISetpoint parameter)
	{
		GLOBAL.model.add(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#isComposedOf"), parameter);
	}

	public Set<ISetpoint> getComposedOfSetpoint (){
		Set<ISetpoint> ComposedOfSetpoint = new HashSet<>();
		GLOBAL.model.filter(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#isComposedOf"), null)
		.objects().forEach(action->{
			if(action instanceof Setpoint) {
				ComposedOfSetpoint.add((Setpoint)action);
			}
		});
		return ComposedOfSetpoint;
	}


  public void addComposedOfTemperature (ITemperature parameter)
	{
		GLOBAL.model.add(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#isComposedOf"), parameter);
	}

	public Set<ITemperature> getComposedOfTemperature (){
		Set<ITemperature> ComposedOfTemperature = new HashSet<>();
		GLOBAL.model.filter(this, GLOBAL.factory.createIRI("http://www.google.com/digitalbuildings/0.0.1#isComposedOf"), null)
		.objects().forEach(action->{
			if(action instanceof Temperature) {
				ComposedOfTemperature.add((Temperature)action);
			}
		});
		return ComposedOfTemperature;
	}

	public static Set<IMixed_air_temperature_setpoint> getAllMixed_air_temperature_setpointsObjectsCreated(){
		Set<IMixed_air_temperature_setpoint> objects = new HashSet<>();
		objects = GLOBAL.model.filter(null, RDF.TYPE, GLOBAL.factory
		.createIRI("http://www.google.com/digitalbuildings/0.0.1/fields#Mixed_air_temperature_setpoint")).subjects().stream()
		.map(mapper->(IMixed_air_temperature_setpoint)mapper)
		.collect(Collectors.toSet());

		return objects;
	}
}