// ödev 00123
//      45682
  //   topla 
package algo2.pkg3;

class Matematik{
  static double p1=3.14;

//static int mutlak(int a){};


 static double mutlak(double b){
if(b>0) return b;
else return b*(-1);

}
static boolean asalmi(int a){
for(int i=2; i<a/2; i++)
if(a%i==0) return false; 
  return true;}
static int ushesap(int a, int b){
int us=1;
for(int i=1; i<=b;i++){
us=us*a;
}
return us;

}



}
public class Algo23 {


    public static void main(String[] args) {
   System.out.println(Matematik.p1);
   System.out.println(Matematik.asalmi(75));
   System.out.println(Matematik.mutlak(-2.8));
   System.out.println(Matematik.ushesap(2,4));
    }
    
}
