package base;

/**
 * @author Linker
 * @date 2/18/2023 4:25 AM
 * @description：Collection
 */
public class Demo4 {

    /**
     * IDEA 查看类的继承结构与关系图
     * 右键 Diagrams -> Show Diagram
     */

    /**
     * List,Set,Queue,Map
     *
     * List - 有序、可重复
     * Set - 无序、不可重复
     * Queue - 有序、可重复
     * Map - 键值对(key-value) key无序、不可重复 - value无序、可重复
     */

    /**
     * Collection
     *  - List
     *      - ArrayList: Object[]
     *      - Vector: Object[]
     *      - LinkedList: 双向链表(JDK1.6前为循环链表，JDK1.7后取消循环)
     *  - Set
     *      - HashSet-无序、唯一 - 基于HashMap实现、保存元素
     *      - LinkedHashSet - 是HashSet的子类，通过LinkedHashMap实现
     *      - TreeSet - 有序，唯一 - 红黑树
     *
     *  - Queue
     *      - PriorityQueue: Object[]
     *      - ArrayQueue: Object[]
     *  - Map
     *      - HashMap - JDK1.8前 - 数组+链表 数组为HashMap主体，链表解决哈希冲突
     *                - JDK1.8后 - 为了解决哈希冲突，链表长度大于阈值（default 8）
     *                                  - 当前数组长度小于64，先数组扩容
     *                                  - 大于64再将链表转化为红黑树
     *
     */

    /**
     * ArrayList 和 Vector 的区别?
     *
     * ArrayList - List的主要实现 - Object[] - 线程不安全
     * Vector - List的古老实现类 - Object[] - 线程安全
     */

    /**
     * ArrayList 和 LinkedList 区别？
     * ArrayList和 LinkedList都不同步，不保证线程安全
     * 底层数据结构 - ArrayList 使用Object[] - LinkedList底层双向链表
     *
     * 插入和删除是否接受元素位置的影响
     *  - ArrayList采用数组，插入
     */

}
