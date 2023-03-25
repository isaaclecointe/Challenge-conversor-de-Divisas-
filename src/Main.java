import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		Funcion monedas = new Funcion();
		boolean flag = true;
		while (flag) {

			Object opcionesObj = JOptionPane.showInputDialog(null,"Seleccione el tipo de conversor que desea utilizar", "Conversores ",
				JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Conversor de Monedas ", "Conversor de Temperaturas"},
				"selecciona");
		
				
			if(opcionesObj != null) {
               String opciones = opcionesObj.toString();
			switch (opciones) {
			case "Conversor de Monedas ":

				String input = JOptionPane.showInputDialog("Ingrese la cantidad que desea convertir: ");
				if (input == null) { // por si se presiona el boton cancelar
					flag = false;
					JOptionPane.showMessageDialog(null, "PROGRAMA CERRADO");
				} else if (ValidarNumero(input)) {
					double MInput = Double.parseDouble(input);
					monedas.ConvertirMonedas(MInput);

					int respuesta = JOptionPane.showConfirmDialog(null, "Desea realizar otra conversion");
					if (JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Selecciona opcion afirmativa");
					} else {
						flag = false;
						JOptionPane.showMessageDialog(null, "PROGRAMA CERRADO");
					}
				} else {
					JOptionPane.showMessageDialog(null, "valor invalido");
				}

				break;

			case "Conversor de Temperaturas":
				ConvertirTemperatura temperatura = new ConvertirTemperatura();
				String inputTemperatura = JOptionPane.showInputDialog(null,
						"Ingrese la temperatura que desea convertir");
				if (inputTemperatura == null) {
					flag = false;
					JOptionPane.showMessageDialog(null, "PROGRAMA CERRADO");
				}	else if (ValidarNumero(inputTemperatura)) {
						double TInput = Double.parseDouble(inputTemperatura);
						temperatura.FuncionTemperatura(TInput);

						int respuesta = JOptionPane.showConfirmDialog(null, "Desea realizar otra conversion?");
						if (JOptionPane.OK_OPTION == respuesta) {

						} else {
							flag = false;
							JOptionPane.showMessageDialog(null, "PROGRAMA CERRADO");
						}
					} else {
						JOptionPane.showMessageDialog(null, "Valor Invalido");
					}
				break;
			case "Salir" :
				flag = false;
				JOptionPane.showMessageDialog(null, "PROGRAMA CERRADO");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Valor Invalido");
			     break;

			}
			}else {
				flag = false;
				JOptionPane.showMessageDialog(null, "PROGRAMA CERRADO");
			}

		}
	}

	private static boolean ValidarNumero(String input) {
		try {
			double x = Double.parseDouble(input);
			if (x >= 0 || x < 0)
				;
			return true;
		} catch (NumberFormatException e) {

		}
		return false;
	}

}
