import javax.swing.*;
class LayoutNulo extends JFrame{
	public LayoutNulo() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setSize(800,650);
		
		setLocationRelativeTo(null);
		
		setTitle("T1_A1_Layout Nulo");
		
		
		JLabel txtTitulo = new  JLabel("The Classic Form includes all visible fields for" );
		JLabel txtTitulo2 = new JLabel("this list");
		txtTitulo.setBounds(10, 0, 300, 20);
		txtTitulo2.setBounds(10,0,300,45);
		add(txtTitulo);//A esta altura cordenada x el Preview
		add(txtTitulo2);
		
		JLabel form = new JLabel("Form options");
		form.setBounds(10,0,300,100);
		add(form);//A esta cordenada x el email address
		
		JLabel include = new JLabel("Include the following");
		include.setBounds(10,0,300,135);
		add(include);
		
		JCheckBox chectitle = new JCheckBox("a title for your form" );
		chectitle.setBounds(5, 75, 300, 20);
		add(chectitle);
		
		
	
		setVisible(true);
		
		

	}

}
public class PruebaVentana {

	public static void main(String[] args) {

		new LayoutNulo();
		

	}

}
