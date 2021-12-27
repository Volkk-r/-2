import java.util.ArrayList;
import java.util.List;

public class Input {
    List<Process> inputList = new ArrayList<>();
    int[] defaultAmounts = {20,20,60,40,40,20,40,60,40,20,60,20,60};
    public void setDefaultInputList() {
        for (int i = 0; i < defaultAmounts.length; i++) {
            Process operation = new Operation();
            operation.setInfo(i,defaultAmounts[i]);
            inputList.add(operation);
        }
        Process downTime = new DownTime();
        downTime.setInfo("error404",20);
        inputList.add(downTime);
    }
    public List<Process> getDefaultList(){
        return inputList;
    }
}
