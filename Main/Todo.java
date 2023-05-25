package Main;

import Implment.CatImpl;
import Implment.DogImpl;

//這個部分就能達到 一個介面兩個不同 override，但是在這邊重新個new 一個出來 指定去找哪個voice() 

public class Todo {
    public static void main(String[] args) {
        //把CatImpl new 出來使用來去使用overrider voice()
        CatImpl cat = new CatImpl();
        cat.voice();
        //把DogImpl new 出來使用來去使用overrider voice()
        DogImpl dog = new DogImpl();
        dog.voice();
    }
}
