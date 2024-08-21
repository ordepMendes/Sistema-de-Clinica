package entities;

import java.util.ArrayList;

public class Agenda {
	private String data;
	private ArrayList<Paciente> pacientes;
	private Medico medico;
	
	
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public ArrayList<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(ArrayList<Paciente> pacientes) {
		this.pacientes = pacientes;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Agenda(Medico medico) {
		pacientes = new ArrayList<Paciente>();
		data = "";
		this.medico = medico;
	}
	
	public void adicionar(Paciente p) {
		pacientes.add(p);
		
	}
	
	public void remover(String cpf) {
		for(int i = 0; i < pacientes.size(); i++) {
			if(pacientes.get(i).getCpf().equals(cpf)) {
				System.out.println(pacientes.get(i).getNome() + " foi removido com sucesso!");
				pacientes.remove(i);
				i = pacientes.size();
			}
		}
	}
	
	public void pesquisar(String cpf) {
		for(int i = 0; i < pacientes.size(); i++) {
			if(pacientes.get(i).getCpf().equals(cpf)) {
				System.out.println(pacientes.get(i).getNome());
				System.out.println(pacientes.get(i).getTelefone());
				System.out.println(pacientes.get(i).getIdade());
				i = pacientes.size();
			}
		}
	}
	
	public void apresentarLista() {
		System.out.println("Data do atendimento: " + data + ", Médico: " + medico.getNome() + " - " + medico.getEspecialidade());
		for(int i = 0; i < pacientes.size(); i++) {
			System.out.println((i + 1) + ", " + pacientes.get(i).getNome() + ", " 
			+ pacientes.get(i).getTelefone() + ", "
			+ pacientes.get(i).getCpf());
		}
	}
}
