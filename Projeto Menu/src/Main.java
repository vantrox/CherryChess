import menu.Menu;
import menu.MenuListener;

public class Main {
	private static MenuListener listener1 = new MenuListener() {
		@Override
		public void onOpcaoSelecionada(int opcao) {
			System.out.println("Voce selecionou a opcao " + opcao);
		}
	};

	private static MenuListener listener2 = new MenuListener() {
		@Override
		public void onOpcaoSelecionada(int opcao) {
			Menu m = new Menu("*** ALTERAR ***");
			m.add("Alterar Nome", listener1);
			m.add("Alterar E-mail", listener1);
			m.add("Alterar Endereco", listener1);
			m.add("Retornar", listener1, true);			
			m.show();
		}
	};

	public static void main(String[] args) {
		Menu m = new Menu();
		m.add("Cadastrar", listener1);
		m.add("Consultar", listener1);
		m.add("Alterar", listener2);
		m.add("Remover", listener1);
		m.add("Sair", listener1, true);		
		m.show();
	}
}
