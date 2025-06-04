package org.example.gdhhk;

public class Bus {
    int terminal;
    public Bus(){
        this.terminal = 20510;
    }

    public int getTerminal(){
        return this.terminal;
    }
    public void setTerminal(int terminal){
        this.terminal = terminal;
    }

    public void goTo(){
        System.out.println("어서오세요. 돈 내세요");
    }
    public void stop(){
        System.out.println("네 조심히 가요~~");
    }
    public int terminalCheck(int pay){
        int terminal = getTerminal();
        if(pay<1600){
            System.out.println("카드잔액 부족 충전후 이용해주세요~나가시요");
        }else {
            terminal+=pay;
            setTerminal(terminal);
            pay-=1600;
            System.out.println("1600원 확인했습니다.");
        }
        return pay;
    }

}
