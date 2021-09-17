package cn.pattern.creational.builder;

/**
 * @Author: jianlong.cui
 * @Date: 2021/9/17
 * @Version: 1.0
 * @Desc 创建一个表示食物条目
 */
public interface Item {

  public String name();

  public Packing packing();

  public float price();
}
