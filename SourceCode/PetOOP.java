
public class PetOOP{
    public static void main(String[] args) {
        //인스턴스 (객체생성)
        Dog mydog1 = new Dog();

        Dog myodg2 = new Dog();

        Cat mycat1 = new Cat();

        Cat mycat2 = new Cat();
    }
}

class Animal{
    String type, name;
    public void print(){}
    public void sound(){}
    public void setType(String type){
        this.type=type;
    }
    public void setName(String name){
        this.name = name;
    }
}

class Dog extends Animal{
    @Override
    public void print(){
        System.out.println("(___()'';");
        System.out.println("/,    /'");
        System.out.println("￦￦￦￦￦ --￦￦￦￦");
        System.out.println("￦￦    /￦￦");
    }
    @Override
    public void sound(){
        System.out.println("멍멍!!");
    }
}

class Cat extends Animal{
    @Override
    public void print(){
        System.out.println(" ) ( ')");
        System.out.println("(  /  )");
        System.out.println("￦￦(__)|");
        System.out.println("    }");
    }
    @Override
    public void sound(){
            System.out.println("냐옹...");
    }
}