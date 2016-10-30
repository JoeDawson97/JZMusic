package presentation.workspace;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MelodyView{
	
	//这是一个编曲的Frame
	
	private String filename;
	private JFrame frame;
	
	private JPanel drumTrackPanel;
	private JPanel editPanel;
	private JPanel instructionPanel;
	private JPanel instrumentPanel; 
	private JPanel trackPanel; 
	
	
	/**
	 * 新建曲谱
	 */
	
	public void construction(JFrame mainFrame){
		this.frame = new JFrame();
		this.frame = mainFrame;
		initDrumView();
		initEditView();
		initInstrumentView();
		
		drumTrackPanel = new DrumTrackPanel();
		editPanel = new EditPanel();
		instructionPanel = new InstructionPanel();
		instrumentPanel = new InstrumentPanel();
		trackPanel = new TrackPanel();
		
		frame.add(drumTrackPanel);
		frame.add(editPanel);
		frame.add(instructionPanel);
		frame.add(instrumentPanel);
		frame.add(trackPanel);
	}
	
	public MelodyView(JFrame mainFrame){		
		construction(mainFrame);
		this.filename = null;
	}
	
	/**
	 * construction
	 * 读取已存在的曲谱
	 * @param filename
	 */
	public MelodyView(String filename,JFrame mainFrame){
		
		construction(mainFrame);
		this.filename = filename;
	}
	
	/**
	 * 初始化架子鼓编辑面板
	 */
	private void initDrumView(){
		
	}
	
	/**
	 * 初始化音色控制面板
	 */
	private void initInstrumentView(){
		
	}
	
	/**
	 * 初始化主编辑面板
	 */
	private void initEditView(){
		//初始化Switch按钮
		//初始化命令输入框
		//初始化音轨框
		//初始化主面板
	}

}
