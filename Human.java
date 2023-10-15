public class Human extends Actor implements ActorBehavior {
    

    public String getName() {
        return name;
    }

    public void setMakeOrder() {
        isMakeOrder = true;
        System.out.println("Заказ готовится");
    }

    public void setTakeOrder() {
        isTakeOrder = true;
        System.out.println("Заказ готов");
    }
    

    public boolean isMakeOrder() {
        return isMakeOrder;
       
    }

    public boolean isTakeOrder() {
        return isTakeOrder;
    }
}