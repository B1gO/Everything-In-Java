package java8_newFeature.features.lambda;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

public interface Processor {
    String process(Callable<String> c) throws Exception;
    String process(Supplier<String> s);
}
