package garage.engine;

public class ElectricEngine implements IEngine{

    private int horsePower;
    private int batteryLevel;

    public ElectricEngine(int horsePower, int batteryLevel){
        this.horsePower = horsePower;
        this.batteryLevel = batteryLevel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int  batteryLevel) {
        this.batteryLevel = batteryLevel;
    }
}
