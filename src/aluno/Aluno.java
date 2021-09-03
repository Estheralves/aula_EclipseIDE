package aluno;

import javax.swing.JOptionPane;

public class Aluno {
	
	public static void main (String[] args)  {
		
	}
	String nome;
	double nota1;
	double nota2;
	double numeroFaltas;
	double numeroAulas;
	double media;
	double frequencia;
	
	public Aluno(String nome, double nota1, double nota2, double numeroFaltas, double numeroAulas ,double media, double frequencia) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.numeroFaltas = numeroFaltas;
		this.numeroAulas = numeroAulas;
		this.media = media;
		this.frequencia = frequencia;
	}
	
	public Aluno() {
		this("", 0, 0, 0, 0, 0, 0 );
	}

	public void cadastrar() {
		this.nome = JOptionPane.showInputDialog("Entre com o nome do aluno");
		this.nota1 = Double.parseDouble(JOptionPane.showInputDialog("Entre com a 1ª nota"));
		this.nota2 = Double.parseDouble(JOptionPane.showInputDialog("Entre com a 2ª nota"));
		JOptionPane.showMessageDialog(null, "Dados cadastrados");
	}
	
	
	public double calcularMedia() {
		this.media = (this.nota1 + this.nota2) / 2;
		return this.media;
	}
	
	public double frequencia() {
		this.numeroAulas = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de aulas dadas"));
		this.numeroFaltas = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de faltas"));
		this.frequencia = (this.numeroAulas - this.numeroFaltas) / this.numeroAulas * 100;
	//	                           125      -      25 =       100 /    125 = 0,8 = 80
		return this.frequencia;
	}
	
	public void verificarSituacao() {
		if(this.media <= 4.9 || this.frequencia < 75) {
			JOptionPane.showMessageDialog(null, "Aluno Reprovado");
		} else if(this.media <= 6.9  &&  this.frequencia >= 75 ) {
			JOptionPane.showMessageDialog(null, "Aluno de Recuperação");
		} else {
			JOptionPane.showMessageDialog(null, "Aluno Aprovado");
		}
	}
}

	
	

	