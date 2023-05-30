package Implment;

// import Interface.Animal;

//實作 animal 的介面  這是一個 狗實作動物的叫聲的class
// public class DogImpl implements Animal
public class DogImpl extends AbstractComposer{

    @Override
    public void voice() {
        System.out.println("旺旺旺");
    }

    @Override
    public void init(String color, String type) {
        System.out.println("這是dog的 AbstractCompoer: 顏色"+color+", 種類: "+type);
    }
   
}
