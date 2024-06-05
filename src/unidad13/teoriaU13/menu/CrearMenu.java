package unidad13.teoriaU13.menu;



import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

class CrearMenu extends JFrame{
	JMenu menu, submenu;
	JMenuItem i1, i2, i3, i4, i5;

	CrearMenu() {
		
		setTitle("Ejemplo de menu");

		JMenuBar mb = new JMenuBar();

		menu = new JMenu("Menu");

		submenu = new JMenu("Sub Menu");
		i1 = new JMenuItem("Item 1");
		i2 = new JMenuItem("Item 2");
		i3 = new JMenuItem("Item 3");
		i4 = new JMenuItem("Item 4");
		i5 = new JMenuItem("Item 5");
		
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		
		submenu.add(i4);
		submenu.add(i5);
		
		menu.add(submenu);
		mb.add(menu);
		
		setJMenuBar(mb);
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String args[])

	{
		new CrearMenu();

	}
}