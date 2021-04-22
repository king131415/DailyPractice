package javaDailyProctice.Charcketor;

public class Muble extends Adator{
   public void outputChar(V v){
       if(v.outPutDian()==5){
           System.out.println("冲电成功！！");
       }else if(v.outPutDian()>5){
           System.out.println("炸了");
       }
   }
}
