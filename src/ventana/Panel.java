package ventana;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Panel extends JFrame
{
	private Border borde;// = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED); 
	public Container container = getContentPane() ; //new Container();
	public Panel(){
		super("->>>>>>>>Ventana<<<<<<<<<<<<<-----");
		setLayout(new BorderLayout());
		container.setLayout(new BorderLayout());		
		borde  = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED); 

		container.add(crearNorte(),BorderLayout.NORTH);
//		container.add(crearMatriz2x1(),BorderLayout.SOUTH);
//		
		setSize(500,600);
		setVisible(true);
		
	}
	
	public static void main(String[] args)
	{
		Panel n = new Panel();
	}
//	private void crearMatriz2x1()
//	{	
//		JPanel panel =  new JPanel(new BorderLayout());
//		panel.add( new Label("menu"),BorderLayout.EAST);
//		return panel;
//	}
	private JPanel crearNorte()
	{
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT)); 
		
		TitledBorder titulo =BorderFactory.createTitledBorder(borde,"Titulo");
		
		
		panel.add(new Label("titulo--->"),BorderLayout.EAST);
		Button bTitulo = crearBotonDeTitulo();
		panel.add(bTitulo,FlowLayout.RIGHT);
		TextField textoDeTitulo = crearCampoDeTitulo();
		panel.add(textoDeTitulo,FlowLayout.CENTER);
		return panel;
	}
	private TextField crearCampoDeTitulo()
	{
		return new TextField(5);
	}
	
	private Button crearBotonDeTitulo()
	{
		Button boton = new Button();
		boton.addActionListener(new CuandoPresionaElTitulo());
		return boton;
	}
//	private JPanel crearMatriz2x1()
//	{
//		JPanel panel = new JPanel(new GridBagLayout(FlowLayout.LEFT));
//		
//		return panel;
//	}


}
