public class Food implements Consumable{
    int amount;

    public int addPostion(int i){
        amount += i;
        return amount;
    }
    public int usePostion(int i){
        amount -= i;
        return amount;
    }
    public int addHealth(int health){
        health += 50;
        return health;
    }
}
