package data;

import java.util.ArrayList;

import entity.DrumPattern;

public interface DrumDataService {
	
	/**
	 * 插入一个自行定义样式
	 * @param pattern
	 * @return
	 */
	boolean insertDrumSample(DrumPattern pattern);
	
	/**
	 * 删除一个已存在的样式
	 * @param id
	 * @return
	 */
	boolean deleteDrumSample(int id);
	
	/**
	 * 修改一个已存在的样式
	 * @param id
	 * @param pattern
	 * @return
	 */
	boolean modifyDrumSample(int id,DrumPattern pattern);
	
	/**
	 * 根据id获取单个样式
	 * @param id
	 * @return
	 */
	DrumPattern getDrumSample(int id);
	
	/**
	 * 获取所有样式
	 * @return
	 */
	ArrayList<DrumPattern> getAllDrumPattern();
	
	/**
	 * 获取最大的id
	 * @return
	 */
	int getLastIndex();

}
