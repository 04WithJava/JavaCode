package chinese;

public class kitchen {
         String name = "Tomato";
         String jjajangmyeon;
         String jjamppong;
         String tangsuyuk;

         kitchen() {
             this.jjajangmyeon = "짜장면";
             this.jjamppong = "짬뽕";
             this.tangsuyuk = "탕수육";
         }

         void cook(String menu) {
             System.out.println(name + ": " + menu + "을(를) 조리합니다.");
         }
     }

