package java8_newFeature.features.lambda;

@FunctionalInterface
public interface Foo extends Baz, Bar {

    @Override
    default String defaultCommon() {
//        return Baz.super.defaultCommon();
        String s = "defaultCommon from Foo";
        System.out.println(s);
        return s;
    }
}
