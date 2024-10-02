package source.com.enumTest;

public enum Gender {
    // 第一行有效数据 定义枚举项
    // 枚举项：就是一个个常量，每个常量记录的是此枚举的对象
    MALE, FEMALE;
}

// 反编译结果：
// public final class source.com.enumTest.Gender extends java.lang.Enum<source.com.enumTest.Gender> {
//  public static final source.com.enumTest.Gender MALE;
//  public static final source.com.enumTest.Gender FEMALE;
//  public static source.com.enumTest.Gender[] values();
//  public static source.com.enumTest.Gender valueOf(java.lang.String);
//  static {};
//}
// 根据反编译结果：
// Enum 是 Java 提供的一个特殊机制，
// 并不能通过手动继承 Enum 来构造自定义的枚举类，必须使用 enum 关键字。
// 枚举常量是静态的最终实例，所以 Gender.MALE 这种写法不仅合理，而且是标准的写法，
// 因为枚举常量在 Java 中是通过 public static final 实现的。
