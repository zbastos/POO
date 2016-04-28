
/**
 * Abstract class Imovel - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Imovel
{
	private String rua;
	private double precoMinimo;
	private double precoPedido;

	/**
     * Construtor padrão
     */	
	public Imovel() {
		this.rua = "n/a";
		this.precoMinimo = 0.0;
		this.precoPedido = 0.0;
	}

	/**
     * Construtor por parâmetros
     * @param rua
     * @param precoMinimo
     * @param precoPedido
     */	
	public Imovel(String rua, double precoMinimo, double precoPedido) {
		this.rua = rua;
		this.precoMinimo = precoMinimo;
		this.precoPedido = precoPedido;
	}

	/**
     * Construtor por cópia
     */
	public Imovel(Imovel imov) {
		this.rua = imov.getRua();
		this.precoMinimo = imov.getPrecoMinimo();
		this.precoPedido = imov.getPrecoPedido();
	}

	/**
 	 * Obter nome da rua
 	 * @return
 	 */
	public String getRua() {
		return this.rua;
	}

	/**
 	 * Obter preço mínimo
 	 * @return
 	 */
	public double getPrecoMinimo() {
		return this.precoMinimo;
	}

	/**
     * Obter preço pedido
     * @return
     */
	public double getPrecoPedido() {
		return this.precoPedido;
	}

	/**
     * Define nome da rua
     * @param rua
     */
	public void setRua(String rua) {
		this.rua = rua;
	}

	/**
     * Define preço mínimo
     * @param precoMinimo
     */
	public void setPrecoMinimo(double precoMinimo) {
		this.precoMinimo = precoMinimo;
	}

	/**
     * Define preço pedido
     * @param precoPedido
     */
	public void setPrecoPedido(double precoPedido) {
		this.precoPedido = precoPedido;
	}
}