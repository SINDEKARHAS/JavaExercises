package exercises;

import java.util.ArrayList;

public class Javaexercise32 
{
	
public static void main(String[] args)
{
	
ArrayList<String> list = new ArrayList<String>();

list.add ("First");
list.add("Second");
list.add("Third");
list.add("Fourth");
list.add("Fifth");

for (int i = 0; i < list.size(); i++) {
	
System.out.println(list.get(i));

	} 

System.out.println("Size of Array " + list.size());} }
