package design_pattern.template;

/**
 * @author Yanan Lyu
 * @date 2/15/22 10:27 PM
 * @description 抽象类(Abstract Class)： 责给出一个算法的轮廓和骨架。它由一个模板方法和若干个基
 * 本方法构成。
 */
public abstract class AbstractClass {

    /**
     * 模板方法定义
     */
    public final void cookProcess() {
        pourOil();
        heatOil();
        pourVegetable();
        pourSauce();
        fry();
    }

    public void pourOil() {
        System.out.println("倒油");
    }

    /**
     * 第二步：热油是一样的，所以直接实现
     */
    public void heatOil() {
        System.out.println("热油");
    }
    /**
     * 第三步：倒蔬菜是不一样的（一个下包菜，一个是下菜心）
     */
    public abstract void pourVegetable();
    /**
     * 第四步：倒调味料是不一样
     */
    public abstract void pourSauce();
    /**
     * 第五步：翻炒是一样的，所以直接实现
     */
    public void fry(){
        System.out.println("炒啊炒啊炒到熟啊");
    }
}
