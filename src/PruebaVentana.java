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
		
		JLabel preview = new JLabel("Preview");
		preview.setBounds(320, 0, 300, 25);
		add(preview);
		
		
		
		
		
		JLabel form = new JLabel("Form options");
		form.setBounds(10,0,300,100);
		add(form);//A esta cordenada x el email address
		
		JLabel include = new JLabel("Include the following");
		include.setBounds(10,0,300,135);
		include.setFont(null);
		add(include);
		
		JCheckBox chectitle = new JCheckBox("  a title for your form" );
		chectitle.setBounds(5, 78, 300, 20);
		chectitle.setFont(null);
		add(chectitle);
		
		JTextArea areatxt = new JTextArea("Suscribe to your mailing list ",3,3);
		areatxt.setBounds(10, 100, 265,20);
		add(areatxt);
		
		ButtonGroup bg = new ButtonGroup();
		JRadioButton only = new JRadioButton(" only required fields");
		only.setBounds(5, 150, 300, 20);
		only.setFont(null);
		bg.add(only);
		add(only);
		JRadioButton all = new JRadioButton(" all fields");
		all.setBounds(5, 170, 300, 20);
		all.setFont(null);
		bg.add(all);
		add(all);
		
		JLabel edit = new JLabel("  (edit required fields in the form builder)");
		edit.setBounds(18, 185, 300, 20);
		edit.setFont(null);
		add(edit);
		
		
		JCheckBox interest = new JCheckBox(" interest group fields");
		interest.setBounds(5, 250, 300, 20);
		interest.setFont(null);
		add(interest);
		
		JCheckBox required = new JCheckBox(" required field indicators");
		required.setBounds(5, 270, 300, 20);
		required.setFont(null);
		add(required);
		
		JLabel set = new JLabel("Set form Width");
		set.setBounds(10, 310, 300, 20);
		set.setFont(null);
		add(set);
		
		JTextArea width = new JTextArea();
		width.setBounds(10, 330, 265, 20);
		add(width);
		
		
		JLabel enhance = new JLabel("Enhance your form");
		enhance.setBounds(10, 370, 300, 20);
		enhance.setFont(null);
		add(enhance);
		
		JCheckBox evil = new JCheckBox(" enable evil popup mode");
		evil.setBounds(10, 390, 300, 20);
		evil.setFont(null);
		add(evil);
		
		JCheckBox javaS = new JCheckBox(" disable all JavaScript");
		javaS.setBounds(10, 410, 300, 20);
		javaS.setFont(null);
		add(javaS);
		
		JCheckBox link = new JCheckBox(" include archive link");
		link.setBounds(10, 430, 300, 20);
		link.setFont(null);
		add(link);
		
		JCheckBox monkey = new JCheckBox(" include MonkeyRewards link");
		monkey.setBounds(10, 450, 300, 20);
		monkey.setFont(null);
		add(monkey);
		setVisible(true);
		
		

	}

}
public class PruebaVentana {

	public static void main(String[] args) {

		new LayoutNulo();
		

	}

}
