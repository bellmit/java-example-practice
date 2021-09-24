package cn.pattern.creational.abstractfactory;

/**
 * @Author: jianlong.cui
 * @Date: 2021/9/24
 * @Version: 1.0
 * @Desc 为 Color 和 Shape 对象创建抽象类来获取工厂
 */
public abstract class AbstractFactory {

  public abstract Color getColor(String color);

  public abstract Shape getShape(String shape);
}
