import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URISyntaxException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*- Convertir de la moneda de tu país a Dólar
       - Convertir de la moneda de tu país  a Euros
       - Convertir de la moneda de tu país  a Libras Esterlinas
       - Convertir de la moneda de tu país  a Yen Japonés
       - Convertir de la moneda de tu país  a Won sul-coreano
       
       - Convertir de Dólar a la moneda de tu país
       - Convertir de Euros a la moneda de tu país
       - Convertir de Libras Esterlinas a la moneda de tu país
       - Convertir de Yen Japonés a la moneda de tu país
       - Convertir de Won sul-coreano a la moneda de tu país
       
       Como desafío extra te animamos a que dejes fluir tu creatividad, 
       si puedo convertir divisas, ¿tal vez pueda añadir a mi programa 
       otros tipos de conversiones como temperatura por ejemplo? */

public class Main implements ActionListener {
	//Declaracion de objetos de GUI
	private JTextField textField;
	private JLabel resultadoLbl;
	private JFrame frame;
	private JButton convertirBtn;
	private JButton intercambiarBtn;
	private JPanel panel;
	private JComboBox comboBoxIn;
	private JComboBox comboBoxOut;

	public Main() {
		frame = new JFrame();
		
		textField = new JTextField("10");
		comboBoxIn = new JComboBox(Divisas.values());
		
		convertirBtn = new JButton("Convertir");
		convertirBtn.addActionListener(this);

		intercambiarBtn = new JButton("Intercambiar");
		intercambiarBtn.addActionListener(this);
		
		resultadoLbl = new JLabel("10");
		comboBoxOut = new JComboBox(Divisas.values());
		

		

		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		panel.setLayout(new GridLayout(3, 2, 10, 10));
		panel.add(textField);
		panel.add(comboBoxIn);
		panel.add(convertirBtn);
		panel.add(intercambiarBtn);
		panel.add(resultadoLbl);
		panel.add(comboBoxOut);

		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(640, 400);
		frame.setTitle("Conversor");
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);

	}

	public static void main(String[] args) {
		try {
			new ApiConnection().refreshRates();
		} catch (IOException | InterruptedException | URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new Main();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		BigDecimal cantidadIn=new BigDecimal(0.0);
		try {
			cantidadIn=new BigDecimal(textField.getText());
		}
		catch(NumberFormatException ex){
			JOptionPane.showMessageDialog(null, "Solo ingrese numeros");
		}
		String cantidadOut;
		
		int indexDivisaIn=comboBoxIn.getSelectedIndex();
		int indexDivisaOut=comboBoxOut.getSelectedIndex();
		int indexTmp;
		
		String divisaIn=Divisas.values()[indexDivisaIn].name();
		String divisaOut=Divisas.values()[indexDivisaOut].name();
		
		Moneda monIn = new Moneda(cantidadIn,divisaIn);
		Moneda monOut = new Moneda();
		
		
		if (e.getSource() == convertirBtn) {
			
			monOut=monIn.Convertir(divisaOut);
			cantidadOut=monOut.getCantidad().toString();
			resultadoLbl.setText(cantidadOut);
			
		} else if(e.getSource() == intercambiarBtn) {
			indexTmp=indexDivisaOut;
			indexDivisaOut=indexDivisaIn;
			indexDivisaIn=indexTmp;
			comboBoxIn.setSelectedIndex(indexDivisaIn);
			comboBoxOut.setSelectedIndex(indexDivisaOut);
		}
	}
	
}
