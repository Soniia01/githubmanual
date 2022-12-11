/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author alumno
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String txt = "Mama come pipas";
		int vowels = 0, consonants = 0;
		//With for traditional
		for (int i = 0; i < txt.length(); i++) {
			txt = txt.replace(" ","");
			if(txt.charAt(i) == 'a' || txt.charAt(i) == 'e' || txt.charAt(i) == 'i'
                    || txt.charAt(i) == 'o' || txt.charAt(i) == 'u') {
				vowels+=1;
			} else {
				consonants++;
			}
		}
		System.out.println(txt + " tiene " + vowels + " vocales y " + consonants + " consonantes");
    }
    
}
