package main;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.TreeSet;

public class NumDecrescente {

	public double calcNumDecrescente(ArrayList<Double> numeros) {
		
		TreeSet num = sortList(numeros);
				
		Iterator iter1 = num.iterator();
		
		ArrayList lista = sortList2(num);
		
		int l = lista.size();
				
		System.out.println(lista.get(l-1));
				
		
		return l;

	}
	
	public static TreeSet sortList(ArrayList list){
		TreeSet sort = new TreeSet(list);
		return sort;	
	}
	
	public static ArrayList sortList2(TreeSet list){
		ArrayList sort = new ArrayList(list);
		return sort;
	}
	
}
