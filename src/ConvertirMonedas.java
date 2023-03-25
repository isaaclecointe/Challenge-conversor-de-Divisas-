import javax.swing.JOptionPane;

public class ConvertirMonedas {

	static void ConvertirQuetzalesADolares(double valor) {
		double MonedaDolar = valor / 7.90;
		MonedaDolar = (double) Math.round(MonedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "   Tienes$" + MonedaDolar + " Dolares  ");
	}
	static void ConvertirQuetzalesAEuros(double valor) {
		double MonedaEuro = valor / 8.25;
		MonedaEuro  = (double) Math.round(MonedaEuro  * 100d) / 100;
		JOptionPane.showMessageDialog(null, "   Tienes$" + MonedaEuro  + "Euros ");
	}
	static void ConvertirQuetzalesALibras(double valor) {
		double MonedaLibras = valor /9.41;
		MonedaLibras  = (double) Math.round(MonedaLibras * 100d) / 100;
		JOptionPane.showMessageDialog(null, "   Tienes$" + MonedaLibras  + " Libras Esterlinas ");
	}
	static void ConvertirQuetzalesAYenJapones(double valor) {
		double MonedaYenJapones = valor /0.0059;
		MonedaYenJapones   = (double) Math.round(MonedaYenJapones  * 100d) / 100;
		JOptionPane.showMessageDialog(null, "   Tienes$" + MonedaYenJapones   + " Yen Japones ");
	}
	static void ConvertirQuetzalesAWonSulCoreano(double valor) {
		double MonedaWonSulCoreano = valor /0.0060;
		MonedaWonSulCoreano   = (double) Math.round(MonedaWonSulCoreano  * 100d) / 100;
		JOptionPane.showMessageDialog(null, "   Tienes$" + MonedaWonSulCoreano   + " Won sul-coreano ");
	}
	
	// metodo inverso de Dolares a Quetzales por ejemplo
	
	static void ConvertirDolaresAQuetzales(double valor) {
		double MonedaQuetzal = valor * 7.90;
		MonedaQuetzal = (double)Math.round(MonedaQuetzal * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tiene Q" + MonedaQuetzal);
	}
	static void ConvertirEurosAQuetzales(double valor) {
		double MonedaQuetzal = valor * 8.25;
		MonedaQuetzal = (double)Math.round(MonedaQuetzal * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tiene Q" + MonedaQuetzal);
	}
	static void ConvertirLibrasAQuetzales(double valor) {
		double MonedaQuetzal = valor * 9.41;
		MonedaQuetzal = (double)Math.round(MonedaQuetzal * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tiene Q" + MonedaQuetzal);
	}
	static void ConvertirYenJaponesAQuetzales(double valor) {
		double MonedaQuetzal = valor * 0.0059;
		MonedaQuetzal = (double)Math.round(MonedaQuetzal * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tiene Q" + MonedaQuetzal);
	}
	static void ConvertirWonSulCoreanoAQuetzales(double valor) {
		double MonedaQuetzal = valor * 0.0060;
		MonedaQuetzal = (double)Math.round(MonedaQuetzal * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tiene Q" + MonedaQuetzal);
	}
}