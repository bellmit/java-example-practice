package cn.pattern.creational.factorymethod.impl;

import cn.pattern.creational.factorymethod.Button;
import cn.pattern.creational.factorymethod.Dialog;

/**
 * @Author: jianlong.cui
 * @Date: 2021/9/24
 * @Version: 1.0
 * @Desc
 */
public class HtmlDialog extends Dialog {

  @Override
  public Button createButton() {
    return new HtmlButton();  }
}
