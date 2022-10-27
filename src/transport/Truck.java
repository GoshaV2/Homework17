package transport;

public class Truck extends Car implements Competitor{
    private float maxSpeed;
    private float bestLapTime;

    public Truck(String brand, String model) {
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
        System.out.println("Чистим копот и ремонтируемся");
    }

    @Override
    public void startMove() {
        System.out.println("Смотрим на дорогу и стартуем");
    }

    @Override
    public void endMove() {
        System.out.println("Дрифтом завершаем движение");
    }
}
