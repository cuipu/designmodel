package com.designmodel.demo.composite;

/**
 * @program: designmodel
 * @className: TestComposite
 * @Description: 组合（Composite）模式的定义：有时又叫作部分-整体模式，它是一种将对象组合成树状的层次结构的模式，用来表示“部分-整体”的关系，使用户对单个对象和组合对象具有一致的访问性。
 * <p>
 * 组合模式的主要优点有：
 * 组合模式使得客户端代码可以一致地处理单个对象和组合对象，无须关心自己处理的是单个对象，还是组合对象，这简化了客户端代码；
 * 更容易在组合体内加入新的对象，客户端不会因为加入了新的对象而更改源代码，满足“开闭原则”；
 * <p>
 * 其主要缺点是：
 * 设计较复杂，客户端需要花更多时间理清类之间的层次关系；
 * 不容易限制容器中的构件；
 * 不容易用继承的方法来增加构件的新功能；
 * <p>
 * 模式的结构
 * 组合模式包含以下主要角色。
 * 抽象构件（Component）角色：它的主要作用是为树叶构件和树枝构件声明公共接口，并实现它们的默认行为。在透明式的组合模式中抽象构件还声明访问和管理子类的接口；在安全式的组合模式中不声明访问和管理子类的接口，管理工作由树枝构件完成。
 * 树叶构件（Leaf）角色：是组合中的叶节点对象，它没有子节点，用于实现抽象构件角色中 声明的公共接口。
 * 树枝构件（Composite）角色：是组合中的分支节点对象，它有子节点。它实现了抽象构件角色中声明的接口，它的主要作用是存储和管理子部件，通常包含 Add()、Remove()、GetChild() 等方法。
 * <p>
 * 组合模式分为透明式的组合模式和安全式的组合模式。
 * <p>
 * 透明方式：在该方式中，由于抽象构件声明了所有子类中的全部方法，所以客户端无须区别树叶对象和树枝对象，对客户端来说是透明的。但其缺点是：树叶构件本来没有 Add()、Remove() 及 GetChild() 方法，却要实现它们（空实现或抛异常），这样会带来一些安全性问题。
 * <p>
 * 安全方式：在该方式中，将管理子构件的方法移到树枝构件中，抽象构件和树叶构件没有对子对象的管理方法，这样就避免了上一种方式的安全性问题，但由于叶子和分支有不同的接口，客户端在调用时要知道树叶对象和树枝对象的存在，所以失去了透明性。
 * <p>
 * 参考网址：
 * http://c.biancheng.net/view/1373.html
 * <p>
 * 个人认知：
 * 树枝节点维护一个列表存储叶子节点
 * @author: Mr.Cui
 * @Date: 2020/8/31 23:25
 */
public class TestComposite {

    public static void main(String[] args) {
        Component c0 = new Composite();
        Component c1 = new Composite();
        Component leaf1 = new Leaf("1");
        Component leaf2 = new Leaf("2");
        Component leaf3 = new Leaf("3");
        c0.add(leaf1);
        c0.add(c1);
        c1.add(leaf2);
        c1.add(leaf3);
        c0.operation();

        /****************************************************************/
        SecurityComponent securityLeaf1 = new SecurityLeaf("1");
        SecurityComponent securityLeaf2 = new SecurityLeaf("2");
        SecurityComponent securityLeaf3 = new SecurityLeaf("3");

        // 如果使用多态则无法使用SecurityComposite下特有的方法
        SecurityComposite sc0 = new SecurityComposite();
        SecurityComposite sc1 = new SecurityComposite();
        sc0.add(securityLeaf1);
        sc0.add(securityLeaf2);
        sc0.add(securityLeaf3);
        sc1.add(securityLeaf1);
        sc1.add(securityLeaf2);
        sc0.operation();

    }
}
