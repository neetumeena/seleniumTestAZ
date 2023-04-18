package com.az.config;

import org.aeonbits.owner.Config;

@Config.Sources(
        value = "file:${user.dir}/src/test/resources/config.properties")
public interface FrameworkConfig extends Config {

    long timeout();

    String url();

    String browser();


}
