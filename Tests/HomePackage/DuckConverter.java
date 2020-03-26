package HomePackage;

import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ArgumentConverter;

public class DuckConverter implements ArgumentConverter {

    //Custom converter for at teste metoder, hvor Duck er en parameter
    //Bliver brugt i KimberlyQueueTest for at teste addSpecificDuckToQueue(Duck duck)
    public Duck convert(Object source, ParameterContext context) throws ArgumentConversionException{
        if (source instanceof Integer){

               int duckNumber = (int)source;
               return new Duck(duckNumber);
        }
        throw new ArgumentConversionException(source + " is not a valid duck number.");
    }
}
