package design_pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yanan Lyu
 * @date 2/25/22 8:35 AM
 * @description 对象结构类
 */
public class Home {

    // 声明一个集合对象，用来存储元素对象
    private List<Animal> nodeList = new ArrayList<>();

    // 添加元素
    public void add(Animal animal) {
        nodeList.add(animal);
    }

    public void action(Person person) {
        // 遍历集合获取每一个元素，让访问者访问每一个元素
        for (Animal animal : nodeList) {
            animal.accept(person);
        }
    }
}
