package bussnissLogic.edit;

public interface DrumDesignService {
	
	/**
	 * 删除一个架子鼓样式
	 * @param index
	 * @return
	 */
	boolean deleteSample(int index);
	
	/**
	 * 新建一个架子鼓样式
	 * @param index
	 * @return
	 */
	boolean newSamlpe(int index);
	
	/**
	 * 复制一个架子鼓样式
	 * @param index
	 * @return
	 */
	boolean copySamlpe(int index);
	
	/**
	 * 修改一个架子鼓样式
	 * @param index
	 * @return
	 */
	boolean modifySamlpe(int index);

}
