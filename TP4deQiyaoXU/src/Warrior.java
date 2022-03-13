import java.util.Scanner;
public class Warrior extends Hero{
    public void wirriorCreat(){
        hp=(int)(Math.random()*5+200);
        damage =(int)(Math.random()*5+40);
        armor = (int)(Math.random()*5+25);
        Scanner scann = new Scanner(System.in);
        System.out.println("您选择了战士");
        System.out.println("请给他一个名字");
        name = scann.next();
        System.out.println("名字:" + this.name);
        System.out.println("生命值为："+this.hp);
        System.out.println("攻击力为："+this.damage);
        System.out.println("护甲为："+this.armor);
    }
    public void warriorPrint(){
        System.out.println("名字:" + this.name);
        System.out.println("生命值为："+this.hp);
        System.out.println("攻击力为："+this.damage);
        System.out.println("护甲为："+this.armor);
    }
}
