package newdemo.demo10.demo01;

public class LinkImpl<E> implements ILink<E> {
    private class Node { // 保存节点的数据关系
        private E data ; // 保存的数据
        private Node next ; // 保存下一个引用
        public Node(E data) { // 有数据的情况下才有意义
            this.data = data ;
        }
        // 第一次调用：this = LinkImpl.root;
        // 第二次调用：this = LinkImpl.root.next;
        // 第二次调用：this = LinkImpl.root.next.next;
        public void addNode(Node newNode) { // 保存新的Node数据
            if(this.next == null) { // 当前节点的下一个节点为null
                this.next = newNode ; // 保存当前节点
            }else {
                this.next.addNode(newNode);
            }
        }
    }
    // ----------------以下为Link类中定义的成员----------------
    private Node root ; // 保存根元素
    private int count ; // 保存数据个数
    // ----------------以下为Link类中定义的方法----------------
    @Override
    public void add(E e) {
        if(e == null) { // 保存的数据为null
            return; // 方法调用直接结束
        }
        //数据本身是不具有关联特性的，只有Node类有，那么要想实现关联就必须将数据包装在Node类之中
        Node newNode = new Node(e) ; // 创建一个新的节点
        if(this.root == null) { // 现在没有根节点
            this.root = newNode ; // 第一个节点作为根节点
        }else { // 根节点存在
            this.root.addNode(newNode); // 将新节点保存在合适的位置
        }
        this.count ++ ;
    }

    @Override
    public int size() {
        return this.count ;
    }
}
