package cn.pattern.creational.builder.impl;

/**
 * @Author: jianlong.cui
 * @Date: 2021/9/17
 * @Version: 1.0
 * @Desc 创建一个 MealBuilder 类，实际的 builder 类负责创建 Meal 对象。
 */
public class MealBuilder {

  /**
   * 套餐1： 蔬菜+可口可乐
   * @return
   */
  public Meal prepareVegMeal() {
    Meal meal = new Meal();
    meal.addItem(new VegBurger());
    meal.addItem(new Coke());
    return meal;
  }

  /**
   * 套餐2： 鸡肉 + 百事可乐
   * @return
   */
  public Meal prepareNonVegMeal() {
    Meal meal = new Meal();
    meal.addItem(new ChickenBurger());
    meal.addItem(new Pepsi());
    return meal;
  }
}
