package parrot;

public class Parrot {

    private ParrotTypeEnum type;
    private int numberOfCoconuts = 0;
    private double voltage;
    private boolean isNailed;


    public Parrot(ParrotTypeEnum _type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.type = _type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public double getSpeed() {
    	SpeedCalculator calculator = createSpeedCalculator();
        return calculateSpeed(calculator);
    }

	private double calculateSpeed(SpeedCalculator calculator) {
		switch(type) {
            case EUROPEAN:
                return calculator.calculateSpeed();
            case AFRICAN:
                return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
            case NORWEGIAN_BLUE:
                return (isNailed) ? 0 : getBaseSpeed(voltage);
        }
        throw new RuntimeException("Should be unreachable");
	}

    private double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage*getBaseSpeed());
    }

    private double getLoadFactor() {
        return 9.0;
    }

    private double getBaseSpeed() {
        return 12.0;
    }
    
    private SpeedCalculator createSpeedCalculator() {
    	SpeedCalculator calculator = null;
    	switch(type) {
        case EUROPEAN:
        	calculator = new EuropeanSpeedCalculator();
        case AFRICAN:
        	calculator = new EuropeanSpeedCalculator();
        case NORWEGIAN_BLUE:
        	calculator = new EuropeanSpeedCalculator();
    	}
    	return calculator;
    }


}
