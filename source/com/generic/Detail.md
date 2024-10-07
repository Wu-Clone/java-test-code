### 一些关于泛型的细节

###### 一些细节
- 常用的泛型标识 T、E、K、V
- 泛型标识——类型形参
- 当没有指定类型时，将按照Object类型操作
- 不支持基本数据类型，因为底层还是需要转换为Object类，然后再进行下一步操作
- 同一泛型类，根据不同数据类型创建的对象，本质是相同数据类型

###### 泛型类的派生情况

- 若子类也是泛型类，子类和父类的泛型类型要一致
- 若子类不是泛型类，在继承时要明确泛型的数据类型
```java
// 必须是同一标识
public class Child01<T> extends GenericTest<T>{
    public Child01(T data) {
        super(data);
    }
}

public class Child02 extends GenericTest<String>{

    public Child02(String data) {
        super(data);
    }
}

```