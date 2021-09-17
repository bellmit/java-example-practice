package cn.pattern.creational.builder.impl;

import java.util.ArrayList;
import java.util.List;

import cn.pattern.creational.builder.Item;

/**
 * @Author: jianlong.cui
 * @Date: 2021/9/17
 * @Version: 1.0
 * @Desc 创建一个 Meal 类，带有上面定义的 Item 对象。
 */
public class Meal {

  private List<Item> items = new ArrayList<Item>();

  public void addItem(Item item) {
    items.add(item);
  }

  public float getCost() {
    float cost = 0.0f;
    for (Item item : items) {
      cost += item.price();
    }
    return cost;
  }

  public void showItems() {
    for (Item item : items) {
      System.out.print("Item : " + item.name());
      System.out.print(", Packing : " + item.packing().pack());
      System.out.println(", Price : " + item.price());
    }
  }

}
