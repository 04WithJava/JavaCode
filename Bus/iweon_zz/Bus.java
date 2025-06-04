class Terminal {
    public void operate() {
        System.out.println("단말기가 작동합니다. 띡!");
    }
}

public class Bus {
    public void ride() {
        System.out.println("버스를 탑니다");
    }
    Terminal terminal = new Terminal();

    public void go() {
        System.out.println("타요가 출발합니다!");
    }

    public void stop() {
        System.out.println("타요가 멈춥니다!");
    }

    public void operateTerminal() {
        terminal.operate();
    }
}
