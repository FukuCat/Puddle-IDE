package org.cmpiler.kotlin.interpreter.config;

public class GlobalConfig {

    private static GlobalConfig instance = null;

    private static final String path = "config.properties";

    private GlobalConfig(){ }

    public static GlobalConfig getInstance(){return instance == null? (instance = new GlobalConfig()) : instance; }


}
