package işparçacıkları.thiret;


    class BirinciIsParcacigi extends Thread {
	NesneBir nesneBir ;
	public BirinciIsParcacigi(NesneBir nb ) {
		this.nesneBir = nb ; 
	}
	public void run() {
		nesneBir.metodIki();
	}
}
class IkinciIsParcacigi extends Thread {
	NesneBir nesneBir ;
	public IkinciIsParcacigi(NesneBir nb) {
		this.nesneBir = nb ; 
	}
	public void run() {
		nesneBir.metodBir();
	}
}
class NesneBir {
	Object kilitBir = new Object();
	Object kilitIki = new Object();
                  public void metodBir() {
	 synchronized (kilitBir) { // dikkat
	 try {
	            Thread.sleep(1);
      	} catch ( InterruptedException iEx ) {
                                 // bosver
	}
	synchronized (kilitIki) { // dikkat
System.out.println("NesneBir metodBir() ->" + Thread.currentThread().getName()  + " tarafindan cagrildi");
 
        }}}
  public void metodIki() {
           synchronized (kilitIki) { // dikkat
           try {
	Thread.sleep(1);
         } catch ( InterruptedException iEx ) { 
	// bosver
          }
       synchronized (kilitBir) {  // dikkat
     System.out.println("NesneBir metodIki() ->" + Thread.currentThread().getName()
		 + " tarafindan cagrildi");
	// islem yap
	}
        }
  }
}
public class Kilitlenme {
	public static void main(String args[]) throws Exception {
		NesneBir nb = new NesneBir();
		BirinciIsParcacigi bip = new BirinciIsParcacigi(nb);
		IkinciIsParcacigi  iip = new IkinciIsParcacigi(nb);

		bip.start();
		iip.start();
	}
}

