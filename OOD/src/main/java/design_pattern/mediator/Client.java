package design_pattern.mediator;

/**
 * @author Yanan Lyu
 * @date 2/23/22 7:54 AM
 */
public class Client {
    public static void main(String[] args) {
        // 创建中介者对象
        MediatorStructure mediator = new MediatorStructure();

        // 创建租房者对象
        Tenant tenant = new Tenant("房主李四", mediator);
        HouseOwner houseOwner = new HouseOwner("租客张三", mediator);

        // 中介者要知道具体的房主和租房者
        mediator.setHouseOwner(houseOwner);
        mediator.setTenant(tenant);

        tenant.contact("我要租三室的房子");
        houseOwner.contact("我有三室的房子，你要租么？");
    }
}
