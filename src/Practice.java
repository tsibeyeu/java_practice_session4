abstract class Practice  {
    Practice(){
        System.out.println("this from abstract class constructor ");
    }
    public static void  message(){
        System.out.println("this can referenced from abstract class static");
    }
    abstract void me();
     public void display(){
         System.out.println("this is from abstract class ");
     }
}
class p1 extends Practice{

    @Override
    void me() {
        System.out.println("i practice java now ");

    }
}
class subclass extends Practice{
    subclass(){
        super();
    }

    @Override
    void me() {
        System.out.println("in second subclass");

    }

    public static void main(String[] args) {
        subclass obj=new subclass();
        obj.display();
        obj.me();
        p1 obj1=new p1();
        obj1.me();
        Practice.message();
        obj1.display();
    }

}
