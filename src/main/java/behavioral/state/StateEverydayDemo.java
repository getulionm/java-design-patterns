package behavioral.state;

public class StateEverydayDemo {

    public static void main(String[] args) {
        EverydayFan fan = new EverydayFan();

        System.out.println(fan);

        fan.pullChain();

        System.out.println(fan);

        fan.pullChain();

        System.out.println(fan);
    }

}
