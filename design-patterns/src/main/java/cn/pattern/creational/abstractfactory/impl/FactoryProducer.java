package cn.pattern.creational.abstractfactory.impl;

import cn.pattern.creational.abstractfactory.AbstractFactory;

/**
 * @Author: jianlong.cui
 * @Date: 2021/9/24
 * @Version: 1.0
 * @Desc
 */
public class FactoryProducer {

  public static AbstractFactory getFactory(String choice) {
    if (choice.equalsIgnoreCase("SHAPE")) {
      return new ShapeFactory();
    } else if (choice.equalsIgnoreCase("COLOR")) {
      return new ColorFactory();
    }
    return null;
  }
}
