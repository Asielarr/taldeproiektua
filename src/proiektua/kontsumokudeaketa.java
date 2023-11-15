package proiektua;

import javax.swing.JOptionPane;

// TODO: Auto-generated Javadoc
/**
 * The Class kontsumokudeaketa.
 */
public class kontsumokudeaketa {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		autoa a1 = new autoa(200,14.6,100, 1.6);
		
		double km = 0;
		while(true) {
			try{
				String input = JOptionPane.showInputDialog("Sartu egindako kilometroak");
                if (input == null) {
               
                    break;
                }
                input = input.replace(",", ".");
                km = Double.parseDouble(input);
                if (km <= 0) {
                	JOptionPane.showInputDialog("Kilometro kopurua 0 baino handiago izan behar du");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
            	JOptionPane.showInputDialog("Karaktere numeriko bat sartu behar da(0 baino handiagoa)");
            }
		}
		a1.setkm(km);
		
		//Egindako kilometro kopurua eskatzen du lehio bat irekiz, eta honek errorerik sortzen ez duela egiaztatzen du(0 baino handiagoa eta letrarik ez)
		
		double litroak = 0;
		
		while(true) {
			try{
				String input = JOptionPane.showInputDialog("Sartu kontsumitutako litroak");
                if (input == null) {
               
                    break;
                }
                input = input.replace(",", ".");


                litroak = Double.parseDouble(input);
                if (litroak <= 0) {
                	JOptionPane.showInputDialog("Kontsumitutako litroak 0 baino gehiago izan behar du");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
            	JOptionPane.showInputDialog("Karaktere numeriko bat sartu behar da(0 baino handiagoa)");
            }
		}
		a1.setlitro(litroak);
		
		//Kontsumitutako litroak eskatzen ditu lehio bat irekiz, eta honek errorerik sortzen ez duela egiaztatzen du(0 baino handiagoa eta letrarik ez)
		
		
		int abiadura = 0;
		
		while(true) {
			try{
				String input = JOptionPane.showInputDialog("Sartu joandako batazbesteko abiadura");
                if (input == null) {
               
                    break;
                }

                abiadura = Integer.parseInt(input);
                if (abiadura <= 0) {
                	JOptionPane.showInputDialog("0 km/h baino gehiagoetara joan behar da");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
            	JOptionPane.showInputDialog("Karaktere numeriko bat sartu behar da(0 baino handiagoa)");
            }
		}
		a1.setmedia(abiadura);
		
		//Joandako abiadura media eskatzen du lehio bat irekiz, eta honek errorerik sortzen ez duela egiaztatzen du(0 baino handiagoa eta letrarik ez)
		double gasolina = 0;
		
		while(true) {
			try{
				String input = JOptionPane.showInputDialog("Sartu gaur egungo gasolina prezioa(litroko)");
                if (input == null) {
               
                    break;
                }
                
                input = input.replace(",", ".");


                gasolina = Double.parseDouble(input);
                if (gasolina <= 0) {
                	JOptionPane.showInputDialog("0€ baino gehiago balio behar du");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
            	JOptionPane.showInputDialog("Karaktere numeriko bat sartu behar da(0 baino handiagoa)");
            }
		}
		a1.setgas(gasolina);
		
		//Gaur egungo gasolina prezioa eskatzen du lehio bat irekiz, eta honek errorerik sortzen ez duela egiaztatzen du(0 baino handiagoa eta letrarik ez)
		
		StringBuilder erantzuna = new StringBuilder();
		erantzuna.append(a1.getdenbora() + "\n");
		erantzuna.append(String.format("%.2f", a1.getkontsumoa()) + " litro 100 km-ro\n");
		erantzuna.append(String.format("%.2f", a1.getkontsumoaeuro()) + " € 100 km-ro");
		JOptionPane.showMessageDialog(null, erantzuna);
		
		//Metodo bakoitzaren erantzuna bistaratzen da lehio berri batean

	}

}
