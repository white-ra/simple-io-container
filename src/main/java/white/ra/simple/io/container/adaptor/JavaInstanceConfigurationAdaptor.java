package white.ra.simple.io.container.adaptor;

import white.ra.simple.io.container.contract.JavaInstanceConfigurationInterface;

import java.util.LinkedHashMap;

public class JavaInstanceConfigurationAdaptor {
    public LinkedHashMap<Class<?>, Class<?>[]> adapt(JavaInstanceConfigurationInterface javaInstanceConfiguration) {
        return javaInstanceConfiguration.getInstanceConfigure();
    }
}
