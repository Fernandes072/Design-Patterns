package br.edu.ifs.designpatterns.facade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.edu.ifs.designpatterns.facade.impl.Cliente;
import br.edu.ifs.designpatterns.facade.impl.GeradorID;
import br.edu.ifs.designpatterns.facade.impl.Pedido;
import br.edu.ifs.designpatterns.facade.impl.Produto;

public class Fachada {

	private List<Cliente> clientes;
	private List<Produto> produtos;
	private Map<Cliente, List<Pedido>> pedidos;

	public Fachada() {
		clientes = new ArrayList<>();
		produtos = new ArrayList<>();
		pedidos = new HashMap<>();
	}

	public String registrarCliente(String nome) {
		Cliente cliente = new Cliente("Cli" + GeradorID.gerarClienteID(), nome);
		clientes.add(cliente);
		pedidos.put(cliente, new ArrayList<>());
		return cliente.getId();
	}

	public List<String> listarClientes() {
		return clientes.stream().map(c -> c.toString()).toList();
	}

	public String registrarProduto(String nome, double preco) {
		Produto produto = new Produto("Pro" + GeradorID.gerarProdutoID(), nome, preco);
		produtos.add(produto);
		return produto.getId();
	}

	public List<String> listarProdutos() {
		return produtos.stream().map(p -> p.toString()).toList();
	}

	public double obterTotal(String idCliente) {
		for (Cliente cliente : clientes) {
			if (cliente.getId().equals(idCliente)) {
				return cliente.getPedido().valorTotal();
			}
		}
		return 0;
	}

	public void escolherProduto(String idCliente, String idProd) {
		Cliente cliente = null;
		for (Cliente c : clientes) {
			if (c.getId().equals(idCliente)) {
				cliente = c;
				break;
			}
		}
		Produto produto = null;
		for (Produto p : produtos) {
			if (p.getId().equals(idProd)) {
				produto = p;
				break;
			}
		}
		cliente.getPedido().adicionar(produto);
	}

	public String fecharCompra(String idCliente) {
		for (Cliente cliente : clientes) {
			if (cliente.getId().equals(idCliente)) {
				Pedido pedido = cliente.getPedido();
				pedido.setId("Ped" + GeradorID.gerarPedidoID());
				pedidos.get(cliente).add(pedido);
				cliente.setPedido(new Pedido());
				return pedido.getId();
			}
		}
		return null;
	}

	public List<String> listarPedidos(String idCliente) {
		List<Pedido> pedidos = null;
		for (Cliente cliente : clientes) {
			if (cliente.getId().equals(idCliente)) {
				pedidos = this.pedidos.get(cliente);
			}
		}
		List<String> retorno = new ArrayList<>();
		for (Pedido pedido : pedidos) {
			retorno.add(pedido.getId() + ": " + pedido.toString());
		}
		return retorno;
	}

}
