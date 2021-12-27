import java.util.List;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        input.setDefaultInputList();
        List inputList = input.getDefaultList();
        Calculating calculating = new Calculating();
        calculating.calculate(inputList);
        calculating.outPut(inputList);
    }
}
