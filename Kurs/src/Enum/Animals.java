package Enum;

public enum Animals {
	CAT("mrrr"), DOG("wrr");

	String sound; //property

	Animals(String sound) {//konstruktor
		this.sound = sound;
	}
	String poglaszcz(){
		return sound; }
}
