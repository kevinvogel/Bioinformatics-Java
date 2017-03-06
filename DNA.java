/*
File name: DNA.java
Program author name: Kevin Vogel
 */

import java.util.Scanner;

// DNA class
public class DNA {
	// Initializes instance seqLength variable
	static int seqLength;
	
	// Constructor DNA method
	public DNA(String dnaSeq) {
		// Returns dnaSeq
		return;
	}
	
	// IsDNAvalid method to check if the sequence is valid DNA consisting of A, C, G and T nucleotide bases
	public boolean IsDNAvalid(String dnaSeq) {
		
		// Initializes local boolean dnaCheck variable equal to true
		boolean dnaCheck = true;
		
		// For loop to loop through the DNA sequence to make sure it consists DNA bases
	    for (int i = 0; i < dnaSeq.length(); i++) {
	    	// If statement to validate characters in the DNA string 
	        if ((dnaSeq.charAt(i) != 'A') && (dnaSeq.charAt(i) != 'T') && (dnaSeq.charAt(i) != 'C') && (dnaSeq.charAt(i) != 'G')) {
	            // If any characters do not equal A, C, G or T, dnaCheck is false
	        	dnaCheck = false;  
	        } 
	    }
	    // Returns whether or not DNA string is valid
	    return dnaCheck;
	}
	
	// GetSize method returns the length of the DNA string 
	public int GetSize(String dnaSeq) {
		// The .length() gives the number of characters within a string
		return seqLength = dnaSeq.length();
	}
	
	// BaseCount method counts the number of occurrences of each character within the string
	public int BaseCount(String dnaSeq, char dnaNucleotide) {
		
			// Initializes local integer variable count to zero 
		    int count = 0;
		    
		    // For loop used to loop through the string to count the desired characters
		    for (int i = 0; i < dnaSeq.length(); i++) {
		    	// If statement used to store the count of each character
		        if (dnaSeq.charAt(i) == dnaNucleotide) {
		             count++;
		        }
		    }
		    // Returns the count of a specific character
		    return count;
	}

	// Main method
	public static void main(String[] args) {
		
		// Initializes local variables in main method
		double count_of_A;
		double count_of_C;
		double count_of_G;
		double count_of_T;
		double gc_content;
		
		// Scanner used for user input
		Scanner dnaInput = new Scanner(System.in);
		// Prompts user for a DNA sequence
		System.out.println("Please enter a DNA sequence: ");
		String dnaSeq = dnaInput.nextLine();
		
		// Creates a dnaObject object
		DNA dnaObject = new DNA(dnaSeq);
		
		// Displays sequence entered by the user
		System.out.println("\nSequence: " + dnaSeq);
		
		// If/else statement used to determine if the sequence inputed is valid 
		if (dnaObject.IsDNAvalid(dnaSeq) == true){
			System.out.println("\nValid DNA sequence input? Yes");
		} else {
			// Else sequence is not valid DNA 
			System.out.println("\nValid DNA sequence input? No");
			// Main method is terminated 
			System.exit(0);
		}
		
		// Calls the GetSize method to set DNA string length to seqLength 
		seqLength = dnaObject.GetSize(dnaSeq);
		
		// Displays the length of the DNA string
		System.out.println("\nLength of DNA sequence: " + seqLength + " nucleotides");
		
		// Calls the BaseCount method to determine the count of characters A, C, G and T within the DNA string
		count_of_A = dnaObject.BaseCount(dnaSeq, 'A');
		count_of_C = dnaObject.BaseCount(dnaSeq, 'C');
		count_of_G = dnaObject.BaseCount(dnaSeq, 'G');
		count_of_T = dnaObject.BaseCount(dnaSeq, 'T');
		
		// Displays the name and number of each nucleotide in the DNA string
		System.out.println("\nNumber of Adenine bases: " + count_of_A);
		System.out.println("Number of Cytosine bases: " + count_of_C);
		System.out.println("Number of Guanine bases: " + count_of_G);
		System.out.println("Number of Thymine bases: " + count_of_T);
		
		// Calculates the GC content of the DNA sequence
		gc_content = (count_of_C + count_of_G) / dnaObject.GetSize(dnaSeq);
		
		// Print format used to displays the GC content to two decimal places
		System.out.printf("\nGC Content Percentage: " + "%.2f%%", gc_content);
		
		// Closes scanner
		dnaInput.close();
	}
}
	
