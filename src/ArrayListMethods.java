import java.util.ArrayList;
public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> classmates = new ArrayList<String>();
		classmates.add("Intxausti");
		classmates.add(1, "Lazkano");
		classmates.add("Lekubide");
		classmates.add(3, "Alberdi");
		classmates.add("Artola");
		classmates.add(5, "Gonzalez");
		ArrayList<String> clone = (ArrayList<String>) classmates.clone();
		ArrayList<String> classmatesCopy = clone; 
		if (classmates.size()==6) {
			for (int i=0;i<classmates.size();i++) {
				System.out.println(classmates.get(i));
			}
			System.out.println();
			System.out.println();
			System.out.println();
			if (!classmates.contains("Ortiz")) {
				classmates.add(6, "Ortiz");
				classmates.add("Ortiz");
			}
			for (int i=0;i<classmates.size();i++) {
				System.out.println(classmates.get(i));
			}
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println(classmates.indexOf("Ortiz"));
			if (classmates.lastIndexOf("Ortiz")==7) {
				classmates.remove(5);
				classmates.remove("Ortiz");
			}
			System.out.println();
			System.out.println();
			System.out.println();
			classmates.clear();
			if (classmates.isEmpty()) {
				Object[] classmatesArray = classmatesCopy.toArray();
				for (int i=0;i<classmatesArray.length;i++) {
					System.out.println(classmatesArray[i]);
				}
			}
		}
	}

}
