package cn.pattern.creational.builder.impl;

/**
 * @Author: jianlong.cui
 * @Date: 2021/9/17
 * @Version: 1.0
 * @Desc
 */
public class VegBurger extends Burger {

  @Override
  public float price() {
    return 25.0f;
  }

  @Override
  public String name() {
    return "Veg Burger";
  }
}
