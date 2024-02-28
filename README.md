# Spring-Tutorial

## 说明
通过构造对应单元测试用例辅助阅读Spring源码，加深对Spring源码的理解，并记录过程中遇到的知识点。
## Ioc Container

### 1. 构造函数依赖注入
**场景**
构造两个类循环依赖的场景，验证：
1. 通过字段方式注入，正常
2. 通过构造函数注入，异常

测试用例 `org.example.container.ioc.ContainerIocTestTest.testInjectByConstructorAutowired`


通过构造函数注入报错信息如下：
```text
WARNING: Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'beanC': Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'beanD': Unsatisfied dependency expressed through field 'beanC': Error creating bean with name 'beanC': Requested bean is currently in creation: Is there an unresolvable circular reference?

```

