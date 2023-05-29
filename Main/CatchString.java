package Main;

import Implment.CatImpl;
import Implment.Other;

public class CatchString {
    public static void main(String[] args) {
        String s = "hi, my name is jay.Today is a beautiful day";
        String result= s.substring(0, s.indexOf('.'));
        System.out.println(result);

        CatImpl  cat = new CatImpl();
        Other  ot = new Other();
        ot.sum(3, 4);
        if( cat instanceof Interface.Animal){  // A instanceof  B 判斷物件是不是 某個B(可以是interface ，或是任何的object)的，子類別， 
            System.out.println("cat是Animal介面的實作 , true");
        }else{
            System.out.println("cat不是Animal介面的實作 , false");
        }

        if( ot instanceof Interface.Animal){
            System.out.println("ot 是 Animal介面的實作 , true");
        }else{
            System.out.println("ot 不是 Animal介面的實作 , false");
        }
        
    }

    public void outmainfunction (){
        System.out.println("out main");
    }
}
