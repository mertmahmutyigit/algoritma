
package işparçacıkları.thiret;


public class İŞPARÇACIKLARITHİRET extends Thread{
int sayı; 
public İŞPARÇACIKLARITHİRET(int sayı){

this.sayı=sayı;
}



  public void run(){
      for (int i = 0; i < 10; i++) {
          System.out.println(i+"\t");
      }
  
  }
  
  
  
  
  
    public static void main(String[] args) {
  İŞPARÇACIKLARITHİRET s= new İŞPARÇACIKLARITHİRET(9);
  sınıf2 s2=new sınıf2('a',20);
  Thread t= new Thread(s2);
  s.start();
  t.start();
   
    }}
    

class sınıf2 implements Runnable{

char c ; int say;
public sınıf2(char c,int say){

this.c=c;
this.say=say;

}
public void run(){for (int i = 0; i < say; i++) 
     System.out.println(c+"\t");   
    
}
}





