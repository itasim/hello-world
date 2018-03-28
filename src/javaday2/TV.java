package javaday2;

public interface TV {
	public final int MIN_VOLUME = 0;
	public final int MAX_VOLUME = 100;
	
	
	public void turnOn();
	public void turnOff();
	public void chagngeVolume(int volume);
	public void changeChannel(int channel);
	
}
