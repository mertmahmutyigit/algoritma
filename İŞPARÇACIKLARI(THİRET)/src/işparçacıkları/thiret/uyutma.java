//500 ms de isim 500 ms de soyisim yazan iş parçaçığı try kullanmamızın sebebi try kullanıldı ististayaı yakalamakk
package işparçacıkları.thiret;

import sun.text.resources.cldr.be.FormatData_be;


public class uyutma  extends  Thread{
    String ad,soyad; int say;
    public uyutma(String ad, String soyad, int say){
    this.ad=ad;
    this.soyad=soyad;
    this.say=say;
    }
    
    public void run(){
        
        
    try { for (int i = 0; i < 10; i++) {
            System.out.println(ad);
    Thread.sleep(500);
        System.out.println(soyad);
        Thread.sleep(500);}
        
    }catch(Exception e){}
    
    }

    public static void main(String[] args) {
      uyutma i= new uyutma("mert","yiğit",10);
      i.start();
    }
}

/////////////////////////////////////////////////////////////////
 







