package newdemo.demo05;

public class Main {

    public static void main(String[] args) {
        Action personAction = new Person() ;
        Action robotAction = new Robot() ;
        Action pigAction = new Pig() ;

        personAction.command(Action.EAT + Action.SLEEP + Action.WORK);
        /*
        人吃饭
        人睡觉
        人工作
         */
        robotAction.command(Action.EAT); // 机器人充电
        pigAction.sleep(); // pig睡
    }
}
