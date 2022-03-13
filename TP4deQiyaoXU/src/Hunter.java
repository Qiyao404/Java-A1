import java.util.Scanner;

public class Hunter extends Hero{
    public int fleche;

    public void hunterCreat(){
        hp=(int)(Math.random()*5+130);
        damage =(int)(Math.random()*5+30);
        armor = (int)(Math.random()*5+50);
        fleche = 20;
        Scanner scann = new Scanner(System.in);
        System.out.println("您选择了猎人");
        System.out.println("请给他一个名字");
        name = scann.next();
        System.out.println("名字:" + this.name);
        System.out.println("生命值为："+this.hp);
        System.out.println("攻击力为："+this.damage);
        System.out.println("护甲为："+this.armor);
        System.out.println("弓箭数量:" + this.fleche);
    }
    public void hunterPrint(){
        System.out.println("名字:" + this.name);
        System.out.println("生命值为："+this.hp);
        System.out.println("攻击力为："+this.damage);
        System.out.println("护甲为："+this.armor);
        System.out.println("弓箭数量:" + this.fleche);
    }
}
