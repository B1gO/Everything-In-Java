package decorator;

/**
 * @author ylyu
 * @version 1.0
 * @date 1/9/22 12:27 PM
 * @description 抽象构件（Component）角色
 */
public abstract class FastFood {

    private float price;
    private String desc;

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public abstract float cost();

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
