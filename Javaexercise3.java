package exercises;

 class SubjectMarks {

	
		
		//These variables are instance variables, defined in class
		int ScienceMarks;
		int MathsMarks;
		int GKMarks;
		
	}
	
	public class Javaexercise3{
		public static void main(String[] args) {
			
			//student1
			// Student 1 
			 SubjectMarks Subj1 = new SubjectMarks();
			 
			 Subj1.ScienceMarks = 60; 
			 Subj1.MathsMarks = 80; 
			 Subj1.GKMarks = 70; 
			 
			 // Student 2 
			 SubjectMarks Subj2 = new SubjectMarks(); 
			 Subj2.ScienceMarks = 85; 
			 Subj2.MathsMarks = 50; 
			 Subj2.GKMarks = 95; 
			 
			 // displaying marks for Student 1 
			 System.out.println("Marks for first object:"); 
			 System.out.println(Subj1.ScienceMarks); 
			 System.out.println(Subj1.MathsMarks); 
			 System.out.println(Subj1.GKMarks);
			 
			// displaying marks for Student 2 
			 System.out.println("Marks for second object:"); 
			 System.out.println(Subj2.ScienceMarks); 
			 System.out.println(Subj2.MathsMarks); 
			 System.out.println(Subj2.GKMarks);

	}

}
