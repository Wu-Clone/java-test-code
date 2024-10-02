package source.com.enumTest;


public class EnumTest {
    public static void main(String[] args) {
        judgeGender(Gender.FEMALE);
    }

    public static void judgeGender(Gender gender) {
        switch (gender) {
            // 在其他地方（如类或方法外）使用时，通常需要使用 Gender.MALE 的全名来访问它们。
            // 然而，当枚举类型在 switch 语句中使用时，编译器能够推断出你是在使用 Gender 枚举，因此可以省略类名。
            // Java 语法的简化特性
            case MALE:
                System.out.println("男士哦！");
                break;
            case FEMALE:
                System.out.println("女士哟！");
                break;
            default:
                System.out.println("不可能到这儿来~");
                break;
        }
    }
}
