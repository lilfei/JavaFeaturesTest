package com.llf.thinking_in_java.c10_inner_class.green_house;

public class GreenHouseController {

	public static void main(String[] args) {
		args = new String[] { "5000" };  //为了只跑一遍
		GreenHouseControls gc = new GreenHouseControls();
		gc.addEvent(gc.new Bell(900));
		Event[] eventList = { gc.new ThermostatNight(0), gc.new LightOn(200), gc.new LightOff(400), gc.new WaterOn(600), gc.new WaterOff(800), gc.new ThermostatDay(1400) };
		gc.addEvent(gc.new Restart(2000, eventList));
		if (args.length == 1) {
			gc.addEvent(new GreenHouseControls.Terminate(new Integer(args[0])));
		}
		gc.run();
	}

}
