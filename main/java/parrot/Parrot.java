package parrot;

public class Parrot {

	ParrotTypeEnum type;
    int numberOfCoconuts = 0;
    double voltage;
    boolean isNailed;


    public Parrot(ParrotTypeEnum _type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.type = _type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public double getSpeed() {
    	SpeedCalculator calculator = null;
    	calculator = createSpeedCalculator();
        return calculator.calculateSpeed(this);
    }
    
    private SpeedCalculator createSpeedCalculator() {
    	
    	switch(type) {
        case EUROPEAN:
        	return new EuropeanSpeedCalculator();
        case AFRICAN:
        	return new AfricanSpeedCalculator();
        case NORWEGIAN_BLUE:
        	return new NorwegianBlueSpeedCalculator();
    	}
    	throw new RuntimeException("Should be unreachable");
    	
    }


}
