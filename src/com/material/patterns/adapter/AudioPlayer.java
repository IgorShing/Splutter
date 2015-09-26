package com.material.patterns.adapter;

public class AudioPlayer implements MediaPlayer {

	private MediaAdapter	mediaAdapter;

	@Override
	public void play(String audioType, String fileName) {

		if (audioType.equalsIgnoreCase("MP3")) {
			System.out.println("Playing mp3 file. Name: " + fileName);
		} else if (audioType.equalsIgnoreCase("MP4")
		        || audioType.equalsIgnoreCase("VLC")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		} else {
			System.out.println("Invalid media. " + audioType
					+ " format is not supported");
		}

	}

}
