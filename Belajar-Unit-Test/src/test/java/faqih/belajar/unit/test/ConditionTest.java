package faqih.belajar.unit.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.util.Properties;

public class ConditionTest {

    @Test
    @Disabled
    void testSystemProperties(){
        Properties properties = System.getProperties();
        properties.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    @Test
    @EnabledOnOs({OS.WINDOWS})
    public void testRunOnlyOnWindows() {

    }

    @Test
    @DisabledOnOs({OS.WINDOWS})
    public void testDisabledOnWindows(){

    }

    @Test
    @EnabledOnJre({JRE.JAVA_8})
    void testEnabledOnJava8(){

    }

    @Test
    @DisabledOnJre({JRE.JAVA_8})
    void testDisabledOnJava8(){

    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_19)
    void testEnabledOnJava11To19(){

    }

    @Test
    @DisabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_19)
    void testDisabledOnJava11To19(){

    }

    @Test
    @EnabledIfSystemProperties({
            @EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle.Corporation")
    })
    void testEnabledOnJavaVendorOracle(){

    }

    @Test
    @DisabledIfSystemProperties({
            @DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle.Corporation")
    })
    void testDisabledOnJavaVendorOracle(){

    }

    @Test
    @EnabledIfEnvironmentVariables({
            @EnabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    })
    void testEnabledOnProfileDev(){

    }

    @Test
    @DisabledIfEnvironmentVariables({
            @DisabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    })
    void testDisabledOnProfileDev(){

    }
}
