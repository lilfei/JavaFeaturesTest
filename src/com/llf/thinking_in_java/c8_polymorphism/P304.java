package com.llf.thinking_in_java.c8_polymorphism;

import static com.llf.print.Print.*;

class Actor {
	public void act() {
	}
}

class HappyActor extends Actor {
	public void act() {
		print("HappyActor");
	}
}

class SadActor extends Actor {
	public void act() {
		print("SadActor");
	}
}

class Stage {
	private Actor actor = new HappyActor();

	public void change() {
		actor = new SadActor();
	}

	public void performPlay() {
		actor.act();
	}
}

public class P304 {

	public static void main(String[] args) {

		Stage stage = new Stage();
		stage.performPlay();
		stage.change();
		stage.performPlay();
	}

}
