import java.util.ArrayList;
import java.util.Scanner;
class CustomCollectionList{
    public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		ArrayList<String> list=new ArrayList<String>(10);
		list.add("Navya");
		list.add("Anusha");
		list.add("Haritha");
		list.add("vaishnavi");
		list.add("Anusha");
		list.add("Deepthi");
		list.add("Swapna");
		list.add("Niharika");
		list.add("Mounika");
		list.add("Indu");
		System.out.println("Student names who got placed in campus placements");
		//printing values in list
		for(String name:list){
			System.out.println(name);
		}
		System.out.println("Size of the students list : "+list.size());
		//using index in add() method
		list.add(3,"Priya");
		list.add("Lekha");
		System.out.println("After adding new students into list the names are:");
		for(String name:list){
			System.out.println(name);
		}
		System.out.println("Size of the students list after adding some students : "+list.size());
		//using get() method
		System.out.println("Student at the index 2 is : "+list.get(2));
		//printing last occurance of specified element
		System.out.print("Position of Anusha in list is : ");
		System.out.println(list.lastIndexOf("Anusha"));
		//checking whether the student is present or not
		if(list.contains("Vaishnavi")){
			System.out.println("Specified student Vaishnavi is there in the list");
		}
		else{
			System.out.println("Specified student Vaishnavi is there in the list");
		}
		//finding index of particular index in list
		System.out.println("The index of Anusha occurance in list : "+list.indexOf("Anusha"));
		//removing Anusha from list
		list.remove("Anusha");
		System.out.println("Student list after removing some students from list : ");
		for(String name:list){
			System.out.println(name);
		}
		System.out.println("Size of reduced list after removing some students : "+list.size());
		//replace specified element in the list
		list.set(list.indexOf("Haritha"),"Jyothi");
		System.out.println("Students list after replacing Haritha with Jyothi : ");
		for(String name:list){
			System.out.println(name);
		}
		//displaying sublist of students list from specified positions
		System.out.println("Sublist of students list from 3rd position to 6th position is : ");
		System.out.println(list.subList(3,7));
		//reducing the size of the list to current size of the list
		list.trimToSize();
		System.out.println("Final size of the students list : "+list.size());
	}
}