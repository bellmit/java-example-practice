package cn.pattern.creational.builder.impl;

import cn.pattern.creational.builder.Item;
import cn.pattern.creational.builder.Packing;

/**
 * @Author: jianlong.cui
 * @Date: 2021/9/17
 * @Version: 1.0
 * @Desc 冷饮
 */
public abstract class ColdDrink implements Item {

  @Override
  public Packing packing() {
    return new Bottle();
  }

  @Override
  public abstract float price();
}
