package cn.pattern.creational.factorymethod.impl;

import cn.pattern.creational.factorymethod.Button;

/**
 * @Author: jianlong.cui
 * @Date: 2021/9/24
 * @Version: 1.0
 * @Desc
 */
public class HtmlButton implements Button {

  @Override
  public void render() {
    System.out.println("<button>Test HtmlButton</button>");
    onClick();
  }

  @Override
  public void onClick() {
    System.out.println("Click! Button says - 'HtmlButton!'");
  }
}
