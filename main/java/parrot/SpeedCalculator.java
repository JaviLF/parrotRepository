package parrot;

public interface SpeedCalculator {
	double _BASESPEED = 12.0;
	double _LOADFACTOR = 9.0;
	public double calculateSpeed(Parrot parrot);
}