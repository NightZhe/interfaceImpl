package Implment;

// import Interface.Animal;

//這是一個貓 實作動物介面 (聲音);
// public class CatImpl implements Animal
public class CatImpl extends AbstractComposer {

    @Override
    public void voice() {
        System.out.println("喵喵喵");
    }

    @Override
    public void init(String color, String type) {
       System.out.println("這是貓的AbstractComper implement Animal: 顏色"+color+", 種類: "+type);

    }

   
    
}
