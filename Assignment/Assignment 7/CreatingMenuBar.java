import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import javax.swing.JOptionPane;
import java.awt.event.*;
class CreatingMenuBar
{
	JMenu menu1, menu2, menu3, menu4, submenu;
	JMenuItem item1,item2,item3,item4,item5,item6;
	public CreatingMenuBar()
	{
		JFrame frame = new JFrame("Menu Bar Prototype");
		JMenuBar menuBar = new JMenuBar();
		JPopupMenu popupMenu = new JPopupMenu();

		menu1 = new JMenu("File");
		menu2 = new JMenu("Edit");
		menu3 = new JMenu("View");
		menu4 = new JMenu("Open");
		submenu = new JMenu("New");

		item1 = new JMenuItem("Save");
		item2 = new JMenuItem("Close");
		item3 = new JMenuItem("Text");
		item4 = new JMenuItem("Folder");
		item5 = new JMenuItem("Window");
		item6 = new JMenuItem("Panel");

		submenu.add(item3);
		submenu.add(item4);

		menu1.add(submenu);
		menu1.add(item1);
		menu1.add(item2);
		
		menu3.add(item5);
		menu3.add(item6);

		menuBar.add(menu1);
		menuBar.add(menu2);
		menuBar.add(menu3);
		menuBar.add(menu4);

		/*
		popupMenu.add(popMenu1);
		popupMenu.add(popMenu2);
		popupMenu.add(popMenu3);

		frame.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				popupMenu.show(frame,e.getX(),e.getY());
			}
		});
		*/

		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e)
			{
				int a = JOptionPane.showConfirmDialog(frame,"Are you sure you want to open?");
				if(a == JOptionPane.YES_OPTION)
				{
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
			}
		});

		frame.add(popupMenu);
		frame.setJMenuBar(menuBar);
		frame.setSize(500,450);
		frame.setVisible(true);
		frame.setLayout(null);
	}
	public static void main(String[] args)
	{
		new CreatingMenuBar();
	}
}