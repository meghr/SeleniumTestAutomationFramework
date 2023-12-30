package org.meghraj.constants;

// we made this class final so that no one can extend it
public final class FrameworkConstant {

    private FrameworkConstant() {

        // we made this constructor  as private so that no one can create an instance of this class
    }

    // we will not define url constant here , we will be using properties for that so that any one can change the url from property file

    private static final String RESOURCESPATH = System.getProperty("user.dir") + "/src/test/resources";
    private static final String FIREFOXDRIVERPATH = RESOURCESPATH + "/executables/geckodriver.exe";
    private static final String CONFIGPROPERTYPATH = RESOURCESPATH + "/config/config.properties";


    public static String getFirefoxDriverPath() {
        return FIREFOXDRIVERPATH;
    }

    public static String getConfigPropertyPath() {
        return CONFIGPROPERTYPATH;
    }

}
