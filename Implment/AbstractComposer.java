package Implment;

import Interface.Animal;

public abstract class AbstractComposer implements Animal {

    @Override
    public void voice() {
    }

    //抽象方法可傳兩個參數
    @Override
    public abstract void init(String cat ,String dog);
    
}
