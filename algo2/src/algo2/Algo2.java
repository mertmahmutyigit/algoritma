package algo2;
class dikdörtgen{
int a , b;
dikdörtgen(){

a=1;
b=1;}

dikdörtgen(int na ,int nb){
a=na;
b=nb;}

int alanHesap(){
return a*b;}

int cevrehesap(){ 
return 2*(a+b);}

boolean karemi(){
 if(a==b) return true;
 else return false;
}}

class fan{

final int yavas=1 , orta=2, hizli=3;
int hız;// yavaş
boolean acikmi;// kapalı
double yarıcap;//5
String renk;// beyaz

fan(){

hız=yavas;
acikmi=false;
renk="beyaz";
yarıcap=5;}
fan(int h, boolean ack, String r, double y){
hız=h;
acikmi=ack;
renk=r;
yarıcap=y;}

void göster(){

System.out.println("Hız" + hız + " " + "Açık mı"+ acikmi+ " yarıçap" + yarıcap + " renk "+ renk );
}

void arttir( int h){
if(h>2){System.out.println("hız arttırılmıştır ");}
else {

hız=hız+h;
if(hız>3)
hız=3;}

                   }

}
public class Algo2 {

 
 public static void main(String[] args) {
dikdörtgen d1= new dikdörtgen();
dikdörtgen d2= new dikdörtgen(3,5);
   d1.a=5;
   d1.b=8;
System.out.println(d1.alanHesap());

int c1=d1.cevrehesap();
int c2=d2.cevrehesap();
System.out.println("çevre farkları" + " "+ Math.abs(c1-c2));
d1=d2;
System.out.println("d1.a" + d1.a + " " + "d1.b" + d1.b); 

 
 
 
 fan f1= new fan(); 
 f1.göster();
 fan f2= new fan(1,true,"kırmızı", 8);
 f2.göster();
 f2.arttir(3);
 f2.göster(); 
 
 
}}
