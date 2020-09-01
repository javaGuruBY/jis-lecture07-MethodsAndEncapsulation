package by.jis.lecture7.methods;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Methods {

    private Logger log = LoggerFactory.getLogger(Methods.class);

    public void returnWithVoid(boolean isDebug) {
        if(isDebug) {
            log.debug("Debug message");
            return;
        }
        log.info("info message");
    }

    public int returnWithNumericPromotion() {
        return (byte) 7;
    }

    public Integer returnWithNumericAutoBoxing() {
        return 7;
    }

    public int returnWithNumericAutoUnboxing() {
        return Integer.valueOf(7);
    }

    public Integer returnWithInheritanceCE() {
//        return Byte.valueOf("2"); //compilation error, Byte & Integer complitelly different
        return null;
    }

    public Number returnWithInheritance() {
        return Byte.valueOf("2");
    }

    // return multiple values
    public FullName returnTwoStringsAsNewObject() {
        var fullName = new FullName();
        fullName.name = "Maksim";
        fullName.surname = "Shelkovich";
        return fullName;
    }
    // return multiple values
    public String[] returnTwoStringsAsArray() {
        return new String[]{"Maksim", "Shelkovich"};
    }
}
