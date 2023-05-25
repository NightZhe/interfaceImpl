package Implment;

import Interface.Animal;

//實作 animal 的介面  這是一個 狗實作動物的叫聲的class

public class DogImpl implements Animal{

    @Override
    public void voice() {
        System.out.println("旺旺旺");
    }
    
}
