package presentation.workspace;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import bussnissLogic.edit.DrumDesignService;

public class DrumDesignFrame extends JFrame{
	
	
//	private DrumDesignService bl;
//	
//	public DrumDesignFrame(){
//		this.bl = new DrumDesignServiceImpl();
//	}
	
	//这是一个用来自定义鼓点样式的窗口
	//三行，每行16个点
	//鼠标点击空白点，即变黑；否则反之
	
	/**
	 * button drop
	 * button cancel
	 * button save
	 */
	
	
	JButton dropButton;	
	JButton cancelButton;	
	JButton saveButton;	
	
	private void drop(){}
	private void save(){}	
	private void cancel(){}
	
	private void initButton(){
		//调整按钮样式
		dropButton = new JButton("丢弃该样式");
		cancelButton = new JButton("取消");
		saveButton = new JButton("保存");
		
		
		//添加按钮监听
		dropButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				drop();
			}
			
		});
		
		saveButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				save();
			}
			
		});
		
		cancelButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cancel();
			}
			
		});
	}

}
