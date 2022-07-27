package newdemo.demo10.demo04;

public class LinkDemo {
    public static void main(String[] args) {
        ILink iLink = new LinkImpl() ;
        iLink.test();
        if (iLink instanceof LinkImpl) {
            LinkImpl link = (LinkImpl) iLink;
            link.a();
        }
    }
}
