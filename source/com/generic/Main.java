package source.com.generic;

public class Main {
    public static void main(String[] args) {
        GenericTest<String> stringGenericTest = new GenericTest<>("123");
        GenericTest<Integer> integerGenericTest = new GenericTest<>(123);
        GenericTest<Double> doubleGenericTest = new GenericTest<>(123.456);
        System.out.println(stringGenericTest.getClass());
        System.out.println(integerGenericTest.getClass());
        System.out.println(doubleGenericTest.getClass());

        System.out.println(stringGenericTest.getClass() == integerGenericTest.getClass());

        System.out.println("---------------------------------");
        System.out.println("测试使用泛型方法");
        System.out.println(method("这次是字符串"));
        System.out.println(method(123));
    }

    public static <T> T method(T t){
        return t;
    }
}
