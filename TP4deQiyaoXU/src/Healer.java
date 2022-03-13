import java.util.Scanner;

public class Healer extends SpellCaster{
    int addhealth;
    public void healerCreat(){
        hp=(int)(Math.random()*10+100);
        damage =(int)(Math.random()*5+30);
        armor = (int)(Math.random()*5+50);
        manaPoints = (int)(Math.random()*20+250);
        addhealth = (int)(Math.random()*5+30);
        Scanner scann = new Scanner(System.in);
        System.out.println("您选择了治疗师");
        System.out.println("请给他一个名字");
        name = scann.next();
        System.out.println("名字:" + this.name);
        System.out.println("生命值为："+this.hp);
        System.out.println("攻击力为："+this.damage);
        System.out.println("护甲为："+this.armor);
        System.out.println("治疗量为："+this.addhealth);
        System.out.println("能量为："+this.manaPoints);
    }
    public void healerPrint(){
        System.out.println("名字:" + this.name);
        System.out.println("生命值为："+this.hp);
        System.out.println("攻击力为："+this.damage);
        System.out.println("护甲为："+this.armor);
        System.out.println("治疗量为："+this.addhealth);
        System.out.println("能量为："+this.manaPoints);
    }

}
