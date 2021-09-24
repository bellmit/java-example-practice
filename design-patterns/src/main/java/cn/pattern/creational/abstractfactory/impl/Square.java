package cn.pattern.creational.abstractfactory.impl;

import cn.pattern.creational.abstractfactory.Shape;

/**
 * @Author: jianlong.cui
 * @Date: 2021/9/24
 * @Version: 1.0
 * @Desc
 */
public class Square implements Shape {

  @Override
  public void draw() {
    System.out.println("Inside Square::draw() method.");
  }
}
