//https://mkyong.com/java/java-object-sorting-example-comparable-and-comparator/
//https://developer.mozilla.org/zh-TW/docs/Web/JavaScript/Reference/Global_Objects/Array/sort
//https://www.geeksforgeeks.org/comparable-vs-comparator-in-java/

import java.util.*;

class Main{
	public static void main(String[] Args){
		Scanner sc = new Scanner(System.in);
		// Student s1 = new Student();
		// s1.name = "John";
		// s1.gpa = 4.0;
		// s1.age = 18;

		// System.out.println(s1.name + " " + s1.gpa + " " + s1.age);

		// Student sArr[] = new Student[5];
		// sArr[0] = new Student();
		// sArr[0].name = "Kid";
		// sArr[0].gpa = 3.8;
		// sArr[0].age = 14;

		// System.out.println(sArr[0].name + " " + sArr[0].gpa + " " + sArr[0].age);

		Student std[] = new Student[5];

		for(int i=0; i<5; i++){
			String n = sc.next();
			Double g = sc.nextDouble();
			int a = sc.nextInt();

			std[i] = new Student();
			std[i].name = n;
			std[i].gpa = g;
			std[i].age = a;
		}

		System.out.println();
		System.out.println("Ori:");
		for(int i=0; i<5; i++){
			System.out.println(std[i].name + " " + std[i].gpa + " " + std[i].age);
		}

		cmp CMP = new cmp();
		Arrays.sort(std, CMP);

		System.out.println();
		System.out.println("Sorted:");
		for(int i=0; i<5; i++){
			System.out.println(std[i].name + " " + std[i].gpa + " " + std[i].age);
		}
	}
}

class Student{
	String name;
	double gpa;
	int age;
}

class cmp implements Comparator<Student>{
	public int compare(Student s1, Student s2){
		if(s1.age > s2.age) return 1;  //回傳大於 0，會把 s1 放在 s2 後面
		if(s1.age < s2.age) return -1; //回傳小於 0，會把 s1 放在 s2 前面
		else return 0;				   //回傳 0，不會變更順序
	}
}