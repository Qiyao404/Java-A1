import java.util.Scanner;

public class Mage extends SpellCaster{
    public void mageCreat(){
        hp=(int)(Math.random()*10+100);
        damage =(int)(Math.random()*5+30);
        armor = (int)(Math.random()*5+50);
        manaPoints = (int)(Math.random()*20+250);
        Scanner scann = new Scanner(System.in);
        System.out.println("您选择了法师");
        System.out.println("请给他一个名字");
        name = scann.next();
        System.out.println("名字:" + this.name);
        System.out.println("生命值为："+this.hp);
        System.out.println("法术伤害为："+this.damage);
        System.out.println("护甲为："+this.armor);
        System.out.println("能量为："+this.manaPoints);
    }
    public void magePrint(){
        System.out.println("名字:" + this.name);
        System.out.println("生命值为："+this.hp);
        System.out.println("法术伤害为："+this.damage);
        System.out.println("护甲为："+this.armor);
        System.out.println("能量为："+this.manaPoints);
    }
}
