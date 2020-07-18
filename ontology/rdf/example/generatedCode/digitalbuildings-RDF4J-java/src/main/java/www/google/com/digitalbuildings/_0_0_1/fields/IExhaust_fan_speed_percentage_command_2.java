package www.google.com.digitalbuildings._0_0_1.fields;

import org.eclipse.rdf4j.model.IRI;
import java.util.Set;
import www.google.com.digitalbuildings._0_0_1.subfields.IExhaust;
import www.google.com.digitalbuildings._0_0_1.subfields.ISpeed;
import www.google.com.digitalbuildings._0_0_1.subfields.IFan;
import www.google.com.digitalbuildings._0_0_1.subfields.ICommand;
import www.google.com.digitalbuildings._0_0_1.subfields.IPercentage;

public interface IExhaust_fan_speed_percentage_command_2 extends IField{

	public IRI iri();

    public void addComposedOfCommand (ICommand parameter);

	public Set<ICommand> getComposedOfCommand();

    public void addComposedOfExhaust (IExhaust parameter);

	public Set<IExhaust> getComposedOfExhaust();

    public void addComposedOfFan (IFan parameter);

	public Set<IFan> getComposedOfFan();

    public void addComposedOfPercentage (IPercentage parameter);

	public Set<IPercentage> getComposedOfPercentage();

    public void addComposedOfSpeed (ISpeed parameter);

	public Set<ISpeed> getComposedOfSpeed();

}