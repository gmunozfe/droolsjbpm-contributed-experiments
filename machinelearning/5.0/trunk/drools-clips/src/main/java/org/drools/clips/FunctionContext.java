package org.drools.clips;

import java.util.Map;

import org.mvel.ast.Function;

public interface FunctionContext {

    public abstract void addFunction(Function function);

    public abstract boolean removeFunction(String functionName);

    public abstract Map<String, Function> getFunctions();

}