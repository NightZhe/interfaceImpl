package Main;


import Implment.CatImpl;
import Implment.DogImpl;
import Interface.Animal;




public class testAbstract {
  

    //Animal import interface , 給變數 animal 。 animal.init init是animail interface   這邊是實作給參數。
    public static boolean dog(Animal animal){
        animal.init("black", "local dog");
        return true;   
    }
    public static void cat(Animal animal){
        animal.init("yellow", "fatcat");
    }

    public static void main(String[] args) {

        Animal animal = new DogImpl();  //指定animal > implent.DogImpl
        Boolean successFlag =dog(animal); 
        // dog > public static boolean dog(Animal animal)
        // dog(animal) animal > implment.DogImpl 裡面的 init  雖然Implment.DogImpl & Implent.CatImpl 都有init,但不會去抓到cat init
        
        Animal animal1 = new CatImpl();
        cat(animal1);


        System.out.println(successFlag);
    }
    
    
}
