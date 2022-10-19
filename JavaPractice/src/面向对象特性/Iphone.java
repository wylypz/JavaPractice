package 面向对象特性;

public class Iphone extends Phone{
    private int number;

    public Iphone(int price,String brand,int number){

        super(price,brand);
        this.number = number;
    }
}
