package menu;


public class Opcao {
	private int id;
	private String titulo;
	private MenuListener listener;
	private boolean saida;
	
	public Opcao(String titulo, MenuListener listener) {
		this.titulo = titulo;
		this.listener = listener;
		this.saida = false;
	}

	public Opcao(String titulo, MenuListener listener, boolean saida) {
		this.titulo = titulo;
		this.listener = listener;
		this.saida = saida;
	}

	public int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public MenuListener getListener() {
		return listener;
	}

	public void setListener(MenuListener listener) {
		this.listener = listener;
	}

	public boolean isSaida() {
		return saida;
	}

	public void setSaida(boolean saida) {
		this.saida = saida;
	}
	
	void ativar() {
		if (listener != null) {			
			listener.onOpcaoSelecionada(id);
		}
	}	
	
	@Override
	public String toString() {
		return id + " - " + titulo;
	}
}
