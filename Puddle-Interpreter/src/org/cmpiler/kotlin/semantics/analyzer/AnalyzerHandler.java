package org.cmpiler.kotlin.semantics.analyzer;

import org.cmpiler.kotlin.semantics.analyzer.implement.DefaultAnalyzer;

import java.util.HashMap;

public class AnalyzerHandler {

    private static HashMap<Class, AbstractAnalyzer> analyzers = new HashMap<>();

    private AnalyzerHandler(){
    }

    public static AbstractAnalyzer getAnalyzer(Class clazz){
        AbstractAnalyzer result = null;
        if((result = analyzers.get(clazz)) != null)
            return result;
        try {
            result = (AbstractAnalyzer) clazz.newInstance();
            analyzers.put(clazz, result);
            return result;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        if((result = analyzers.get(DefaultAnalyzer.class)) != null)
            return result;
        result = new DefaultAnalyzer();
        analyzers.put(DefaultAnalyzer.class, result);
        return result;
    }

}
