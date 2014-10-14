package menu;

import java.util.ArrayList;
import java.util.List;

import util.Keyboard;

public class Menu {
	private String titulo = "*** PRINCIPAL ***";
	private String prompt = "Opcao: ";
	private String mensagemErro = "Opcao invalida. Por favor, tente novamente.";
	private List<Opcao> opcoes = new ArrayList<Opcao>();
	
	public Menu() {
	}
	
	public Menu(String titulo) {
		this.titulo = titulo;
	}

	public Menu(String titulo, String prompt) {
		this.titulo = titulo;
		this.prompt = prompt;
	}

	public Menu(String titulo, String prompt, String mensagemErro) {
		this.titulo = titulo;
		this.prompt = prompt;
		this.mensagemErro = mensagemErro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getPrompt() {
		return prompt;
	}

	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}

	public String getMensagemErro() {
		return mensagemErro;
	}

	public void setMensagemErro(String mensagemErro) {
		this.mensagemErro = mensagemErro;
	}

	public void add(Opcao opcao) {
		opcoes.add(opcao);
		opcao.setId(opcoes.size());
	}
	
	public void add(String titulo, MenuListener listener) {
		Opcao opcao = new Opcao(titulo, listener);
		add(opcao);
	}
	
	public void add(String titulo, MenuListener listener, boolean saida) {
		Opcao opcao = new Opcao(titulo, listener, saida);
		add(opcao);
	}
	
	public void show() {
		while (true) {
			/*
			System.out.println(titulo);
			System.out.println();			
			for (int i = 0; i < opcoes.size(); i++) {
				Opcao opcao = opcoes.get(i);
				System.out.println((i + 1) + " - " + opcao.getTitulo());
			}
			System.out.println();
			System.out.print(prompt);
			*/			
			try {
				System.out.print(this);
				int op = Keyboard.readInt();
				if (op > 0 && op <= opcoes.size()) {
					Opcao opcao = opcoes.get(op - 1);
					opcao.ativar();
					if (opcao.isSaida()) {
						break;
					}
				} else {
					System.out.println(mensagemErro);
				}
			} catch(NumberFormatException e) {
				System.out.println(mensagemErro);
			}			
		}
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(titulo).append("\n\n");
		for (Opcao op : opcoes) {
			sb.append(op).append("\n");
		}
		sb.append("\n").append(prompt);
		return sb.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
