package bussnissLogic.home;

import entity.Song;

public interface HomeService {
	
	/**
	 * 新建文件
	 * @return
	 */
	public boolean newFile();
	
	/**
	 * 读取存档
	 * @param name
	 * @return
	 */
	public Song readFile(String name);

}
