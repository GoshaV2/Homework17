package transport;

public class Bus extends Car implements Competitor {
    private float maxSpeed;
    private float bestLapTime;

    public Bus(String brand, String model) {
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
        System.out.println("Высаживаем всех и на боковую");
    }

    @Override
    public void startMove() {
        System.out.println("Закрыть двери и погнали");
    }

    @Override
    public void endMove() {
        System.out.println("Остановится и открыть двери");
    }
}
