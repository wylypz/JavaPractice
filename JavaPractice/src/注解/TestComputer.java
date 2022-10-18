package 注解;
@Computer(name ="神舟战神",price = 3800,factories = {"华南厂商","华北厂商"})
public class TestComputer {
    @Computer(name = "神舟优雅",price = 4200,factories = {"华中厂商","华东厂商"})
    public void buyComputer(){
        System.out.println("买神舟电脑啦~~好开森~~");

    }
}
