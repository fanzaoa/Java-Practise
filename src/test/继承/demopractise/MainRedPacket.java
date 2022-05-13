package test.继承.demopractise;

import java.util.ArrayList;

public class MainRedPacket {

    public static void main(String[] args) {
        Manager manager = new Manager("群主",100);

        Member one = new Member("群员A",0);
        Member two = new Member("群员B",0);
        Member three = new Member("群员C",0);

        manager.show();// 100
        one.show();// 0
        two.show();// 0
        three.show();// 0
        System.out.println("=============");

        // 群主总共发20块钱，分成3个红包
        ArrayList<Integer> redList = manager.send(20,3);
        //三个普通成员收红包
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manager.show();
        one.show();
        two.show();
        three.show();
    }
}
