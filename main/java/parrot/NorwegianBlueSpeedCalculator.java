package parrot;

public class NorwegianBlueSpeedCalculator implements SpeedCalculator{
	public double calculateSpeed(Parrot parrot) {
		return (parrot.isNailed) ? 0 : Math.min(24.0, parrot.voltage*_BASESPEED);
	}
}
