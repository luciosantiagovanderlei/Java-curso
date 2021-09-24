package entities;

public class Aluno {
	public String name;
	public double note1;
	public double note2;
	public double note3;
	public String status;
	
	
	
	
	public double finalGrade() {
		double calcNota =  note1 + note2 + note3;
				
		if (calcNota >= 60) {
			status = "Pass";			
		} else {
			status = "Failed";
		}
		return calcNota;
		
	}

}
