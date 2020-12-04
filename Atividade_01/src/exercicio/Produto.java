package exercicio;

public class Produto {
	private int codigo;
	private String descricao;
	private double vl_compra;
	private double custo;
	private double margem_lucro;
	private int qtd_estoque;
	
	//Construtores
	
	Produto (int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.vl_compra = 0;
		this.custo = 0;
		this.margem_lucro = 0;
		this.qtd_estoque = 0;
	}
	
	Produto (int codigo, String descricao, double vl_compra, double custo, double margem_lucro) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.vl_compra = vl_compra;
		this.custo = custo;
		this.margem_lucro = margem_lucro;
		this.qtd_estoque = 0;
	}
	
	Produto (int codigo, String descricao, double vl_compra, double custo, double margem_lucro, int qtd_estoque) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.vl_compra = vl_compra;
		this.custo = custo;
		this.margem_lucro = margem_lucro;
		this.qtd_estoque = qtd_estoque;
	}
	
	//Metodos
	
	void compra (int quant) {
		this.qtd_estoque = this.qtd_estoque + quant;
	}
	
	void venda (int quant) {
		this.qtd_estoque = this.qtd_estoque -  quant;
	}
	
	double calculaPrecoVenda () {
		return this.vl_compra + this.custo + this.margem_lucro * (this.vl_compra + this.custo);
	}

	//Metodos Get e Set
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getDescricao () {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getVl_compra() {
		return vl_compra;
	}

	public void setVl_compra(double vl_compra) {
		this.vl_compra = vl_compra;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	public double getMargem_lucro() {
		return margem_lucro;
	}

	public void setMargem_lucro(double margem_lucro) {
		this.margem_lucro = margem_lucro;
	}
	
}