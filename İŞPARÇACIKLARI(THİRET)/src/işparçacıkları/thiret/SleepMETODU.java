package işparçacıkları.thiret;

import jdk.nashorn.internal.parser.TokenType;

class robot extends Thread{

public robot(String isim){
super(isim);
}
public void run(){

    try {
        
        String isim=this.getName();
        for (int i = 0; i <5; i++) {
            if((isim.equals("robot1")&& (i==3))){
                System.out.println(isim+"  === uyutuluyor ");
            }
            Thread.sleep(500);
        
            else if((isim.equals("robot2")&&(i==2))){System.out.println(isim+ " ");}
         Thread.sleep(500);
        }
        
    } catch (Exception e) {
    }

}



}


public class SleepMETODU {
    
}
