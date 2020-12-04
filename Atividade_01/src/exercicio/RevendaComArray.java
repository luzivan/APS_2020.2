package exercicio;

public class RevendaComArray {
	private Produto[] produtos;
	private int indice = 0;
	
	RevendaComArray (int qtd_produto) {
		this.produtos = new Produto[qtd_produto];
	}
	
	void inserirProduto (Produto produto) {
		if(indice <= produtos.length - 1) {
			produtos[indice] = produto;
			indice += 1;
			System.out.println("Produto inserido com sucesso!");
		} else {
			System.out.println("Tamanho do array excedido!");
		}
	}
	
	void comprar (int codigo, int quant) {
		for (int i = 0; i < indice; i++) {
			if(produtos[i].getCodigo() == codigo) {
				produtos[i].compra(quant);
				System.out.println("Produto comprado!");
				return;
			}
		}
		System.out.println("Erro: produto não encontrado!");
		return;
	}
	
	void vender (int codigo, int quant) {
		for (int i = 0; i < indice; i++) {
			if(produtos[i].getCodigo() == codigo) {
				produtos[i].venda(quant);
				System.out.println("Vendido");
				return;
			}
		}
		System.out.println("Erro: produto não encontrado!");
		return;
	}
	
	double consultaPrecoVenda (int codigo) {
		for (int i = 0; i < indice; i++) {
			if(produtos[i].getCodigo() == codigo) {
				return produtos[i].calculaPrecoVenda();
			}
		}
		System.out.println("Erro: produto não encontrado!");
		return -1;
	}
	
	String listaPreco () {
		String lista = "";
		for (int i = 0; i < indice; i++) {
			lista += "Código: " + produtos[i].getCodigo() + " Descrição: " + produtos[i].getDescricao() + " Valor de venda: " + produtos[i].calculaPrecoVenda() + "\n";
		}
		return lista;
	}
	
	Produto consulta(int codigo) {
		for (int i = 0; i < indice; i++) {
			if(produtos[i].getCodigo() == codigo) {
				return produtos[i];
			}
		}
		System.out.println("Erro: produto não encontrado!");
		return null;
	}
}
