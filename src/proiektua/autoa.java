package proiektua;

// TODO: Auto-generated Javadoc
/**
 * The Class autoa.
 */
public class autoa {
	
	/** The km. */
	private double km;
	
	/** The litro. */
	private double litro;
	
	/** The amedia. */
	private int amedia;
	
	/** The pgas. */
	private double pgas;
	
	
	/**
	 * Instantiates a new autoa.
	 *
	 * @param km the km
	 * @param litro the litro
	 * @param amedia the amedia
	 * @param pgas the pgas
	 */
	public autoa(double km, double litro, int amedia,double pgas) {
		setkm(km);
		setlitro(litro);
		setmedia(amedia);
		setgas(pgas);
	}
	
	/**
	 * Sets the km.
	 *
	 * @param balioa the new km
	 */
	public void setkm(double balioa)
	{
		this.km = balioa;
	}
	
	/**
	 * Sets the litro.
	 *
	 * @param balioa the new litro
	 */
	public void setlitro(double balioa)
	{
		this.litro = balioa;
	}
	
	/**
	 * Sets the media.
	 *
	 * @param balioa the new media
	 */
	public void setmedia(int balioa)
	{
		this.amedia = balioa;
	}
	
	/**
	 * Sets the gas.
	 *
	 * @param balioa the new gas
	 */
	public void setgas(double balioa)
	{
		this.pgas = balioa;
	}
	
	/**
	 * Gets the denbora.
	 *
	 * @return the denbora
	 */
	public String getdenbora()
	{
		double denboraOrdutan = km / amedia;

		 int orduak = (int) denboraOrdutan;

		 int minutuak = (int) ((denboraOrdutan - orduak) * 60);

		 if (minutuak == 0) {

			 return orduak + " ordu";
		 }

		 else {

			 return orduak + " ordu eta " + minutuak + " minutu";

		 }
	}
	
	/**
	 * Gets the kontsumoa.
	 *
	 * @return the kontsumoa
	 */
	public double getkontsumoa()
	{
		return litro*100/km;
	}
	
	/**
	 * Gets the kontsumoaeuro.
	 *
	 * @return the kontsumoaeuro
	 */
	public double getkontsumoaeuro()
	{
		return getkontsumoa()*pgas;
	}

}
