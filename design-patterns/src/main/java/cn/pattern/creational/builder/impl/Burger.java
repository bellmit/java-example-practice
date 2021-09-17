package cn.pattern.creational.builder.impl;

import cn.pattern.creational.builder.Item;
import cn.pattern.creational.builder.Packing;

/**
 * @Author: jianlong.cui
 * @Date: 2021/9/17
 * @Version: 1.0
 * @Desc 汉堡
 */
public abstract class Burger implements Item {

  @Override
  public Packing packing() {
    return new Wrapper();
  }

  @Override
  public abstract float price();
}
