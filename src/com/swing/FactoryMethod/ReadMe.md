# 工厂方法模式

> 对简单工厂模式的拓展,将具体生成实例对象的操作放在具体的工厂实现类里面，抽象工厂不再创建具体对象。

优点：
- 解决了简单工厂模式职责太高的问题。
- 具体的工厂方法创建具体的产品，客户端只需要关心所需产品的工厂，无需知道创建细节。
- 相比较简单工厂模式，更加符合开闭原则，后期需要新的产品，只需要新增对应的实现工厂，而不需要去更改抽象工厂。
- 抽象工厂只需要提供一个创建产品的接口，具体实现由子类去实现。

适用环境：
> 简单工厂模式的拓展