public class Postion implements Consumable{
    int amount;

    public int addPostion(int i){
        amount += i;
        return amount;
    }
    public int usePostion(int i){
        amount -= i;
        return amount;
    }
    public int addMana(int manaPoints){
        manaPoints += 75;
        return manaPoints;
    }

}
