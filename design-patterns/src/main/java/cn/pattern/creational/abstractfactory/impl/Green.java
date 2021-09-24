package cn.pattern.creational.abstractfactory.impl;

import cn.pattern.creational.abstractfactory.Color;

/**
 * @Author: jianlong.cui
 * @Date: 2021/9/24
 * @Version: 1.0
 * @Desc
 */
public class Green implements Color {

  @Override
  public void fill() {
    System.out.println("Inside Green::fill() method.");
  }
}
