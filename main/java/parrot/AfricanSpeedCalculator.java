package parrot;

public class AfricanSpeedCalculator implements SpeedCalculator {
	public double calculateSpeed(Parrot parrot) {
		return Math.max(0, _BASESPEED - _LOADFACTOR * parrot.numberOfCoconuts);
	}
}
