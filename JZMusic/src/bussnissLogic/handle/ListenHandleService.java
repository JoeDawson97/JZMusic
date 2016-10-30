package bussnissLogic.handle;

import java.util.ArrayList;

import entity.DrumPoint;
import entity.Track;

public interface ListenHandleService {
	
	/**
	 * 试听一个乐段
	 * @param tracks
	 * @param drum
	 * @param begin
	 * @param end
	 * @return
	 */
	public boolean listen(ArrayList<Track> tracks, DrumPoint drum, int begin,int end);
	
	/**
	 * 试听单个音轨的乐段
	 * @param tracks
	 * @param drum
	 * @param begin
	 * @param end
	 * @return
	 */
	public boolean listen(Track tracks, int begin,int end);
	
	/**
	 * 试听一段鼓点
	 * @param drum
	 * @param begin
	 * @param end
	 * @return
	 */
	public boolean listen(DrumPoint drum, int begin,int end);
	
	/**
	 * 试听多音轨（无鼓点）
	 * @param tracks
	 * @param begin
	 * @param end
	 * @return
	 */
	public boolean listen(ArrayList<Track> tracks,  int begin,int end);

}
