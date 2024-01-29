package white.ra.simple.io.container.contract;

import java.util.LinkedHashMap;

public interface JavaInstanceConfigurationInterface {
    LinkedHashMap<Class<?>, Class<?>[]> getInstanceConfigure();
}
