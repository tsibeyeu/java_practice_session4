
interface car{
   public void speed(double speed);
  public   void model();
}
interface animal{
   public void cat();
   public void zebra();
}
 class Lombard implements car {
    public void speed(double speed){
        System.out.println("its speed in per hr "+speed);
}

     @Override
     public void model() {
         System.out.println("current model");
     }
     interface car2{
        void speed(int speed);
        void model();
     }

     class P12 implements car2  {


         @Override
         public void speed(int speed) {
             System.out.println(" its faster than 2000 from lombard "+speed);
         }

         @Override
    public void model() {
        System.out.println("its model 2022 p1");
    }
}
}
 class animalzoo implements animal {
    public void cat(){
        System.out.println("cat one type of animal");
    }

     @Override
     public void zebra() {

     }

     class Nechsarpark extends animalzoo{
        @Override
        public void zebra() {
            System.out.println("it found in nechsarpark ");
        }
    }
{

    }
}
