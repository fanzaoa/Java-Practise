package newdemo.demo10.demo02;

public class LinkImpl<E> implements ILink<E> {
    private class Node {
        private E data ;
        private Node next ;
        public Node(E data) {
            this.data = data ;
        }
        public void nextNode(Node newNode) {
            if(this.next == null) {
                this.next = newNode ;
            }else {
                this.next.nextNode(newNode);
            }
        }
        public void toArrayNode() {
            LinkImpl.this.returnArray[LinkImpl.this.foot++] = this.data ;
            if(this.next != null) {
                this.next.toArrayNode();
            }
        }
        public E getNode(int index) {
            if(LinkImpl.this.foot ++ == index) {
                return this.data ;
            }else {
                return this.next.getNode(index) ;
            }
        }
        public void setNode(int index,E data) {
            if(LinkImpl.this.foot ++ == index) {
                this.data = data ;
            }else {
                this.next.setNode(index,data);
            }
        }
        public boolean containsNode(E data) {
            if(data.equals(this.data)) {
                return true ;
            }else {
                if(this.next == null) {
                    return false ;
                }else {
                    return this.next.containsNode(data) ;
                }
            }
        }
        public void removeNode(Node previous,E data) {
            if(this.data.equals(data)) {
                previous.next = this.next ;
            }else {
                if(this.next != null) {
                    this.next.removeNode(this,data);
                }
            }
        }
    }
    private Node root ; // 根元素
    private int count ; // 数据个数
    private int foot ; // 脚标
    private Object[] returnArray; // 数据保存
    @Override
    public void add(E e) {
        if(e == null) {
            return;
        }
        Node newNode = new Node(e) ;
        if(this.root == null) {
            this.root = newNode ;
        }else {
            this.root.nextNode(newNode);
        }
        count ++ ;
    }
    public int count() {
        return count ;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public Object[] toArray() {
        if (this.isEmpty()) {
            return null ;
        }
        this.foot = 0 ;
        this.returnArray = new Object[this.count] ;
        this.root.toArrayNode();
        return this.returnArray ;
    }

    public E get(int index) {
        if(index > this.count) {
            return null ;
        }
        this.foot = 0;
        return this.root.getNode(index) ;
    }

    public void set(int index,E data) {
        if(index > this.count) {
            return;
        }
        this.foot = 0;
        this.root.setNode(index, data);
    }

    public boolean contains(E data) {
        if(data == null) {
            return false ;
        }
        return this.root.containsNode(data) ;
    }

    public void remove(E data) {
        if(this.contains(data)) {
            if(this.root.data.equals(data)) {
                this.root = this.root.next ;
            }else {
                this.root.removeNode(this.root,data);
            }
            this.count -- ;
        }
    }
    public void clean() {
        this.root = null ;
        this.count = 0 ;
    }
}
