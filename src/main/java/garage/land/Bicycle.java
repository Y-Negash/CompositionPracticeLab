package garage.land;

import garage.Vehicle;

public class Bicycle extends Vehicle implements ILandVehicle {

    private int frameSize;
    private int numberOfWheels;

    public Bicycle(float weight, int maxSpeed, int frameSize){
        super(weight, maxSpeed);
        this.frameSize = frameSize;
        this.numberOfWheels = 2;
    }

    @Override
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    @Override
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getFrameSize() {
        return frameSize;
    }

    public void setFrameSize(int frameSize) {
        this.frameSize = frameSize;
    }
}
