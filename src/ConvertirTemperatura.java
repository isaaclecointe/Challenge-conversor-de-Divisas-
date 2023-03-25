import javax.swing.JOptionPane;

public class ConvertirTemperatura  {
	
	
	public static void FuncionTemperatura(double tInput) {
		String opcion = (String)JOptionPane.showInputDialog(null, "seleccione la unidad de temperatura que desea convertir",
				"Temperatura", JOptionPane.PLAIN_MESSAGE,null, new Object[] {"Celsius a Farenheit" , "Celsius a Kelvin",
						"Fahrenheit a Celsius","Fahrenheit a Kelvin",  "Kelvin a Celsius", "Kelvin a Fahrenheit"
						},"Selecciona");
		if (opcion == null) {
			return;
		}
				
		switch(opcion) {		
		case "Celsius a Farenheit" :
			double fahrenheit = celsiusAFahrenheit(tInput);
			JOptionPane.showMessageDialog(null, "Tu conversion es " + fahrenheit + " Fahrenheit");
			break;
		case  "Fahrenheit a Celsius":
			double celsius = fahrenheitACelsius(tInput);
			JOptionPane.showMessageDialog(null, "Tu conversion es " + celsius + " Celsius");
			break;
		case "Celsius a Kelvin" :
			double kelvin1 = celsiusAKelvin (tInput);
			JOptionPane.showMessageDialog(null, "Tu conversion es "+ kelvin1 + "Kelvin");
			break;
		case "Kelvin a Celsius":
			double celsius2 =  kelvinACelsius (tInput);
			JOptionPane.showMessageDialog(null, "Tu conversion es "+ celsius2 + "Kelvin");
			break;
		case "Fahrenheit a Kelvin":
			double kelvin2 =  fahrenheitAKelvin(tInput);
			JOptionPane.showMessageDialog(null, "Tu conversion es " + kelvin2 + " Kelvin");
			break;
		case "Kelvin a Fahrenheit":
			double fahrenheit2 = kelvinAFahrenheit(tInput);
			JOptionPane.showMessageDialog(null, "Tu conversion es " + fahrenheit2 + " Fahrenheit");
			break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion invalida ");
				break;
		}
	}
	
	public static double celsiusAFahrenheit(double celsius) {
		double fahrenheit = (celsius * 9/5) + 32;
		return Math.round(fahrenheit * 100.0)/ 100.0;
	}
	
	public static double fahrenheitACelsius(double farenheit) {
		 double celsius =  (farenheit -32)* 5/9;
		return Math.round(celsius * 100.0)/100.0;
		
	}
	
	public static double celsiusAKelvin(double celsius) {
		double kelvin =  celsius + 273.15;
         return Math.round(kelvin * 100.0)/100.0;
	}
	
	public static double kelvinACelsius(double kelvin) {
		double celsius = kelvin - 273.15;
		return Math.round(celsius * 100.0)/100.0;
	}
	
	public static double fahrenheitAKelvin(double farenheit) {
		double kelvin = (farenheit -32) * 5/9 + 273.15;
		return Math.round(kelvin * 100.0)/100.0;
	}
	
	public static double kelvinAFahrenheit(double kelvin) {
		double fahrenheit = (kelvin -273.15)* 9/5 +32;
		return Math.round(fahrenheit * 100.0)/100.0;
	}


}