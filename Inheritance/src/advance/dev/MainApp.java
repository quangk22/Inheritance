package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person[] persons = new Person[4];

		input(persons);
		System.out.println("-------------------");
		print(persons);

	}

	private static void input(Person[] persons) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < persons.length; i++) {
			if (i < 2) {
				System.out.print("Nhập tên GV: ");
				String name = scanner.nextLine();

				System.out.print("Nhập tuổi: ");
				int age = scanner.nextInt();
				scanner.nextLine();

				System.out.print("Nhập số điện thoại: ");
				String phone = scanner.nextLine();
				System.out.print("Nhâp mã giáo viên: ");
				String maGV = scanner.nextLine();

				System.out.print("Nhap he so luong: ");
				double heSL = scanner.nextDouble();
				scanner.nextLine();

				persons[i] = new Teacher(name, age, phone, maGV, heSL);
			} else {
				System.out.print("Nhập tên sinh viên : ");
				String name = scanner.nextLine();

				System.out.print("Nhập tuổi: ");
				int age = scanner.nextInt();
				scanner.nextLine();

				System.out.print("Nhập số điện thoại: ");
				String phone = scanner.nextLine();

				System.out.print("Nhap diem Toan: ");
				double diemToan = scanner.nextDouble();
				scanner.nextLine();

				System.out.print("Nhap diem Ly: ");
				double diemLy = scanner.nextDouble();
				scanner.nextLine();
				
				System.out.print("Nhap diem Hoa: ");
				double diemHoa = scanner.nextDouble();
				scanner.nextLine();

				System.out.print("Nhap ma sinh vien: ");
				String maSV = scanner.nextLine();

				System.out.print("Nhap lop: ");
				String lop = scanner.nextLine();

				persons[i] = new Student(name, age, phone, diemHoa, diemLy, diemHoa, maSV, lop);
			}
		}
	}

	private static void print(Person[] persons) {
		// TODO Auto-generated method stub
		for (Person person : persons) {

			if (person instanceof Teacher) {
				System.out.println("Ten GV : " + person.getName());
				System.out.println("Tuoi: " + person.getAge());
				System.out.println("So dien thoai: " + person.getPhone());
				Teacher teacher = (Teacher) person;
				System.out.println("Ma giao vien: " + teacher.getMaGV());
				System.out.println("He so luong: " + teacher.getHeSL());
			} else if (person instanceof Student) {
				Student student = (Student) person;
				System.out.println("Ten học sinh : " + person.getName());
				System.out.println("Tuoi: " + person.getAge());
				System.out.println("So dien thoai: " + person.getPhone());
				System.out.println("Diem Toan: " + student.getDiemToan());
				System.out.println("Diem Ly: " + student.getDiemLy());
				System.out.println("Diem Hoa: " + student.getDiemHoa());
				System.out.println("Ma sinh vien: " + student.getMaSV());
				System.out.println("Lop: " + student.getLop());
			}

			System.out.println();
		}
	}
}
