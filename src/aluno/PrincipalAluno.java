package aluno;

import javax.swing.JOptionPane;


public class PrincipalAluno {

	public static void main(String[] args) {
	
		Aluno aluno = new Aluno();
		boolean cadastrou = false;
		boolean media = false;
		int op = 0;
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("MENU \n" +
															  "1 - Cadastrar \n"  +
															  "2 - Calcular média \n"    +
															  "3 - Verificar frequência \n" +
															  "4 - Verificar situação \n"   +
															  "0 - Sair"));
			
			switch (op) {
				case 1:
					aluno.cadastrar();
					cadastrou = true;
				break;
				case 2:
					if (cadastrou) {
						JOptionPane.showMessageDialog(null, "Média: " + aluno.calcularMedia());
						media = true;
					} else {
						JOptionPane.showMessageDialog(null, "Cadastre os dados antes");
					}
				break;
				case 3:
					JOptionPane.showMessageDialog(null,"Frequência: " + aluno.frequencia() + "%");
					break;
				case 4:
					if (media) {
						aluno.verificarSituacao();
					} else {
						JOptionPane.showMessageDialog(null, "Calcular a  média");
					}
					break;
				case 0:
					op = JOptionPane.showConfirmDialog(null, "Deseja encerrar o programa?", "SAIR", JOptionPane.YES_NO_OPTION);
				break;
				default:
					JOptionPane.showMessageDialog(null, "Opção Inválida: ");
				break;
			}
	   } while(op!=0);
		JOptionPane.showMessageDialog(null, "PROGRAMA ENCERRADO");
		
		
		
		
		
		
		
		
		
}
}

