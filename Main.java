/*import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int select;
        System.out.println("Select the operation :");
        System.out.println("1. addition\n2. subtraction\n3. division\n4. multiplication\n5. check reminder");
        select = sc.nextInt();
        
        System.out.println("Enter first numbe : ");
        a = sc.nextInt();
        System.out.print("Enter second number : ");
        b = sc.nextInt();

        switch(select){
            case 1 : System.out.println(a + b);
            break;

            case 2 : System.out.println(a - b);
            break;

            case 3 : System.out.println(a / b);
            break;

            case 4 : System.out.println(a * b);
            break;

            case 5 : System.out.println(a % b);
            break;

            default : System.out.println("Invalid selection");
        }

        sc.close();
    }
}*/

/*public class Main{
    public static void main(String[] args){
        for(int i = 0; i<=10; i++){
            System.out.print(i);
            System.out.print("\t");
        }
        int i = 0;
        System.out.println("");
        while(i <=10){
            System.out.print(i);
            System.out.print("\t");
            i++;
        }
        System.out.println("");

        i = 0;
        do{
            System.out.print(i);
            System.out.print("\t");
            i++;
        }while(i <= 10);
        
    }
}*/

/*import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scaning = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = scaning.nextInt();
        int sum = 0;
        // for(int i = 1; i<=n; i++){
        //     sum += i;
        // }
        int i = 1;
        do{
            sum += i;
            i++;
        }while(i <= n);
        System.out.println(sum);
        scaning.close();
    }
}*/


/*
// Solid Rectangle
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char str = '*';
        for(int i = 0; i< 4; i++){
            for(int j = 0; j<5; j++){
                System.out.print(str);
            }
            System.out.print("\n");
        }
        sc.close();
    }
}*/

/*
//Hollow Rectangle
public class Main{
    public static void main(String[] args){
        int n = 4, m = 5;
        char str = '*';
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=m; j++){
                if(i == 1 || j == 1 || j == m || i == n){
                    System.out.print(str);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}*/

/*
//Half Pyramid
public class Main{
    public static void main(String[] args){
        int n = 4;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

/*
//Invert Half Pyramid
public class Main{
    public static void main(String[] args){
        int n = 3;
        for(int i = 0; i<=n; i++){
            for(int j = 0; j<=n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

/*
//Invert Half Pyramid (rotated by 180 deg)
public class Main{
    public static void main(String[] args){
        int n = 4;
        char st = '*';
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print(st);
            }
            System.out.println(); 
        }
    }
}*/

/*
//Half Pyramid with numbers
public class Main{
    public static void main(String[] args){
        int n = 5;
        int num = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}*/

/*
//0 - 1 Triangle

public class Main{
    public static void main(String[] args){
        int n = 5;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                if((i + j) % 2 == 0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}*/
/*
//Print a solid rhombus.
public class Main{
    public static void main(String[] args){
        int n = 5;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

/*
public class Main{
    public static void main(String[] args){
        int n = 5;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}*/

/*
public class Main{
    public static void main(String[] args){
        int n = 5;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){

            }
        }
    }
}*/
/*
import java.util.*;

public class Main{
    public static void isprime(int a){
        boolean prime = true;
        for(int i = 2; i<a/2; i++){
            if(a % i == 0){
                System.out.println(a+" is Not a Prime number");
                prime = false;
                break;
            }
            if(prime){
                System.out.println(a+" is a prime number");
                break;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check weather it is a prime number or not :");
        int a = sc.nextInt();
        isprime(a);
        sc.close();
    }
}*/

/*
import java.util.*;
public class Main{
    //1. Enter 3 numbers from the user & make a function to print their average.
    public static int avg(int a, int b, int c){
        return (a + b + c) / 3;
    }

    // 2. Write a function to print the sum of all odd numbers from 1 to n.

    public static int SumOfOdd(int n){
        int sum = 0;
        for(int i = 1; i<=n; i++){
            if(i%2==0) continue;
            else sum+= i;
        }
        return sum;
    }

    // 3. Write a function which takes in 2 numbers and returns the greater of those two.
    public static int gratest(int a, int b){
        return (a > b)?  a :  b;
    }


    // 4. Write a function that takes in the radius as input and returns the circumference of a circle.
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Emter the size of matrix in n X m form : ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        System.out.println("Enter the elements of matrix A :");
        int mat[][] = new int[row][col];
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the target : ");
        int target = sc.nextInt();

        System.out.println("Elements in matrix stored sucessfully!");
        System.out.println("Elements of matrix A : ");

        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                //System.out.print(mat[i][j]+" ");
                if(target == mat[i][j]){
                    System.out.println(target+" is in the "+i+","+j+" index");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}*/

/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = "my name is veerendra";
        String sub = str1.substring(11);
        System.out.println(sub);
        sc.close();
    }
}*/

/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many Strings will you enter : ");
        int strs = sc.nextInt();
        String []nStrings = new String[strs];
        System.out.println("Enter strings : ");
        for(int i = 0; i<strs; i++){
            nStrings[i] = sc.next();
        }
        
        int totallen = 0;
        for(int i = 0; i<strs; i++){
            totallen+=nStrings[i].length();
        }
        
        for(int i = 0; i<strs; i++){
            System.out.println( nStrings[i]+" : "+nStrings[i].length());
        }

        System.out.print("number of characters / length of all combined strings is : "+ totallen);

        System.out.print("\nPROOF: \n");
        
        // for(int i = 0; i<strs; i++){
        //     System.out.println((i+1)+" "+nStrings[i].charAt(i));
        // }
        
        sc.close();
    }
}*/

/*
public class Main{
    public static void main(String[] args){
        
        StringBuilder st = new StringBuilder("TONY");
        System.out.println(st);
        st.setCharAt(0, 'P');
        System.out.println(st);
        //PONY
        st.insert(2, 'R');
        System.out.println(st);
        //PORNY
        st.delete(4, 5);
        System.out.println(st);
        //PORN

        st.delete(1, st.length());
        System.out.println(st);
        //st = " "
        st.setCharAt(0, 'V');
        System.out.println(st);
        // st = V
        st.append("EERU");
        System.out.println(st);
        // st = VEERU

        st.delete(4, 5);
        System.out.println(st);
        //st = VEER

        st.append("ENDRA");
        System.out.println(st);
        //st = VEERENDRA
        st.insert(4, " ");
        System.out.println(st);

        st.insert(8, " ");
        System.out.println(st);
    }
}*/

/*

//GET BIT
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       // System.out.print("Enter a Decimal number : ");
        //int n = sc.nextInt();
        int n = 0;
        while(true){
            System.out.print("Enter the position number : ");
            int position = sc.nextInt();

            n = (1<<position) & n;
            System.out.println(n);
        }
    }
}*/


/*

//SET BIT

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Decimal number : ");
        int num = sc.nextInt();

        System.out.print("Enter the Bit Position : ");
        int i = sc.nextInt();

        int bitMask = (1 << i) | num;

        System.out.print("Number after setting new bit : "+bitMask);
    }
}*/

/*
//UPDATE BIT

import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.print("Enter the position of changing  : ");
        int i = sc.nextInt();

        System.out.print("Enter 1 for changing 0 from 1 or Enter 0 to change 1 from 0 : ");
        int select = sc.nextInt();

        int bitMask = 1<<i-1;
        int newnumber = 0;
        if(select == 1){
            newnumber = bitMask | n;
        }else if(select == 0){
            bitMask = ~bitMask;
            newnumber = bitMask & n;
        }else{
            System.out.println(select+" Is not a bit");
        }

        System.out.print("Number after changing the position : "+newnumber);
    }
}*/

/*
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an number : ");
        int n = sc.nextInt();

        int bitMask = 0;
        int pos = 0;
        while(true){
            System.out.print("Enter the position : ");
            pos = sc.nextInt();
            bitMask = 1<<pos-1;

            int check = bitMask & n;
            if(check == 1){
                n = ~bitMask;
                n = n & n;
            }else{
                n = bitMask | n;
            }

            System.out.println(n);

        }

        
        
    }
}*/

/*
import java.util.*;
public class Practice{
    public static void main(String args[]){

        int a = 10;
        int b = 20;
        int c;
        System.out.println("\tBefore Swapping : ");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        c = a;
        a = b;
        b = c;
        System.out.println();
        System.out.println("\tAfter Swapping : ");
        System.out.println("a : "+a);
        System.out.println("b : "+b);

        int x = 10;
        int y = 40;
        x = y - x;
        
    }
}*/

/*
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();

        if(x > 0){
            System.out.println(x+" is an positive number");
        }else if(x < 0){
            System.out.println(x+" is a negative numebr");
        }else{
            System.out.println(x+" is zero");
        }
    }
}*/

/*
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if(n % 2 == 0){
            System.out.println(n+" is an even number");
        }else{
            System.out.println(n+" is an odd number");
        }
    }
}*/

/*

//Leep year: 
import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year = sc.nextInt();
        int leepYear = year % 4;
        if(leepYear == 0){
            System.out.println(year+" is a leep year");
        }else{
            System.out.println(year+" is not a leep year");
        }
    }
}*/

/*
import java.util.*;

public class Main{
    public static void main(String non[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Letter : ");
        char x = sc.next().charAt(0);
        if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U'){
            System.out.println(x+" is a vowal");
        }else{
            System.out.println(x + " is an consonant");
        }

    }
}*/

/*
//package com.java_practice;

import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numerb : ");
		int n = sc.nextInt();
		if(n % 5 == 0){
			if(n % 9 == 0){
				System.out.println(n+" is devisiable by both 5 & 9");
			}else{
				System.out.println(n+" is devisiable by 5");
			}
		}else{
			if(n % 9 == 0){
				System.out.println(n+" Is devisiable by 9");
			}else{
				System.out.println(n + " is not devisiable by 5 or 9");
			}
		}
	}
}*/

/*
public class Main{
	public static void main(String args[]){
		for(int i = 0; i<10; i++){
			System.out.println(i+1);
		}
	}
}*/

/*
import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = scan.nextInt(), sum = 0;
		for(int i = 1; i<=n; i++){
			sum+= i;
		}
		System.out.println("Sum of "+n+" Natural number is : "+sum);
	}
}*/

/*
import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = scan.nextInt(),fact = 1;
		while(n != 0){
			fact*=n;
			n--;
		}
		System.out.println(fact);
	}
}*/

/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Multipal table number : ");
        int x = scan.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.printf("%d X %d = %d", x , i, i*x);
            System.out.println();
        }

    }
}*/

/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        while(n != 0){
            n/=10;
            count++;
        }
        System.out.println(count);
    }
}*/

/*

// REVERSE OF A NUMBER + CHECKING PELENDROME
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int x = scan.nextInt();
        int rem, rev = 0;
        int xx = x;

        while(x != 0){
            rem = x % 10;
            rev = rev * 10 + rem;
            x /= 10;
        }
        System.out.println(xx == rev?xx+" IS PELANDROME": xx+" IS NOT PELANDROME"); 
        //System.out.println(rev);
        scan.close();
    }
}*/

/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        boolean isprime = true;
        for(int i = 2; i<= num/2; i++){
            if(num % i == 0){
                System.out.println(num+" IS NOT A PRIME NUMBER");
                isprime = false;
                break;
            }        
            
        }
        if(isprime){
            System.out.println(num+" IS AN PRIME NUMBER");   
        }

        scan.close();
    }
}*/

/*
public class Main{
    public static void main(String[] args){
        int n = 4;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}*/

/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();

        //System.out.print("Enter " + n +" elements : ");
        int arr[] = new int[n];

        for(int i = 0; i<n; i++){
            System.out.print("Enter Element in index number "+i+ " : ");
            arr[i] = sc.nextInt();
            System.out.println();
        }

        System.out.println("Your elements are : ");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}*/

/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sum=0,avg = 0, size;
        System.out.print("Enter the size of an array : ");
        //size = scan.nextInt();
        int arr[] = new int[size = scan.nextInt()];
        System.out.println("Enter the elemenets in array : ");
        for(int i = 0; i<size; i++){
            arr[i] = scan.nextInt();
        }
        for(int i = 0; i<size; i++){
            sum += arr[i];
        }
        System.out.println("Sum of the array is : "+ sum);
        avg = sum/arr.length;
        System.out.print("Average of the is : "+avg);
    }
}*/

/*

//Largest and Smallest of array
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int big, small, size;
        int arr[] = new int[size = scan.nextInt()];
        System.out.println("Enter the elements of array  : ");
        for(int i = 0; i<size; i++){
            arr[i] = scan.nextInt();
        }
        small = big = arr[0];
        for(int i = 0; i<size; i++){
            if(small > arr[i]){
                small = arr[i];
            }
        }
        for(int i = 0; i<size; i++){
            if(arr[i] > big){
                big = arr[i];
            }
        }
        System.out.println(big+" is the Largest of all");
        System.out.println(small+" is the Smallest fo all");
        scan.close();
    }
}*/

/*
//Count EVEN & ODD

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size, odd = 0, even = 0;
        System.out.print("Enter the size of an array : ");
        int arr[] = new int[size = sc.nextInt()];
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0) even++;
            else odd++;
        }
        System.out.println("There are "+odd+" ODD numbers and "+even+" EVEN numbers");
        sc.close();
    }
}*/

/*

//reverse an array
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");

        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter "+size+" Elements :");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Your elements : ");
        for(int i = 0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Array after reversing : ");
        for(int i = 0; i<size/2; i++){
            int first = arr[size-i-1];
            int last = arr[i];
            arr[i] = first;
            arr[size-i-1] = last;
        } 
        for(int i = 0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}*/

/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {5,6,4,7,3,2,9,1,8,0};
        System.out.println("Enter the element you need : ");
        int find = sc.nextInt();
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == find){
                System.out.println(find+" is in the index number : "+i);
                break;
            }
        }
    }
}
*/

/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("Enter the numebr : ");
        x = sc.nextInt();
        
        for(int i = 1, k = 1; i<=100.0; i++){
            for(int j = 1; j<=10; j++){
                if(i % j == x){
                    System.out.printf("%d\t:\t%d/%d\t=\t%d\n",k, i, j, i%j);
                }
            }
        }
    }
}*/


/*
// Preetham -> 
// mahteerP

import java.util.*;
public class Main{
    public static void main(String[] app){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        StringBuilder sbCopy = new StringBuilder(sb);
        for(int i = 0; i<sb.length() / 2; i++){
            char firstchar = sb.charAt(i);
            char lastchar = sb.charAt(sb.length() - i - 1);

            sb.setCharAt(i, lastchar);
            sb.setCharAt(sb.length() - i - 1, firstchar);
        }
        if(sb.compareTo(sbCopy) == 0){
            System.out.println(sb+" Is pelendrome");
        }else{
            System.out.println(sbCopy+" Is not pelendrome");
        }
    }
}*/

/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        int consonant = 0, vowal = 0, digits = 0, spaces = 0, alpha = 0, others = 0;
        
        // String Builders:
        StringBuilder vow = new StringBuilder();
        StringBuilder cons = new StringBuilder();
        StringBuilder dig = new StringBuilder();
        StringBuilder spac = new StringBuilder();
        StringBuilder alph = new StringBuilder();
        StringBuilder oth = new StringBuilder();

        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i), chh;
            //char ch = Character.toLowerCase(str.charAt(i));
            
            if(Character.isAlphabetic(ch)){
                alpha++;
                alph.append(ch);
                chh = Character.toLowerCase(str.charAt(i));
                
                if(chh == 'a' || chh == 'e' || chh == 'i' || chh == 'o' || chh == 'u'){
                    vowal++;
                    vow.append(ch);

                }else{
                    consonant++;
                    cons.append(ch);

                }
            }else if(ch == ' '){
                spaces++;
                spac.append(ch);

            }else if(Character.isDigit(ch)){
                digits++;
                dig.append(ch);

            }else{
                others++;
                oth.append(ch);

            }
        }
        sc.close();

        System.out.println("ALPHABETS\t\t: "+alpha+"\t: "  +alph);
        System.out.println("VOWALS\t\t\t: "+vowal+"\t: "  +vow);
        System.out.println("CONSONANTS\t\t: "+consonant+"\t: "  +cons);
        System.out.println("DIGITS\t\t\t: "+digits+"\t: "  +dig);
        System.out.println("SPACES\t\t\t: "+spaces+"\t: "  +"space");
        System.out.println("OTHER CHARACTERS\t: "+others+"\t: "+oth);

    }

}*/

/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);

        for(int i = 0; i<sb.length(); i++){
            char ch = sb.charAt(i);
            int ascii = ch - 32;
            ch = (char) ascii;
            sb.setCharAt(i, ch);
        }

        System.out.println(sb);
        
        sc.close();
    }
}*/

/*
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a strig to check the frequency : ");
        String str = sc.nextLine();
        int frequency[] = new int[26];

        int count = 0;

        for(int i = 0; i<str.length(); i++){
            char ch = Character.toLowerCase(str.charAt(i));
            count = ch - 71;
            for(int j = 0; j<26; j++){
                if(count == j+26){
                    frequency[j]++;
                }
            }
        }

        for(int i = 0, j = 65; i<26; i++, j ++){
            if(frequency[i] == 0) continue;
            char ch = (char) j;
            System.out.print(ch+"\t");
        }

        System.out.println();

        for(int i = 0, j = 65; i<26; i++, j ++){
            if(frequency[i] == 0) continue;
            System.out.print("^\t");
        }

        System.out.println();


        for(int i = 0, j = 65; i<26; i++, j ++){
            if(frequency[i] == 0) continue;
            System.out.print(frequency[i]+"\t");
        }

        sc.close();
    }
}*/

/*
import java.util.*;
public class Main{
    public static String CheckForPrime(int x){
        String is = Integer.toString(x) + " is a prime number";

        String not = Integer.toString(x) + " is not prime";

        for(int i = 2; i<=x/2; i++){
            if(x % i == 0){
                return not;
            }
        }
        return is;
    }

    public static int factor(int x){
        int fact = 1;
        for(int i = 2; i<=x; i++){
            fact*=i;
        }
        return fact;
    }

    public static int max(int x, int y){
        return x > y? x:y;
    }

    public static int reverse(int n){
        int rem, rev = 0;
        while(n != 0){
            rem = n%10;
            rev = rev * 10 + rem;
            n/=10;
        }
        return rev;
    }

    public static void readArray(int[] arr){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    public static void writeArray(int [] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void bubbleSort(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            for(int j = 0; j<arr.length-i-1; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void SelectionSort(int arr[]){
        for(int i = 0; i<arr.length; i++){
            int smallestIndex = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j] < arr[smallestIndex]){
                    smallestIndex = j;
                }
            }
            // swap
            int temp = arr[smallestIndex];
            arr[smallestIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter the size of the array : ");
        size = sc.nextInt();
        
        System.out.print("Enter the elements of array : ");
        int arr[] = new int[size];
        readArray(arr);

        //bubbleSort(arr);
        SelectionSort(arr);

        System.out.print("Array after Bubble Sorting : ");
        writeArray(arr);
        sc.close();
    }
}*/

/*
import java.util.*;
public class SelectionSort{

    public static void readElements(int arr[], int n){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    public static void writeElements(int arr[], int n){
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        //read elements in array :
        System.out.print("Enter the elements : ");
        readElements(arr, size);

        for(int i = 0; i<arr.length-1; i++){
            int small = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[small] > arr[j]){
                    small = j;
                }
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }

        //write elements in array :
        System.out.print("Your array after sorting : ");
        writeElements(arr, size);

        sc.close();
    }
}*/

/*
import java.util.*;
public class InsertionSort{

    public static void ReadElements(int arr[], int n){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            
        }
        sc.close();
    }

    public static void writeElements(int arr[], int n){
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the arrya  : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.print("Enter the elements in Array : ");
        ReadElements(arr, size);

        for(int i = 1; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }

        writeElements(arr, size);
        sc.close();
    }
} */
/* 
public class Main{

    public static void Sum(int n, int sum){
        if(n == 0){
            return;
        }
        sum+=n;
        System.out.println(sum);
        Sum(n-1,sum);
    }

    public static void Factor(int n, int product){
        if(n == 1){
            System.out.println(product);
            return;
        }
        product *=n;
        Factor(n-1, product);
    }

    public static void fibonachi(int a, int b, int n){
        int c;
        if(n == 0) return ;
        a = 1;
        b = a;
        c = a + b;
        b = c;
        System.out.println(c);
        n--;
        fibonachi(a, b, c);
    }
    public static void main(String[] args){
        int n = 5;
        Factor(n, 1);
    }
}*//*
import java.util.*;
public class Main{

    public static void printnum(int n,int i){
        if(i == n+1){
            return;
        }
        System.out.println(i);
        printnum(n, i+1);
    }

    public static void NTo1(int n){
        if(n == 0) return;
        
        System.out.println(n);
        NTo1(n-1);
    }

    public static int SumOfNum(int n, int sum){
        if(n == 0){
            return sum;
        }
        sum+=n;
        return SumOfNum(n-1, sum);
    }

    public static int fact(int n, int pro){
        if(n == 0){
            return pro;
        }
        pro*=n;
        return fact(n-1, pro);
    }
    public static void countdown(int n){
        if(n < 0){
            return;
        }
        System.out.println(n);
        countdown(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int n = sc.nextInt();
        //System.out.println(fact(n, 1));
        countdown(n);
        sc.close();
    }
} */
/*
public class Main{
    public static void main(String[] args){
        String str = "Computer";
        String strr = "Science";
        System.out.println(str.charAt(4));
        System.out.println(str + strr);
        System.out.println(str.length());
        System.out.println(str.replace('o', 'e'));
        System.out.println(str.substring(4, str.length()));
    }
}*/
/*
public class Main{
    public static void main(String[] args){
        int x = 10;
        int y = 34;
        float z = y/x;
        System.out.println(z);
        int xx = x * (int)z;
        System.out.println(xx);
    }
}*/

/*
public class Main{
    public static void main(String[] args){
        int a = 20;
        int b = 45;
        int max = Math.max(a, b);
        int mini = Math.min(a, b);
        System.out.println("Maximum of "+ a + " & " + b + " is "+ max);
        System.out.println("Minimum of " + a + " & " + b + " is " + mini);
        int random = (int) (Math.random() * 100);
        System.out.println("An a Random number is : "+ random);
    }
}*/
/* 
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] marks = {45, 64, 93, 89};
        while(true){
            System.out.print("enter the index number you want to access :");
            int index= sc.nextInt();
            try{
                System.out.println("Index : "+index+" marks is : "+ marks[index-1]);
            } catch (Exception exception){
                System.out.println("No marks are in index : "+index);
            }
        }
    }
}*/

/*
// mini project (guess the number);

import java.util.*;
public class Main{

    static void guess(int x){
        Scanner sc = new Scanner(System.in);
        int attempts = 1;
        System.out.println("|Game is baggen, All the best|");
        
        while(true){
            System.out.println("+============================+");
            
            System.out.print("|Guess the number :");
            
            int y = sc.nextInt();
            System.out.println("\t\t|");
            //System.out.println("|                            |");

            System.out.println("+============================+");
            if(y != x){
                if(y > x) System.out.println("Less then your Guess");
                else System.out.println("Grater then your Guess");
                attempts++;
            }else{
                System.out.println("Congraths you Guessed it wright!!");
                System.out.println("You guessed it in "+attempts+ " attempts");
                break;
            }
        }
        sc.close();
    }
    public static void main(String[] args){
        System.out.println("+============================+");
        int random = (int) (Math.random()*100);
        guess(random);
    }
}*/
/*
import java.util.*;
public class Main{

    public static int power(int x, int n, int temp){
        if(n == 1 || n == 0){
            return x;
        }
        x*=temp;
        return power(x, n-1, temp);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        int x = sc.nextInt(), n = sc.nextInt();
        int temp = x;
        //System.out.println(power(x, n, temp));
        if(n % 2 == 0){
            for(int i = 1; i<=n/2; i++){
                
            }

        }
        sc.close();
    }
}*/
/*
import java.util.Scanner;
public class Main{

    //Calculate SUM of digit using recursive function:
    public static int SumOfDigit(int number, int sum){
        if(number == 0) return sum;
        sum += number%10;
        number/=10;
        return SumOfDigit(number, sum);
    }

    //Reverse a number using recursion:
    public static int ReverseNumber(int num, int reverse){
        int reminder;
        if(num <= 0)return reverse;
        reminder = num%10;
        reverse = reverse * 10 + reminder;

        return ReverseNumber(num/10, reverse);
    }

    //Count number of digits:
    public static int CountDigits(int num, int count){
        if(num == 1) return count;
        count++;
        return CountDigits(num/10, count);
    }

    // Calculate the power of the number :
    public static long CalculatePower(int x, int n,int temp){
        if(n==1) return x;
        x*=temp;
        System.out.println("x = "+x+"\t| n = "+n);
        return CalculatePower(x, n-1, temp);
    }

    //Check for pailandrome : 
    public static boolean CheckForPailandrome(int num, int reverse, int dupnum){
        if(num == 0)return reverse == dupnum? true : false;
        int rem = num%10;
        reverse = reverse * 10 + rem;
        return CheckForPailandrome(num/10, reverse, dupnum);
    }
    /*===================================================================
    //Arrays 

    //Find sum of elements in an array :
    public static int SumOfElements(int arr[], int sum, int i){
        if(i == arr.length) return sum;
        sum += arr[i];
        return SumOfElements(arr, sum, i+1);
    }
    
    // Read elements in array : 
    public static void readElements(int arr[], int i){
        Scanner sc = new Scanner(System.in);
        if(i == arr.length) return; 
        System.out.print("Enter element of :"+arr.length+"/"+(i+1)+" : ");
        arr[i] = sc.nextInt();
        readElements(arr, i+1);
    }

    //Write elements of array :
    public static void writeElements(int arr[], int i){
        if(i == arr.length) return;
        System.out.print(arr[i]+" ");
        writeElements(arr, i+1);
    }

    public static int MaximumValue(int arr[], int max, int i){
        if(i == arr.length) return max;
        max = arr[0];
        if(arr[i] > max) max = arr[i];
        return MaximumValue(arr, max, i+1);
    }

    public static int CheckIndex(int arr[], int i, int index){
        if(i == arr.length) return index;
        if(MaximumValue(arr, 0, 0) == arr[i]) index = i;
        return CheckIndex(arr, i+1, index);
    }

    public static boolean CheckForSort(int arr[], int i){
        if(arr.length == i-1) return true;
        if(arr[i] > arr[i+1]) return true;
        return CheckForSort(arr, i+1);
    }
    /*===================================================================
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        readElements(arr, 0);
        writeElements(arr, 0);
        System.out.println("The sum of the Array is : "+SumOfElements(arr, 0, 0));
        System.out.println("Maximum value of an array is : "+MaximumValue(arr, 0, 0)+" on the index number : "+CheckIndex(arr, 0, 0));
        if(CheckForSort(arr, 0)){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
        sc.close();
    }
}*/
/*
import java.util.*;
class Student{
    String name;
    String cource;
    int id;
    int year;
    public void printinfo(){
        System.out.println("Student name is :"+this.name);
        System.out.println("Student is currently perceving : "+this.cource);
        System.out.println("Student id is : "+this.id);
        System.out.println("Student is now studying in "+this.year+" year");
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student veer = new Student();
        System.out.print("Enter the name if the student : ");
        veer.name = sc.nextLine();
        System.out.print("What is studing perciving/ studying : ");
        veer.cource = sc.nextLine();
        System.out.print("Enter Student ID :");
        veer.id = sc.nextInt();
        System.out.print("In whihc year is Student Studying : ");
        veer.year = sc.nextInt();

        veer.printinfo();
    }
}*/
/*import java.util.Scanner;
class Person{
    String name;
    int age;
    double hignt;

    public void printInfo(){
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
        System.out.println("Hight : "+this.hignt);
    }

    Person(){
        System.out.println("Function has been called");
        System.out.println("Enter the imformation of a person : ");
        System.out.println("1. Name\n2. Age\n3. Hight");
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Person jat = new Person();
        System.out.print("Enter the Name of the person : ");
        jat.name = sc.nextLine();

        System.out.print("Enter the Age of the person : ");
        jat.age = sc.nextInt();

        System.out.print("Enter the Hight of the person : ");
        jat.hignt = sc.nextDouble();

        jat.printInfo();
    }
}*/

//Level 1 — Class & Object Fundamentals
/*
*Create a Student class with:
*name   Done
*rollNo Done
*marks  Done
===================
*Write methods to:
*input details      Done
*display details    Done
*calculate grade    Pending...
*/

// 1. STUDENT CLASS
/*import java.util.Scanner;
class Student{
    String name;
    int rollNo;
    int []marks = new int[4];
    String Subjects[] = {"MF\t","Java\t","DSA\t","OS\t"};
    // Input Details
    public void InputDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Full Name : ");
        this.name = sc.nextLine();

        System.out.print("Enter Roll Number : ");
        this.rollNo = sc.nextInt();

        System.out.println("\nEnter the marks of 4 subjects : ");
        System.out.println("--------------------------------------------");
        for(int i = 0; i<4; i++){
            System.out.print(this.Subjects[i]+" : ");
            this.marks[i] = sc.nextInt();
        }
    }

    Student(){
        System.out.println("Government First Grade College, Shikaripura : \n");
    }

    public void CalculateGrade(){
        int sum = 0;
        for(int i=0; i<4; i++){
            sum+=this.marks[i];
        }
        float result = (float) sum/4;
        if(result == 100){
            System.out.println("A+");
        }else if(result >=90 && result <100){
            System.out.println("A");
        }else if(result >=70 && result <90){
            System.out.println("B");
        }else if(result >=40 && result <70){
            System.out.println("C");
        }else if(result >=35 && result <=40){
            System.out.println("D");
        }else{
            System.out.println("Fail");
        }
    }

    public void DisplayDetails(){
        System.out.println("\nStudent Details : \n------------------");
        System.out.println("Name : "+this.name);
        System.out.println("Roll Numeber : "+this.rollNo);
        System.out.println("\nMarks of 4 Subject : ");
        System.out.println("--------------------------------------------");
        for(int i = 0; i<4; i++){
            System.out.println(this.Subjects[i]+" : "+this.marks[i]);
        }
        System.out.println("--------------------------------------------");

        System.out.print("Result Status : ");
        CalculateGrade();
    }
}

public class Main{
    public static void main(String[] args){
        Student veeru = new Student();
        veeru.InputDetails();
        veeru.DisplayDetails();
    }
}*/

// 2. RECTANGLE CLASS
/*
import java.util.Scanner;
class Rectangle{
    float length;
    float width;

    float area, perimater;
    Rectangle(){
        System.out.println("\nWelcome to shape Calculation!");
        System.out.println("-------------------------------------");
    }
    
    public void CalculateShape(){
        area = length * width;
        perimater = (float)2*(length + width);
    }

    public void CalArea(){
        area = length * width;
    }

    public void CalPerimater(){
        perimater = (float)2*(length + width);
    }

    public void area(){
        System.out.println("Area of the Rectangl is : "+this.area);
    }

    public void perimater(){
        System.out.println("Perimater of the Rectange is : "+this.perimater);
    }

    public void PrintAreaNPerimater(){
        System.out.println("Area of the Rectangle is : "+this.area);
        System.out.println("Perimeter of the Rectangle is : "+ this.perimater);
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Rectangle r1 = new Rectangle(); 
        System.out.print("Enter the Length & width of the 1st Rectangle : ");
        r1.length = sc.nextFloat();
        r1.width = sc.nextFloat();
        r1.CalArea();
        
        
        Rectangle r2 = new Rectangle(); 
        System.out.print("Enter the Length & width of the 2nd Rectangle : ");
        r2.length = sc.nextFloat();
        r2.width = sc.nextFloat();
        r2.CalArea();
        
        Rectangle r3 = new Rectangle(); 
        System.out.print("Enter the Length & width of the 3rd Rectangle : ");
        r3.length = sc.nextFloat();
        r3.width = sc.nextFloat();
        r3.CalArea();
        
        Rectangle r4 = new Rectangle();
        System.out.print("Enter the Length & width of the 4th Rectangle : ");
        r4.length = sc.nextFloat();
        r4.width = sc.nextFloat();
        r4.CalArea();

        if(r1.area > r2.area && r1.area > r1.area && r1.area > r3.area && r1.area > r4.area){
            System.out.println("First Rectangle has the bigger Area which is : "+r1.area);
        }else if(r2.area > r3.area && r2.area > r4.area){
            System.out.println("Second Rectangle has the bigger Area which is : "+r2.area);
        }else if(r3.area > r4.area){
            System.out.println("Third Rectangle has the bigger Area which is : "+r3.area);
        }else{
            System.out.println("Fourth Rectangle has the bigger Area which is : "+r4.area);
        }

        sc.close();
    }
}*/


// 3. BANK ACCOUNT

/*import java.util.Scanner;
class BankAccount{
    int[] accountNumber = new int[10];
    String[] holderName = new String[10];
    float[] balance = new float[10];
    Scanner sc = new Scanner(System.in);

    //DEPOSIT
    public void deposit(float amount, int AcNo){
        for(int i = 0; i<10; i++){
            if(AcNo == this.accountNumber[i]){
                this.balance[i] += amount;
            }
        }
        System.out.println("Amount Sucessfully DEPOSITED. Thank you for choosing out survice");
    }

    //WITHDRAW
    public void withdraw(float amount, int AcNo){
        int i = 0;
        for(; i<10; i++){
            if(AcNo == this.accountNumber[i]){
                break;
            }
        }
        if(this.balance[i] < amount){
            System.out.println("Your Balance is low. Please try again or check your balance by selecting the option 3");
        }else if(amount <= 0){
            System.out.println("Your can't deposit less then or equal to  0");
        }else{  
            this.balance[i] -= amount;
        }
    }

    //CHECK BALANCE
    public void displayBalance(int AcNo){
        for(int i = 0; i<10; i++){
            if(AcNo == this.accountNumber[i]){
                System.out.println("Your accoutn Current balance is : "+this.balance[i]);
            }
        }
    }

    //DISPLAY USER INFO (with Account Number)
    public void displayHolderInfo(int AcNo){
        int i = 0;
        for(; i<10; i++){
            if(AcNo == this.accountNumber[i]);
            break;
        }
        System.out.println("ACCOUNT NUMBER : "+this.accountNumber[i]);
        System.out.println("ACCOUNT HOLDER NAME : "+this.holderName[i]);
        System.out.println("BANK BALANCE : "+this.balance[i]);
    }
    //DISPLAY USER INFO (with Account Holder Name)
    public void displayHolderInfo(String name){
        int i = 0;
        for(; i<10; i++){
            if(name == this.holderName[i]);
            break;
        }
        System.out.println("ACCOUNT NUMBER : "+this.accountNumber[i]);
        System.out.println("ACCOUNT HOLDER NAME : "+this.holderName[i]);
        System.out.println("BANK BALANCE : "+this.balance[i]);
    }
}
public class Main{
    public static BankAccount canara = new BankAccount();
    //Check AC NO
    public static boolean verifyAcNo(int AcNo){
        boolean validNumber = false;
        for(int i = 0; i<canara.accountNumber.length; i++){
            if(canara.accountNumber[i] == AcNo){
                validNumber = true;
                break;
            }
        }
        return validNumber;
    }

    public static void main(String[] args){

        //ALLOT BANK NUMBER : 
        for(int i = 100500200, j = 0; j<10 ; i++, j++){
            canara.accountNumber[j] = i;
        }

        //ALLOCATE HOLDER NAMES
        canara.holderName[0] = "jonu";
        canara.holderName[1] = "veer";
        canara.holderName[2] = "rock";
        canara.holderName[3] = "tony";
        canara.holderName[4] = "thor";
        canara.holderName[5] = "modi";
        canara.holderName[6] = "rahul";
        canara.holderName[7] = "yesh";
        canara.holderName[8] = "Elon Musk";
        canara.holderName[9] = "ravi";
        Scanner sc = new Scanner(System.in);
        
        int AccountNumber = canara.accountNumber[0];

        boolean currentAccount = false;
        int countCurrentAc = 0;
        while(true){
            int option = 2;
            while(true){
                if(countCurrentAc == 0 ){
                    break;
                }else{
                    System.out.print("\nDo you want to continue with the same Account?\nEnter (1) to Continue\nEnter (2) to Chance Account\nEnter your selection : ");
                    option = sc.nextInt();
                    if(option == 1){
                        currentAccount = true;
                        break;
                    }else if(option == 2){
                        currentAccount = false;
                        break;
                    }else if(option < 1 || option > 2){
                        System.out.println("Invalid option. please Try again");
                    }
                }
            }
            countCurrentAc++;
            while(true){

                if(option == 2){
                    System.out.print("\nEnter the Account Number : ");
                    AccountNumber = sc.nextInt();   
                }

                if(verifyAcNo(AccountNumber) == false){
                    System.out.println("No such account exist, please check the Account Number");
                }else{
                    break;
                }
            }
            float add, remove;
            System.out.print("1. DEPOSIT\n2. WITHDRAW\n3. CHECK BALANCE\n4. CHECK ACCOUNT INFO\n5. EXIT\n\tSelect one of the Option : ");
            option = sc.nextInt();
            switch(option){
                case 1 : 
                    System.out.print("Enter the amount : ");
                    add = sc.nextFloat();
                    canara.deposit(add, AccountNumber);
                    break;

                case 2 :
                    System.out.print("Enter the amount : ");
                    remove = sc.nextFloat();
                    canara.withdraw(remove, AccountNumber);
                    break;
                
                case 3 :
                    canara.displayBalance(AccountNumber);
                    break;

                case 4 :
                    canara.displayHolderInfo(AccountNumber);
                    break;

                case 5 :
                    System.out.println("Thank you for choosing out service!\n\t\tHave a nice day");
                    break;
                
                default : System.out.println("Invalid selectin. please try again");
            }
            if(option == 5){
                break;
            }
        }
    }
}*/

// 4. EMPLOYEE PATROLL SySTEM

/*Create an Employee class with:
* id
* name
* salary
    Use:
* default constructor
* parameterized constructor
    Methods:
* calculateAnnualSalary()*/
/*
import java.util.*;
class EmployeePayRoll{
    String[] id = new String[5];
    String[] name  = new String[5];
    int[] salary = new int[5];

    //INILASIZE EMPLOY ID :
    public void inislizeId(){
        final String preId = "U06GK25S009";
        for(int i = 0; i<5; i++){
            this.id[i] = preId+Integer.toString(i+3);
            //System.out.println(this.id[i]);
        }
    }

    // RETURN INDEX NUMBER :
    public int validIndex(String id){
        int index = 0;
        while(index < 5){
            if(this.id[index].compareTo(id) == 0){
                break;
            }
            index++;
        }
        return index;
    }

    //VERIFY EMPLOYEE ID : 
    public boolean verifyId(String id){
        int i = 0;
        while(i < 5){
            if(this.id[i].compareTo(id) == 0){
                return true;
            }
            i++;
        }
        return false;
    }
}

public class Main{
    public static Scanner sc = new Scanner(System.in);
    public static EmployeePayRoll ravi = new EmployeePayRoll();
    

    public static void main(String[] args){
        EmployeePayRoll employ = new EmployeePayRoll();
        employ.inislizeId();
        String id = new String();
        int idIndex = 0;
        int option = 0;
        int count = 0;
        while(true){
            while(true){        
                if(count == 0){
                    count++;
                    break;
                }else{
                    System.out.print("\t1. CURRENT EMPLOY\n\t2. CHANGE EMPLOY\nSELECT THE OPTION : ");
                    option = sc.nextInt();
                    break;
                }
            }
            while(true){
                if(option == 1){
                    break;
                }
                System.out.print("Enter the Employ ID : ");
                id = sc.next();
                if(employ.verifyId(id)){
                    idIndex = employ.validIndex(id);
                    break;
                }else{
                    System.out.println("Invalid ID. Please check the ID once again and make sure that the letters are in the CAPITAL letters and try again\n");
                }
            }


        }
        
        
    }
}*/
/*import java.util.*;

public class Main{
	public static int first = 0;
	public static int last = 0;
	// Check wether the array is sorted
	public static void SortCheck(int arr[]){
		boolean Sorted = true;
		if(arr[0] > arr[1]){
			for(int i = 0; i<arr.length-1; i++){
				if(arr[i] < arr[i+1]){
					System.out.println("Array is not Sorted");
					Sorted = false;
					break;
				}
			}
			if(Sorted){
				System.out.println("Array is sorted in Assending order");
			}
		}else{
			for(int i = 0; i<arr.length-1; i++){
				if(arr[i] > arr[i+1]){
					System.out.println("Array is not Sorted");
					Sorted = false;
					break;
				}
			}
			if(Sorted){
				System.out.println("Array is Sorted in Dissending order");
			}
		}
	}
	static void CheckForSort(int arr[], int i){
		boolean sorted = true;
		if(i+1 == arr.length && sorted == true){
			System.out.println("Sorted");
			return;
		}
		if(arr[0] > arr[1]){	
			if(arr[i] < arr[i+1]){
				sorted = false;
				System.out.println("not sorted");
				return;
			}
			CheckForSort(arr, i+1);
		}else{
			if(arr[i] > arr[i+1]){
				sorted = false;
				System.out.println("not sorted");
				return;
			}
			CheckForSort(arr, i+1);
		}
		
	}
	static void SearchForElement(int arr[], int i, int x){
		if(arr[i] == x){
			System.out.println(x+" is in the index number : "+i);
			return;
		}
		if(arr.length-1 == i && arr[i] != x){
			System.out.println(x+" is no where in the array");
			return;
		}
		SearchForElement(arr, i+1, x);
	}
	// swap
	// will be solved later
	static void revstr(StringBuilder str, int i){
		if((str.length()-1)/2 == i){
			System.out.println(str);
			return;
		}
		char first = str.charAt(i);
		char last = str.charAt((str.length())-1);

		str.setCharAt(i, last);
		str.setCharAt((str.length())-1, first);
		revstr(str, i+1);
	}
	// simple reverse pringing:
	static void revstrs(String str, String newStr, int i){
		if(i < 0){
			System.out.println(newStr);
			return;
		}
		newStr+= str.charAt(i);
		revstrs(str,newStr, i-1);
	}

	// simple reverse printing 2.0
	public static void two_oh(String str, int i){
		if(i < 0){
			return;
		}
		System.out.print(str.charAt(i));
		two_oh(str, i-1);
	}

	//track the accurance (enter and exit)
	public static void accurance(String str,char targate, int i){
		if(str.length()-1 == i){
			System.out.println(targate+" first accures in the index number "+(first-1)+", and in the end accurse in the index number "+last);
			return;
		}
		if(targate == str.charAt(i) && first == 0){
			first = i+1;
		}else{
			last = i;
		}
		accurance(str, targate, i+1);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter a string : ");
		//String str = sc.next();
		// (n,r) = n!/n!-r!
		System.out.print("Enter a number for N");//=========================================================================.
		int n = sc.nextInt();
		System.out.print("Enter a number for R");
		int r = sc.nextInt();
		int nFact = 1, rFact = 1;
		for(int i = 1; i<=n; i++){
			nFact*=i;
		}
		for(int i = 1; i<=r; i++){
			rFact*=i;
		}
		int nMrFact =1;
		for(int i = 1; i<=n - r; i++){
			nMrFact*=i;
		}
		System.out.println("factoral of n = "+nFact);
		System.out.println("factoral of r = "+rFact);
		int parmuntation = (nFact)/(nMrFact);
		System.out.println(parmuntation);
		sc.close();
	}
}
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the String : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in array : ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        //sort
        for(int i =0; i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        //print elements
        System.out.println("Array after sorting : ");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = new String();
        System.out.print("Enter a String : ");
        str = sc.nextLine();
        System.out.println();System.out.println();
        System.out.println("Your String \t\t: "+str);
        System.out.print("Upper cased String \t: ");
        for(int i = 0; i<str.length(); i++){
            int caps = (str.charAt(i) - 32);
            if(caps >= 65 && caps <= 90) System.out.print((char)caps);
            else System.out.print(str.charAt(i));
        }
        sc.close();
    }
}
import java.util.*;
class LeanerSearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i = 0; i<arr.length; i++){
            System.out.print("Enter the element for index : "+i+" : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Your element is : ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.print("Enter the key element : ");
        int key = sc.nextInt();
        for(int i = 0; i<arr.length+1; i++){
            
            if(i == arr.length+1){
                System.out.println(key + " not found in the array.");
                break;
            }

            if(arr[i] == key){
                System.out.println(key+" is in the index number : "+i);
                break;
            }
            sc.close();
        }
    }
}*/

/*import java.util.*;
class Main{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int key, keyp = 0;
        boolean yesKey = false;
        int arr[] = {2, 5, 9, 12, 15, 20};
        System.out.print("Enter the key element : ");
        key = sc.nextInt();
        int low = 0, high = arr.length - 1;
        for(int i = 0; i<(arr.length/2); i++){
            int mid = (high + low) / 2;
            if(arr[mid] == key){
                keyp = mid;
                yesKey = true;
                break;
            }
            if(arr[mid] > key){
                high = mid-1;
            }

            if(arr[mid] < key){
                low = mid+1;
            }
        }
        if(yesKey)
            System.out.println(key +" is in the index number : "+keyp);
        else
            System.out.println(key +" is not avilable");
        sc.close();
    }
}
import java.util.*;

class Student{
    int rNo;
    float avg;
    String name;

    Student(int rNo, float avg, String name){
        this.rNo = rNo;
        this.avg = avg;
        this.name = name;
    }

    Student(Student copy){
        this.rNo = copy.rNo;
        this.name = copy.name;
        this.avg = copy.avg;
    }
}
class Main{

    public static void BinarySearch(int key, int arr[]){
        System.out.println("I am IN!\n");
        //[2, 4, 6, 8, 10];
        int mid = 0, high, low, validKey = 0;

        for(int i = 0; i<arr.length/2; i++){
            System.out.println("key : "+key+" Mid : "+arr[mid]);

            high = arr.length-1;
            low = 0;
            mid = (high+low)/2;

            if(arr[mid] == key){
                validKey = 1;
                return;
            }

            if(key < arr[mid]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        if(validKey == 0){
            System.out.println("Failed to find "+key+" element in the array");
        }else{
            System.out.println(key+" is in the index number : "+mid);
        }

        System.out.println("\nI am OUT!");
    }

    public static void PrintTables(int from, int to){                       
        if(from > to){                       
            System.out.println("FROM Table must be Less then TO Table");                       
            return;                       
        }                       
        for(int i = 1; i<=10; i++){                       
            for(int j = from; j<=to; j++){                       
                System.out.print(j+" x "+i+" = "+i*j+"\t");                       
            }                       
            System.out.println();                       
        }                       
    }                       

    public static void main(String[] args){                       

        Scanner sc = new Scanner(System.in);                       
        int arr[] = {2,5,8,12,55};                       
        System.out.print("Enter the key element : ");                       
        int key = sc.nextInt();                       

        BinarySearch(key, arr);                       

        sc.close();                       
    }                       
}
class Student{
    int id;
    String name;
    float cgpa;

    Student(int id, String name, float cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    Student(){
        this (3343, "Veerendra", 9.4f);
    }


}

class Demo{
    final int num = 20;
    String name = new String();

    Demo(String name){
        this.name = name;
    }
}

public class Main{

    public static void main(String args[]){
        final Demo d1 = new Demo("ramu");
        System.out.println("name = "+d1.name); 
    }


    int arr[] = {4,5,3,2,6};
}*/
/*
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name : ");
        // String yourName = sc.nextLine();
        String yourName = "lavu";
        StringBuilder name1 = new StringBuilder(yourName);
        int lenName1 = name1.length();

        System.out.print("Enter Your Love's Name : ");
        // String love = sc.nextLine();
        String love = "veeru";
        StringBuilder name2 = new StringBuilder(love);
        int lenName2 = name2.length();

        //int LongestString = yourName.length() > love.length()? yourName.length():love.length();
        // HELLO
        // WORLD
        // Same == 'O' && 'L';
        System.out.println("your name : "+lenName1+"\n"+"your love : "+lenName2);
        for(int i = 0; i<lenName1; i++){
            for(int j = 0; j<lenName2; j++){
                
                // if((name1.charAt(i) == ' ') && (name2.charAt(j) == ' ')){
                //     //name1.delete(i,i+1); name2.delete(j,j+1);
                //     continue;
                // }

                if(name1.charAt(i) == name2.charAt(j)){                   
                    name1.delete(i,i+1);                   
                    name2.delete(j,j+1);                   
                    lenName1--;lenName2--;                   
                }                   
            }                   
        }
        int finalLen = name1.length() + name2.length();

        StringBuilder flam = new StringBuilder("flame");

        for(int i = 0; i<6; i++){
            System.out.println(flam.charAt(finalLen+1));
            flam.delete(finalLen, finalLen+1);
        }
        System.out.println(flam);
    }
}*//*
import java.util.Scanner;
import AccessStudent.AddInfo;
import AccessStudent.Student;

public class Main{
    static int x = 10;
    public static void main(String[] args){
        
    String name;
    int id;
    float marks;
    boolean result;
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println(Main.x);
    
    System.out.print("Enter the NAME of the Student : ");
    name = sc.nextLine();
        AddInfo.putinfo(name);
        
        System.out.print("Enter the ID of the Student : ");
        id = sc.nextInt();
        AddInfo.putinfo(id);
        
        System.out.print("Enter the MARKS of the Student : ");
        marks = sc.nextFloat();
        AddInfo.putinfo(marks);
        
        System.out.print("Enter the RESULT of the Student : ");
        result = sc.nextBoolean();
        AddInfo.putinfo(result);
        
        Student.DisplayInfo();
        sc.close();
    }
}
public class Main{
    //Bubble sortting : 
    static void DisplayArray(int arr[]){
        for(int i = 0 ; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void BubbleSort(int arr[], int n, int i, int j){
        if(i == n-1){
            DisplayArray(arr);
            return;
        }
    }
    public static void main(String[] args){
        
    }
}*/
/*
import java.util.*;
import Packages.first;

class ExceptionHandling{

    first ss = new first(2);

    int x, y;
    float a, b;

    ExceptionHandling(int x, int y){
        this.x = x;
        this.y = y;
    }

    int AddInt(int x, int y){
        return x+y;
    }

    float AddFloat(int x, int y){
        return x + y;
    }

}




class Main{
    
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        
        int x = 0, y = 0;
        String a = new String("hello bro");
        System.out.println(a);
        
        String b = a.toUpperCase();
        System.out.println(b);

        System.out.print("Enter 2 numbers : ");
        try{
            x = sc.nextInt();
            y = sc.nextInt();
        }catch(InputMismatchException e){
            float fx = (float) x;
            float fy = (float) y;
            System.out.println((fx+fy));
        }
        System.out.println((x+y));


        sc.close();
    }
}
class Main{
    // operations : + - * / ^
    static double compute(char ch, double op1, double op2){
        switch(ch){
            case '+' : return op1+op2;
            case '-' : return op1-op2;
            case '*' : return op1*op2;
            case '/' : return op1/op2;
            case '^' : return Math.pow(op1, op2);
        }
        return 0.0;
    }

    public static void main(String[] args) {
        int top = -1;
        StringBuilder postfix = new StringBuilder("34+2*233/+");
        double s[] = new double[40];
        char symbol = ' ';
        double result, op1, op2;

        for(int i = 0; i<postfix.length(); i++){
            symbol = postfix.charAt(i);
            if(Character.isDigit(symbol)){
                s[++top] = (double)((int)symbol - (int)'0');
            }else{
                op2 = s[top--];
                op1 = s[top--];
                result = compute(symbol, op1, op2);
                s[++top] = result;
            }
        }
        result = s[top--];
        System.out.println("The result is "+result);

        for(int i = 0; i<s.length; i++){
            if(s[i] == 0){
                break;
            }
            System.out.println(s[i]);
        }
    }
}*//*
import java.util.Scanner;
public class Main{
    static int rear = -1;
    static int front = -1;

    //enqueue();
    //dequeue();
    //display() / peek();
    //isEmpty() / isFull(); | (Optional)

    static final int MAX = 10;

    static int element[] = new int[MAX];

    static void enqueue(int data){
        if(rear == MAX-1){
            System.out.println("Over Flow");
            return;
        }else if(rear == -1 && front  == -1){
            rear = front = 0;
            element[rear] = data;
        }else{
            rear++;
            element[rear] = data;
        }
    }

    static void dequeue(){
        if(front  == -1){
            System.out.println("Under Flow");
        }else if(front == rear){
            element[front] = 0;
            front = rear = -1;
        }else{
            element[front] = 0;
            front++;
        }
    }

    static void display(){
        if(rear == -1 && front == -1){
            System.out.println("\nTHE QUEUE IS EMPTY\n");
        }else{
            System.out.println("Front : "+element[front]);
        }
    }

    static void peek(){
        if(rear == -1){
            System.out.println("\nTHE QUEUE IS EMPTY\n");
        }else{
            System.out.println("Rear : "+element[rear]);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("--- HELLO WORLD ---");
        System.out.println();

        while(true){
            
            System.out.println("\nSElECT ONE OF THE BILLOW : ");
            System.out.println("1. ENQUEUE\n2. DEQUEUE\n3. PEEK\n4. DISPLAY\n");
            System.out.print("\tEnter your selection : ");
            int select = sc.nextInt();

            switch(select){
                case 1 :
                    System.out.print("ENTER ELEMENT : ");
                    int ele = sc.nextInt();
                    enqueue(ele);
                    System.out.println("\nELEMENT STORED SUCESSFULLY!");
                break;

                case 2 :
                    dequeue();
                    System.out.println("ELEMENT DELETED SUCESSFULLY!");
                break;

                case 3 : 
                    peek();
                break;

                case 4 :
                    display();
                break;

                default :
                    System.out.println("\ninvalid selection\n");
                break;

                case 5 :
                    System.out.println("\nQUEUE EXITED\n");
                    return;
            }

            for(int i = 0; i<MAX; i++){
                if(i >= front && i<= rear){
                    System.out.print("|"+element[i]);
                }else{
                    System.out.print("|_");
                }

                if(i == MAX-1){
                    System.out.println("|");
                }
            }
            sc.close();
        }
    }
}
class Payment {
    void pay(double amount) {
        System.out.println("Processing payment of " + amount);
    }
}

class UPI extends Payment {
    void pay(double amount) {
        System.out.println("Payment of " + amount + " done using UPI");
    }
}

class Card extends Payment {
    void pay(double amount) {
        System.out.println("Payment of " + amount + " done using Card");
    }
}

class Cash extends Payment {
    void pay(double amount) {
        System.out.println("Payment of " + amount + " done using Cash");
    }
}

public class Main {
    public static void main(String[] args) {

        Payment p;

        p = new UPI();
        p.pay(500);

        p = new Card();
        p.pay(1200);

        p = new Cash();
        p.pay(300);
    }
}*/

// QUEUE :

// ENQUEUE
// DEQUEUE
// PEEK
// DISPLAY
// IS EMPTY/ IS FULL

//public class Veerendra<E>
/*
import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    
    static final int max = 10;
    static int queue[] = new int[max];

    static int front = -1, rear = -1;
    ArrayList<Integer> list = new ArrayList<>();
    static void enqueue(int data){
        if(rear == max-1 && front == 0){
            System.out.println("QUEUE OVERFLOW");
            return;
        }
        if(rear == -1 && front == -1){
            front = rear = 0;
        }else if(rear == max-1 && front != 0){
            rear = 0;
        }else{
            rear++;
        }
        queue[rear] = data;
    }

    static void dequeue(){
        if(front == -1){
            System.out.println("QUEUE UNDERFLOW");
            return;
        }else if(front == max-1){
            queue[front] = 0;
            front = 0;
        }else if(front == rear){
            queue[front] = 0;
            front = rear = -1;
        }else{
            queue[front++] = 0;
            // front++;
        }
        
    }

    static void peek(){
        if(rear == -1 && front == -1){
            System.out.println("QUEUE IS IN UNDERFLOW STAGE");
            return;
        }
        System.out.println(queue[rear]);
    }

    static void display(){
        if(rear == -1 && front == -1){
            System.out.println("QUEUE IS IN THE UNDERFLOW STAGE");
            return;
        }
        System.out.println(queue[front]);
    }

    static void isEmpty(){
        if(front == -1 && rear == -1){
            System.out.println("QUEUE IS EMPTY");
        }else if(front == rear){
            System.out.println("QUEUE IS FULL");
        }else{
            System.out.println("QUEUE IS NOT EMPTY AND ALSO NOT FULL AT THE SAME TIME");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("==== CIRCLUR QUEUE ====");
        while(true){    
            System.out.print("\n1. ENQUEUE\n2. DEQUEUE\n3. PEEK\n4. DISPLAY\n5. CHECK FOR EMPTY\n6. EXIT\n\tSELECT ONE OF THE ABOVE : ");
            int selection = sc.nextInt();
            switch(selection){
                case 1 :
                    while(true){
                        int data = 0;
                        System.out.print("ENTER DATA : ");
                        data = sc.nextInt();
                        if(data == 999) break;
                        enqueue(data);
                        for(int i = 0; i<max; i++){
                            if(queue[i] != 0){
                                System.out.print("|"+queue[i]);
                            }else{
                                System.out.print("|_");
                            }
                            if(i == max-1){
                                System.out.print("|");
                            }
                        }
                    }
                    break;
                case 2 :
                    dequeue();
                    break;
                
                case 3 :
                    peek();
                    break;

                case 4:
                    display();
                    break;
                
                case 5:
                    isEmpty();
                    break;
                
                case 6:
                    sc.close();
                    System.out.println("THANK YOU, PLEASE VISIT OU AGAIN");
                    return;

                default :
                    System.out.println("INVALID SELECTION. PLEASE TRY AGAIN");
            }
            if(selection != 1){
                for(int i = 0; i<max; i++){
                    if(queue[i] != 0){
                        System.out.print("|"+queue[i]);
                    }else{
                        System.out.print("|_");
                    }
                    if(i == max-1){
                        System.out.print("|");
                    }
                }
            }
        }
    }
}/*
import java.util.InputMismatchException;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        //EXCEPTION HANDLING
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers to divide : ");
        int x = 0, y = 0;
        while(true){
            try{
            
                if(x == 0){
                    System.out.print("Enter first number : ");
                    x = sc.nextInt();
                }
                if(x == 0)
                throw new ArithmeticException();

                if(y == 0){
                    System.out.print("Enter second number : ");
                    y = sc.nextInt();
                }
                if(y == 0)
                throw new ArithmeticException();
                break;
            }catch(ArithmeticException e){
                System.out.println("ANY THING DIVIDED BY 0 IS INFINITE");
                // sc.next();
            }catch(InputMismatchException e){
                System.out.println("Enter only INTEGER NUMBES!");
                sc.next();
            }catch(Exception e){
                System.out.println("Invalid. try again");
            }
        }
        System.out.println(x/y);
        sc.close();
        
    }
}
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] arr = {5,8,6,4,2};
        System.out.println("SIZE OF THE ARRAY IS "+arr.length);

        int x = 0;

        boolean notvalid = true;
        while(notvalid){
            try{
                System.out.print("ENTER THE INDEX NUMBER YOU WANT TO ACCESS (INDEXING STARTS FROM 0) : ");
                x = scan.nextInt();

                System.out.println("ARRAY INDEX "+x+" HAS THE VALUE : "+arr[x]);
                notvalid = false;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("YOUR HAVE ENTERED "+x+" ENTER THE INDEX NUMBER ONLY FROM 0 TO 4 : ");
            }catch(InputMismatchException e){
                System.out.println("PLEASE ENTER ONLY THE INTEGER VALUES");
                scan.nextLine();

            }catch(Exception e){
                System.out.println("Something went wrong : "+e);
            }
        }
        System.out.println("PROGRAM ENDS HERE");
        scan.close();
    }
}*/

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean notValid = true;
        int x = 0, y = x;
        while(notValid){

            String num1 = new String();
            String num2 = new String();
            x = y = 0;
            try{
                System.out.print("enter 2 numbers : ");
                
                num1 = sc.next();
                x = Integer.parseInt(num1);
            
                num2 = sc.next();
                y = Integer.parseInt(num2);

                notValid = false;
                
            }catch(NumberFormatException e){
                System.out.println("NUMBER FORMATTING IS INCORRECT. PLEASE ENTER ONLY INTEGER VALUES");
                sc.nextLine();
            }catch(Exception e){
                System.out.println("Something went wrong : "+e);
            }
        }

        System.out.println("num1 = "+x);
        System.out.println("num2 = "+y);


    }
}