package org.practicaltest.view;
import org.model.QuestionAnswer;
import java.util.Scanner;


public class Main {
	static Scanner a=new Scanner(System.in);
	
	public static void displayQuestion(QuestionAnswer[] arr) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=null) {
				System.out.println("Question. "+arr[i].getQuestion());
				System.out.println("A : "+arr[i].getOption1());
				System.out.println("B : "+arr[i].getOption2());
				System.out.println("C : "+arr[i].getOption3());
				System.out.println("D : "+arr[i].getOption4());
				
				System.out.print("Enter your Answer : ");
				
				String answer = a.nextLine();
				
				if(arr[i].getAnswer1().equalsIgnoreCase(answer) ) {
					System.out.println("Correct");
				}else {
					System.out.println("Wrong");
				}
				System.out.println();
			}else {
				break;
			}
		}
	}
	public static void main(String[] args) {
      QuestionAnswer [] array =  new QuestionAnswer[50];
		
		QuestionAnswer questionAnswer1=new QuestionAnswer("Choose the correct spelling of the word. ", "APPLE", "APDLE", "APLE", "AdPP","APP");
		QuestionAnswer questionAnswer2=new QuestionAnswer("Choose the correct spelling of the word. ", "WORLD","WORD","WORLDD","WOR","WAAAR");
		QuestionAnswer questionAnswer3=new QuestionAnswer("Choose the correct spelling of the word. ", "BEAUTIFULL","BEAUTIP","BERUTIFUL","BEAUTF","BEAUTIFLY");
		QuestionAnswer questionAnswer4=new QuestionAnswer("Choose the correct spelling of the word. ", "pile","piloe","plillow","ploeew","Pillow");
		QuestionAnswer questionAnswer5=new QuestionAnswer("Choose the correct spelling of the word. ", "KILO","KILE","KILEE","KIloo","Kilogram");

		array[0]=questionAnswer1;
		array[1]=questionAnswer2;
		array[2]=questionAnswer3;
		array[3]=questionAnswer4;
		array[4]=questionAnswer5;

		displayQuestion(array);
	}
		
		
		
		
		
		
	}
	
	
	



