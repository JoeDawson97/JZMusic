package data;

import entity.Midi;

public interface MidiDataService {
	
	/**
	 * 从数据库中获得一个MIDI
	 * @param id
	 * @return
	 */
	Midi getMidi(int id);

}
