import java.util.*;

class Studentcomparator implements Comparator<Student>{

	public int compare (Student a, Student b)
	{
		double aCgpa = a.getCgpa();
		double bCgpa = b.getCgpa();
		String aName = a.getFname();
		String bName = b.getFname();

		if( aCgpa == bCgpa)
		{
			if(aName.compareTo(bName) == 0)
			{
				return a.getId() - b.getId();
			}
			else
			{
				return aName.compareTo(bName);
			}
					
		}
		else
		{
			if(aCgpa > bCgpa)
				return -1;
			return 1;
		}		
	}
}

class Student{
   private int id;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}

//Complete the code
public class sortArray
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      
      List<Student> studentList = new ArrayList<Student>();
      while(testCases>0){
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();
         
         Student st = new Student(id, fname, cgpa);
         studentList.add(st);
         
         testCases--;
      }
            
      Collections.sort(studentList, new Studentcomparator());
      
         for(Student st: studentList){
         System.out.println(st.getFname());
      }
   }
}


