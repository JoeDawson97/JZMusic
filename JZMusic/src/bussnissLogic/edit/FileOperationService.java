package bussnissLogic.edit;

public interface FileOperationService {
	
	/**
	 * 切换词曲编辑面板
	 * @return
	 */
	public boolean switchPanel();
	
	/**
	 * 导出简谱和伴奏
	 * @param name
	 * @return
	 */
	public boolean export(String name);
	
	/**
	 * 保存
	 * @param name
	 * @return
	 */
	public boolean save(String name);

}
