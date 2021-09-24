[TOC]


# 1. 组件的生命周期
![image.png](https://cdn.nlark.com/yuque/0/2021/png/22497320/1631760613900-58e83e1c-3b23-4e51-90a7-560eabc84e28.png#clientId=u9a4bc578-75e3-4&from=paste&height=519&id=udd059b0e&margin=%5Bobject%20Object%5D&name=image.png&originHeight=1038&originWidth=2354&originalType=binary&ratio=1&size=193086&status=done&style=none&taskId=ucfcf8d1c-6480-42de-97cb-697657e8ba2&width=1177)
​


- Structural Patterns
> 创建对象的机制， 能够提升已有代码的灵活性和可复用性。



- Creational Pattenrs
> 如何将对象和类组装成较大的结构， 并同时保持结构的灵活和高效。




- Behavioral Patterns
> 对象间的高效沟通和职责委派







# 2. 设计原则


- 开闭原则（Open Closed Principle，OCP）
> **扩展新类而不是修改旧类**



- 里氏替换原则（Liskov Substitution Principle，LSP）
> **继承父类而不去改变父类**




- 依赖倒置原则（Dependence Inversion Principle，DIP）
> **面向接口编程，而不是面向实现类**




- 单一职责原则（Single Responsibility Principle，SRP）
> **每个类只负责自己的事情，而不是变成万能**




- 接口隔离原则（Interface Segregation Principle，ISP）
> **各个类建立自己的专用接口，而不是建立万能接口**




- 迪米特法则（Law of Demeter，LoD）
> **无需直接交互的两个类，如果需要交互，使用中间者**




- 合成复用原则（Composite Reuse Principle，CRP）
> **优先组合，其次继承**



# 3. 设计模式




## 3.1 Creational Patterns


### 3.1.1 Singleton
![image.png](https://cdn.nlark.com/yuque/0/2021/png/22497320/1632456931426-4899a680-9695-4944-ac47-ee3e70462e5e.png#clientId=u9ad8429c-ab83-4&from=paste&height=492&id=u0be79a6f&margin=%5Bobject%20Object%5D&name=image.png&originHeight=580&originWidth=860&originalType=binary&ratio=1&size=52730&status=done&style=none&taskId=u25b5b821-504e-42fb-8ce2-edca31c8e7e&width=730)






### 3.1.2 Protytype
> **原型注册表** （Prototype Registry） 提供了一种访问常用原型的简单方法， 其中存储了一系列可供随时复制的预生成对象。 最简单的注册表原型是一个 名称 → 原型的哈希表。 但如果需要使用名称以外的条件进行搜索， 你可以创建更加完善的注册表版本。



![image.png](https://cdn.nlark.com/yuque/0/2021/png/22497320/1632306359510-4968a097-5a32-4fdf-be10-641e2369a577.png#clientId=u54c3b9b5-8e46-4&from=paste&height=750&id=uf3840677&margin=%5Bobject%20Object%5D&name=image.png&originHeight=1500&originWidth=1700&originalType=binary&ratio=1&size=237147&status=done&style=none&taskId=u452f3a83-ef84-449d-b9ef-80723448c5a&width=850)


### 3.1.3 FactoryMethod
> 工厂方法又称为工厂模式





简单工厂模式：
简单工厂模式包含如下角色：

- **Factory：工厂角色**工厂角色负责实现创建所有实例的内部逻辑
- **Product：抽象产品角色**抽象产品角色是所创建的所有对象的父类，负责描述所有实例所共有的公共接口
- **ConcreteProduct：具体产品角色**具体产品角色是创建目标，所有创建的对象都充当这个角色的某个具体类的实例。

![image.png](https://cdn.nlark.com/yuque/0/2021/png/22497320/1632454411363-8f571bf8-58dc-4835-bc71-81c221da611d.png#clientId=u8556973e-b359-4&from=paste&height=369&id=u9f645526&margin=%5Bobject%20Object%5D&name=image.png&originHeight=422&originWidth=675&originalType=binary&ratio=1&size=146502&status=done&style=none&taskId=u024ca857-8783-478a-833e-4bae515d06f&width=591)
​

工厂方法模式包含如下角色：

- Product：抽象产品
- ConcreteProduct：具体产品
- Factory：抽象工厂
- ConcreteFactory：具体工厂





![image.png](https://cdn.nlark.com/yuque/0/2021/png/22497320/1632306980410-02871d5b-38a3-4d52-b2d8-bc6e99aa31dd.png#clientId=u54c3b9b5-8e46-4&from=paste&height=500&id=ubbac96b3&margin=%5Bobject%20Object%5D&name=image.png&originHeight=1000&originWidth=1654&originalType=binary&ratio=1&size=141164&status=done&style=none&taskId=u310d4d5b-01ad-42f0-a9a1-3ca4a39efb4&width=827)




### 3.1.4 AbstractFactory
**优点：**当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。
**缺点：**产品族扩展非常困难，要增加一个系列的某一产品，既要在抽象的 Creator 里加代码，又要在具体的里面加代码。
![image.png](https://cdn.nlark.com/yuque/0/2021/png/22497320/1632452123803-7ce5e900-e00e-4138-85f9-c38c5bfa7b34.png#clientId=u8556973e-b359-4&from=paste&height=527&id=u0c91e84c&margin=%5Bobject%20Object%5D&name=image.png&originHeight=660&originWidth=1024&originalType=binary&ratio=1&size=136342&status=done&style=none&taskId=u73d1e82d-3f5f-4a9b-a7e5-4e2804f46cb&width=817)








### 3.1.5 Builder


**优点：** 1、建造者独立，易扩展。 2、便于控制细节风险。
**缺点：** 1、产品必须有共同点，范围有限制。 2、如内部变化复杂，会有很多的建造类。
​

建造者模式包含如下角色：

- Builder：抽象建造者
- ConcreteBuilder：具体建造者
- Director：指挥者
- Product：产品角色



![image.png](https://cdn.nlark.com/yuque/0/2021/png/22497320/1631762243861-b32974b0-5add-4d4e-bdbc-0bfe73e87614.png#clientId=u9a4bc578-75e3-4&from=paste&height=644&id=u243d733a&margin=%5Bobject%20Object%5D&name=image.png&originHeight=676&originWidth=804&originalType=binary&ratio=1&size=65983&status=done&style=none&taskId=u30ab822e-1851-4c1e-9f14-32a2b84a302&width=766)


![image.png](https://cdn.nlark.com/yuque/0/2021/png/22497320/1632306843557-adc0a079-0d93-4f20-847c-71520a79bd3d.png#clientId=u54c3b9b5-8e46-4&from=paste&height=928&id=u2de851e4&margin=%5Bobject%20Object%5D&name=image.png&originHeight=1856&originWidth=1758&originalType=binary&ratio=1&size=452322&status=done&style=none&taskId=uabe080d2-c0d1-4b1a-a494-8cf24a563ed&width=879)


## 3.2 Behavioral Patterns


### 3.2.1 Templete Method




### 3.2.2 Strategy


### 3.2.3 Command


### 3.2.3 Chain of Responsibility


### 3.2.4 State


### 3.2.5 Observe


### 3.2.6 Mediator


### 3.2.7 Iterator


### 3.2.8 Vistor


### 3.2.9 Memento


### 3.2.10 Interpreter


## 3.3  Structural Patterns


### 3.3.1 Proxy

- [Java三种代理模式：静态代理、动态代理和cglib代理](https://segmentfault.com/a/1190000011291179)
- [基于SpringBoot实现AOP+jdk/CGlib动态代理详解](https://www.cnblogs.com/godoforange/p/11587321.html)



### 3.3.2 Adapter
> **亦称： **封装器模式、Wrapper、Adapter



![image.png](https://cdn.nlark.com/yuque/0/2021/png/22497320/1631852148801-7aa4b035-7ebb-4f3b-acd2-e1b156578935.png#clientId=u29f7b433-0c71-4&from=paste&height=373&id=uc9f75c55&margin=%5Bobject%20Object%5D&name=image.png&originHeight=569&originWidth=1056&originalType=binary&ratio=1&size=46113&status=done&style=none&taskId=uca528fec-6f50-4d2b-ade0-e076fafd71a&width=692)
### 3.3.3 Bridge


### 3.3.4 Decorator
![image.png](https://cdn.nlark.com/yuque/0/2021/png/22497320/1631930655565-0263ad60-3cba-4289-b0d6-f98027bf1004.png#clientId=ub4f77dc2-0d1e-4&from=paste&height=448&id=ub4c07887&margin=%5Bobject%20Object%5D&name=image.png&originHeight=550&originWidth=854&originalType=binary&ratio=1&size=54583&status=done&style=none&taskId=u567bdf24-e300-442f-a112-91d75ed6d3a&width=696)
### 3.4.5 Facade


### 3.4.6 Flyweight


### 3.4.7 Composite


### 3.4.8 Filter Pattern










# 


