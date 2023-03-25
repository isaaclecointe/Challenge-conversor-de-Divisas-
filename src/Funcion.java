import javax.swing.JOptionPane;

public class Funcion  {
	
	
	ConvertirMonedas monedas = new ConvertirMonedas();
	
	//ConvertirMonedasAQuetzales Quetzales = new ConvertirMonedasAQuetzales(); 

	public void  ConvertirMonedas(double MInput ) {
		String opcion = (String) JOptionPane.showInputDialog(null, "Selecione el tipo de moneda a la que desea convertir", "Moneda",
				JOptionPane.PLAIN_MESSAGE,null, new Object[] {"de Quetzales a Dolares","de Dolares a Quetzales","de Quetzales a Euros","de Euros a Quetzales",
						"de Quetzales a Libras esterlinas","de Libras esterlinas a Quetzales",
						 "de Quetzales a Yen Japones","de Yen Japones a Quetzales ","de Quetzales a Won sul- coreano", "de Won sul-coreano a Quetzales"
				},"Selecciona");
		
		       if(opcion == null) {
		    	   return;
		       }
	
                     
		switch (opcion) {
		case  "de Quetzales a Dolares":
			ConvertirMonedas.ConvertirQuetzalesADolares(MInput);                                                                      //   8.25 
			break;
		case "de Dolares a Quetzales":
			ConvertirMonedas.ConvertirDolaresAQuetzales(MInput);
			break;
		case "de Quetzales a Euros":
			ConvertirMonedas.ConvertirQuetzalesAEuros(MInput);                                                                         //  9.41 
			break;
		case "de Euros a Quetzales":
			ConvertirMonedas.ConvertirEurosAQuetzales(MInput);
			break;
		case"de Quetzales a Libras esterlinas" :
			ConvertirMonedas.ConvertirQuetzalesALibras(MInput);                
			break;
		case "de Libras esterlinas a Quetzales":
			ConvertirMonedas.ConvertirLibrasAQuetzales(MInput);
			break;
		case "de Quetzales a Yen Japones":
			ConvertirMonedas.ConvertirQuetzalesAYenJapones(MInput);                                                                          //   0.0059 
			break;
		case "de Yen Japones a Quetzales ":
			ConvertirMonedas.ConvertirYenJaponesAQuetzales(MInput);
			break;
		case"de Quetzales a Won sul- coreano" :
			ConvertirMonedas.ConvertirQuetzalesAWonSulCoreano(MInput);                                                                         // 0.0060 
			break;
		case  "de Won sul-coreano a Quetzales":
			ConvertirMonedas.ConvertirWonSulCoreanoAQuetzales(MInput);
			break;
		default:
			
	}
	}
}

