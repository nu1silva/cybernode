package com.nu1silva.cybernode.engine.api;

public interface ConfigurationManagement {

    void setConfigurationProperty(String key, String value);

    void getConfigurationProperty(String key);
}
