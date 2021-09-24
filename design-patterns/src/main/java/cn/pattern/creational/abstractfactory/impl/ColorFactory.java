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
public class ColorFactory extends AbstractFactory {

  @Override
  public Color getColor(String color) {
    if (color == null) {
      return null;
    }
    if (color.equalsIgnoreCase("RED")) {
      return new Red();
    } else if (color.equalsIgnoreCase("GREEN")) {
      return new Green();
    } else if (color.equalsIgnoreCase("BLUE")) {
      return new Blue();
    }
    return null;
  }

  @Override
  public Shape getShape(String shape) {
    return null;
  }
}
