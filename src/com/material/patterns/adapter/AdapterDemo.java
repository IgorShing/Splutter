package com.material.patterns.adapter;

import com.material.logic.Demo;

public class AdapterDemo implements Demo {

	public static final String	NAME	= "Adapter";

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public void run() {
		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "far far away.vlc");
		audioPlayer.play("avi", "mind me.avi");

	}

}
