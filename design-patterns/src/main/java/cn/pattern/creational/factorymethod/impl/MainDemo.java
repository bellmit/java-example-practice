package cn.pattern.creational.factorymethod.impl;

import cn.pattern.creational.factorymethod.Dialog;

/**
 * @Author: jianlong.cui
 * @Date: 2021/9/24
 * @Version: 1.0
 * @Desc 客户端代码
 */
public class MainDemo {

  private static Dialog dialog;

  public static void main(String[] args) {
    configure();
    runBusinessLogic();
  }

  /**
   * The concrete factory is usually chosen depending on configuration or
   * environment options.
   */
  static void configure() {
    String system = System.getProperty("os.name");
    if (system.contains("Mac") || system.contains("Window")) {
      dialog = new WindowsDialog();
    } else {
      dialog = new HtmlDialog();
    }
  }

  /**
   * All of the client code should work with factories and products through
   * abstract interfaces. This way it does not care which factory it works
   * with and what kind of product it returns.
   */
  static void runBusinessLogic() {
    dialog.renderWindow();
  }

}
