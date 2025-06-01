package org.example.gdhhkkl;

public class Cuisine {
    private String jajangMyeon ;
    private String jamBong ;
    private String sweetSourPork;


    public String getJajangMyeon(){
        return this.jajangMyeon = "짜장면";
    }
    public String getJamBong(){
        return this.jamBong = "짬뽕";
    }

    public String getSweetSourPork( ){
        return this.sweetSourPork="탕수육" ;
    }


    public String makeFood(int hand){
        String food ="";
        if (hand==1){
            food=getJajangMyeon();
        } else if (hand==2) {
            food=getJamBong();
        } else if (hand==3) {
            food=getSweetSourPork();
        }
        return  food;
    }
}
