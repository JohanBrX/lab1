import java.awt.*;

public class Saab95 extends Car {


    public Saab95(){
        super(2, 125, Color.red, "Saab95");
        setTurboOff();
    }

    @Override
    public void incrementSpeed(double amount){
        if(getCurrentSpeed() + speedFactor() * amount <= getEnginePower()
                && getCurrentSpeed() + speedFactor() * amount > 0
                && speedFactor() * amount >= 0) {
            setCurrentSpeed(getCurrentSpeed() + speedFactor() * amount);
        }
    }
    @Override
    public void decrementSpeed(double amount){
        setCurrentSpeed(getCurrentSpeed() - speedFactor() * amount);
    }
    public double speedFactor(){
        double turbo = 1;
        if(getTurbo()){
            turbo = 1.3;
        }
        return getEnginePower() * 0.01 * turbo;
    }

}
