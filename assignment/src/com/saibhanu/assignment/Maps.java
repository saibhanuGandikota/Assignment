package com.saibhanu.assignment;
import java.util.*;
public class Maps {

	public static void main(String[] args) {
		// map
		
		//HashMap
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"AKHILVAILALA");    
	      hm.put(2,"NAVEEN");    
	      hm.put(3,"AKHILESH");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     //HashTable
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"BHANU");  
	      ht.put(5,"AKHILA");  
	      ht.put(6,"AMRUTHA");  
	      ht.put(7,"ARUNA");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"SRAVAN");    
	      map.put(9,"HIMAKAR");    
	      map.put(10,"ARUNKUMAR");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}