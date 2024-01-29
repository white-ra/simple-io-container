package adaptor;

import contract.JavaInstanceConfigurationInterface;

import java.util.LinkedHashMap;

public class JavaInstanceConfigurationAdaptor {
    public LinkedHashMap<Class<?>, Class<?>[]> adapt(JavaInstanceConfigurationInterface javaInstanceConfiguration) {
        return javaInstanceConfiguration.getInstanceConfigure();
    }
}
