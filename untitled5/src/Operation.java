public class Operation extends Process{

    private int resourceAmount;

    @Override
    public void setInfo(int id, int info) {
        this.id = id;
        this.resourceAmount = info;
    }

    @Override
    public void setInfo(String reason, int info) {
    }

    @Override
    public void getInfo() {
        System.out.println("Операция ID: "+id+", расход ресурса: "+resourceAmount);
    }

    @Override
    public int getResourceAmount() {
        return resourceAmount;
    }
}
