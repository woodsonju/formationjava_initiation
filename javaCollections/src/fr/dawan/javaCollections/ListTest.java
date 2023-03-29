package fr.dawan.javaCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("aaaa");
		list.add("bbbb");
		list.add("cccc");
		list.add("pppp");
		
		System.out.println("**********Boucle classique*************");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("**********Boucle Foreach*************");
		for (String item : list) {
			System.out.println(item);
		}
		
		//Interface Set (n'accepte pas les doublons)
		Set<String> listStr = new HashSet<>();
		listStr.add("aaa");
		listStr.add("bbb");
		listStr.add("ccc");
		listStr.add("bbb");
		listStr.add("eee");
		
		System.out.println("\n***********Boucle FOREACH*********************");
		for (String item : listStr) {
			System.out.println(item);
		}

	}

}
