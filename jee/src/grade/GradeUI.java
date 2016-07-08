package grade;

import java.awt.FlowLayout;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

/**
 *@date    :2016. 7. 6.
 *@author  :최인철
 *@file    : GradeUI.java
 *@story  :
 */
public class GradeUI extends JFrame {
	
	private static final long serialVersionUID = 1L;
JPanel wrapper_panel,flow_panel;
JList<String> itemList;

	/**
	 * 
	 */
	public GradeUI() {
		// TODO Auto-generated constructor stub
	
	this.setLayout1();
	
	this.setResizable(false);//this abort resize
	this.setLocationRelativeTo(null);//this load at center of screen
	this.setSize(600, 600);//this set size width, height
	this.setVisible(true);//this set visible mode (false - non-visible)
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x btn of this is end of this
}
	private void setLayout1()
	{
		wrapper_panel = new JPanel();
		GradeService service = GradeServiceImpl.getInstane();
		flow_panel = new JPanel(new FlowLayout());
		List<?> t =service.list();
		System.out.println(t);
		System.out.println("성적리스트"+t);
		itemList = new JList(t.toArray());
		itemList.setSelectedIndex(0);
		itemList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//		flow_panel.add(itemList);
//		wrapper_panel.add(flow_panel,"center");
		wrapper_panel.add(itemList);
		this.add(wrapper_panel);
		
	}
	
	/**
	 * 
	 */
	private void setLayout() {
		// TODO Auto-generated method stub
		
	}
}