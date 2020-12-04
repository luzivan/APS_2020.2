package exercicio;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		RevendaComArray revenda = new RevendaComArray(5);
		Scanner teclado = new Scanner(System.in);
		
		int codigo = 0;
		String descricao = "-";
		double vl_compra = 0;
		double custo = 0;
		double margem_lucro = 0;
		int qtd_estoque = 0;
		
		int key = 0;
		
		while (key != 6) {
			System.out.println("Escolha a opção desejada:\n"
					+ "1 - Criar produto\n"
					+ "2 - Comprar\n"
					+ "3 - Vender\n"
					+ "4 - Consultar preço\n"
					+ "5 - Listar preço\n"
					+ "6 - Sair");
			
			key = teclado.nextInt();
			
			switch (key) {
			case 1:
				System.out.println("Digite o codigo: ");
				codigo = teclado.nextInt();
				System.out.println("Digite a descrição: ");
				teclado.nextLine();
				descricao = teclado.nextLine();
				System.out.println("Digite o valor de compra: ");
				vl_compra = teclado.nextDouble();
				System.out.println("Digite o valor do custo: ");
				custo = teclado.nextDouble();
				System.out.println("Digite o valor de lucro: ");
				margem_lucro = teclado.nextDouble();
				System.out.println("Digite a quantidade em estoque: ");
				qtd_estoque = teclado.nextInt();
				
				Produto produto = new Produto(codigo, descricao, vl_compra, custo, margem_lucro, qtd_estoque);
				
				revenda.inserirProduto(produto);
				break;

			case 2:
				System.out.println("Digite o codigo do produto: ");
				codigo = teclado.nextInt();
				System.out.println("Digite a quantidade: ");
				int qtd_compra = teclado.nextInt();
				
				revenda.comprar(codigo, qtd_compra);
				break;
				
			case 3:
				System.out.println("Digite o codigo do produto: ");
				codigo = teclado.nextInt();
				System.out.println("Digite a quantidade: ");
				int qtd_venda = teclado.nextInt();
				
				revenda.vender(codigo, qtd_venda);
				break;
				
			case 4:
				System.out.println("Digite o codigo do produto: ");
				codigo = teclado.nextInt();
				
				double preco_venda = revenda.consultaPrecoVenda(codigo);
				
				if(preco_venda != -1) {
					System.out.println("Preço de venda: " + preco_venda);
				}
				break;
				
			case 5:
				System.out.println(revenda.listaPreco());
				int opcao = 0;
				
				while (opcao != 3) {
					System.out.println("1 - Consultar produto\n"
							+ "2 - Alterar produto\n"
							+ "3 - Voltar");
					
					opcao = teclado.nextInt();
					
					switch (opcao) {
					case 1:
						System.out.println("Digite o codigo do produto: ");
						codigo = teclado.nextInt();
						
						Produto p = revenda.consulta(codigo);
						
						if(p != null) {
							System.out.println("Valor de compra: " + p.getVl_compra() + "\nCusto: " + p.getCusto() + "\nMargem de lucro: " + p.getMargem_lucro());
						}
						break;
						
					case 2:
						System.out.println("Digite o codigo do produto: ");
						codigo = teclado.nextInt();
						p = revenda.consulta(codigo);
						
						if(p != null) {
							System.out.println("Digite o novo valor de compra: ");
							vl_compra = teclado.nextDouble();
							p.setVl_compra(vl_compra);
							
							System.out.println("Digite o novo custo: ");
							custo = teclado.nextDouble();
							p.setCusto(custo);
							
							System.out.println("Digite a nova margem de lucro: ");
							margem_lucro = teclado.nextDouble();
							p.setMargem_lucro(margem_lucro);
						}
						
						break;
						
					case 3:
						break;
					default:
						System.out.println("Opção invalida");
						break;
					}
				}
				
				break;
				
			case 6:
				break;
				
			default:
				System.out.println("Opção invalida");
				break;
			}
			
		}
		
		teclado.close();
		System.out.println("Programa encerrado");
	}
}
