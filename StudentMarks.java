import java.util.Scanner;

class StudentMarks{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of subjects:");
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i++){
			System.out.print("enter sub"+i+" marks b/w 0 and 100:");
			int marks=sc.nextInt();
			if(checkmarks(marks)){
				sum+=marks;
			}else{
				System.out.println("Invalid format in entering the marks..!!!");
				System.exit(0);
			}
		}
		System.out.println("total marks: "+sum);
		System.out.println("average percentage: "+(sum/n)+"%");
		System.out.println("Grade: "+checkGrade(sum/n));

	}
	public static boolean checkmarks(int marks){
		if(marks>0 && marks<100){
			return true;
		}
		return false;
	}
	public static String checkGrade(float percentage){
		if(percentage>93){
			return "Distinction";
		}else if(percentage>80 && percentage<=93){
			return "A grade";
		}else if(percentage>70 && percentage<=80){
			return "B grade";
		}else if(percentage>60 && percentage<=70){
			return "C grade";
		}else if(percentage>50 && percentage<=60){
			return "D grade";
		}else if(percentage>40 && percentage<=50){
			return "E grade";
		}else{
			return "Failed";
		}
	}
}