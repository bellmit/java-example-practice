package cn.pattern.creational.factorymethod;

/**
 * @Author: jianlong.cui
 * @Date: 2021/9/24
 * @Version: 1.0
 * @Desc 基础创建者
 */
public abstract class Dialog {

  public void renderWindow() {

    Button okButton = createButton();
    okButton.render();
  }

  /**
   * Subclasses will override this method in order to create specific button
   * objects.
   */
  public abstract Button createButton();
}
