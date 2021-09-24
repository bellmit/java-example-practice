package cn.pattern.creational.abstractfactory.impl;

import cn.pattern.creational.abstractfactory.AbstractFactory;
import cn.pattern.creational.abstractfactory.Color;
import cn.pattern.creational.abstractfactory.Shape;

/**
 * @Author: jianlong.cui
 * @Date: 2021/9/24
 * @Version: 1.0
 * @Desc
 */
public class ShapeFactory extends AbstractFactory {

  @Override
  public Color getColor(String color) {
    return null;
  }

  @Override
  public Shape getShape(String shape) {
    if (shape == null) {
      return null;
    }
    if (shape.equalsIgnoreCase("CIRCLE")) {
      return new Circle();
    } else if (shape.equalsIgnoreCase("RECTANGLE")) {
      return new Rectangle();
    } else if (shape.equalsIgnoreCase("SQUARE")) {
      return new Square();
    }
    return null;
  }
}
