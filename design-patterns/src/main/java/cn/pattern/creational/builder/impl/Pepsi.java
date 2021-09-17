package cn.pattern.creational.builder.impl;

/**
 * @Author: jianlong.cui
 * @Date: 2021/9/17
 * @Version: 1.0
 * @Desc
 */
public class Pepsi extends ColdDrink {

  @Override
  public String name() {
    return "Pepsi";
  }

  @Override
  public float price() {
    return 35.0f;
  }
}
