package işparçacıkları.thiret;

public class SLLEP extends Thread{
          public void run() {
	try {
                        while (true) { // sonsuz dongu
	       System.out.println("uyuyor....");
	       Thread.sleep(60 * 10);
	}
	} catch (InterruptedException iEx) {
		// bosver
	}
          }

public static void main(String args[]) {
          SLLEP ut = new SLLEP(); 
           ut.start();
           }
}

