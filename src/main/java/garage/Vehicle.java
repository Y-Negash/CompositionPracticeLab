package garage;

public abstract class Vehicle {

    private float weight;
    private int maxSpeed;

    public Vehicle(float weight, int maxSpeed){
        this.weight = weight;
        this.maxSpeed = maxSpeed;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
