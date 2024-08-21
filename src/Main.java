import entities.Agenda;
import entities.Medico;
import entities.Paciente;

public class Main {

	public static void main(String[] args) {
		
		Medico carlos = new Medico("Carlos", "Cardiologista");
		Medico julia = new Medico("julia", "Ortopedista");
		
		Paciente p1 = new Paciente("Pedro", "458.742.045-65", 23, "(21) 94002-8922");
		Paciente p2 = new Paciente("Aline", "477.555.679-12", 41, "(22) 97621-9788");
		Paciente p3 = new Paciente("Beatriz", "127.094.501-90", 18, "(11) 95784-6610");
		Paciente p4 = new Paciente("Bernardo", "036.025.784-90", 27, "(21) 95420-3741");
		
		Agenda agenda1 = new Agenda(carlos);
		Agenda agenda2 = new Agenda(julia);
		
		agenda1.setData("20/08/2024");
		agenda2.setData("09/09/2024");
		
		agenda1.adicionar(p1);
		agenda1.adicionar(p4);
		agenda2.adicionar(p2);
		agenda2.adicionar(p3);
		
		agenda1.apresentarLista();
		System.out.println("============================");
		agenda2.apresentarLista();
	}

}
