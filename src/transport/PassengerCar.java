package transport;

public class PassengerCar extends Car implements Competitor {
    private float maxSpeed;
    private float bestLapTime;

    public PassengerCar(String brand, String model) {
        super(brand, model);
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed < 0 ? 0 : maxSpeed;
    }

    public float getBestLapTime() {
        return bestLapTime;
    }

    public void setBestLapTime(float bestLapTime) {
        this.bestLapTime = bestLapTime < 0 ? 0 : bestLapTime;
    }

    @Override
    public void pitStop() {
        System.out.println("Уходим на отдых");
    }

    @Override
    public void startMove() {
        System.out.println("Быстро стартуем");
    }

    @Override
    public void endMove() {
        System.out.println("Жмем сцепление и тормозим");
    }
}
