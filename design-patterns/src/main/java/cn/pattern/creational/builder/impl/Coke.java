package cn.pattern.creational.builder.impl;

/**
 * @Author: jianlong.cui
 * @Date: 2021/9/17
 * @Version: 1.0
 * @Desc
 */
public class Coke extends ColdDrink{

  @Override
  public String name() {
    return "Coke";
  }

  @Override
  public float price() {
    return 30.0f;
  }
}
