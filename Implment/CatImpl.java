package Implment;

import Interface.Animal;

//這是一個貓 實作動物介面 (聲音);

public class CatImpl implements Animal {

    @Override
    public void voice() {
        System.out.println("喵喵喵");
    }
    
}
