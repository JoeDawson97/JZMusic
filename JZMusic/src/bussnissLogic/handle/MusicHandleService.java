package bussnissLogic.handle;

import entity.Note;
import entity.Shearplate;

public interface MusicHandleService {
	
	/**
	 * 加入一段空间
	 * @param index
	 * @return
	 */
	public boolean addRoom(int index);
	
	/**
	 * 新写入一段音符
	 * @param index
	 * @param note
	 * @return
	 */
	public boolean addNote(int index,Note note);
	
	/**
	 * 删除一段
	 * @param begin
	 * @param end
	 * @return
	 */
	public boolean delete(int begin, int end);
	
	/**
	 * 删除单个音符
	 * @param index
	 * @return
	 */
	public boolean deleteSingle(int index);
	
	/**
	 * 移动
	 * @param plate
	 * @param destination
	 * @return
	 */
	public boolean move(Shearplate plate,int destination);
	
	
	/**
	 * 复制
	 * @param plate
	 * @param destination
	 * @return
	 */
	public boolean copy(Shearplate plate,int destination);	

}
