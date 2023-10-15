public interface ActorBehavior {
    static String getName() {
        String name = new String();
        return name;
    }

    void setMakeOrder();
    void setTakeOrder();
    boolean isMakeOrder();
    boolean isTakeOrder();
}