class Car {

    int yearModel;
    String make;
    int speed;

    public void accelerate () {
        this.speed += 5;
    }

    public void brake () {
        this.speed = (speed - 5) < 0 ? 0 : (speed - 5);
    }
}