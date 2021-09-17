package cn.pattern.creational.builder.impl;

/**
 * @Author: jianlong.cui
 * @Date: 2021/9/17
 * @Version: 1.0
 * @Desc
 */
public class ChickenBurger extends Burger {

  @Override
  public float price() {
    return 50.5f;
  }

  @Override
  public String name() {
    return "Chicken Burger";
  }
}
