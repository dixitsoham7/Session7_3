/*
 * source code to demonstrate the use of
 * ensureCapacity() method of StringBuilder class
 * ensureCapacity() ensures that given capacity is minimum to the current capacity
 * If it is greater than current capacity , it increases the capacity by (oldcapacity*2)+2.
 * In example given below initially it is 20 with string "Hey!" 
 * Later on when we append it changes to 42 
 * then we check is 42>10 if so capacity remains same
 * then is 42>50 no hence old capacity is changed to (42*2)+2=86
 * Demonstration is as follows
 * initial capacity of buffer is 16 with addition of Hey! it becomes 20
 */

	public class StringBuilderCapacity {     //class name
		public static void main(String[] args) {   //main method

		StringBuffer st = new StringBuffer();  //creating object of buffer to show its initial capacity
		System.out.println("Default Capacity : "+st.capacity());//initial capacity of buffer
		
		StringBuffer s = new StringBuffer("Hey!");  //initializing StringBuffer object
		System.out.println("Capacity with String Hey! : "+s.capacity());  //printing capacity--- initial capacity = 16 + 4(Hey!) = 20 will be printed
		
		s.append("I Love Android App Development");  //appending string
		System.out.println("After Appending string, Capacity : "+s.capacity());  //as string to be appended has more capacity hence now (20*2)+2 = 42 will be printed
		
		s.ensureCapacity(10);   //42>10 hence no change ensured
		System.out.println("Ensuring Capacity with 10 : "+s.capacity());   //42 will only be printed 
		
		s.ensureCapacity(50);   //42>50 holds false hence it is ensured that change has to be done 
		System.out.println("Ensuring Capacity with 50 : "+s.capacity());  // change = (oldcapacity*2)+2 = (42*2)+2 = 86
		
		}//end of main
	}//end of class
	
//(oldcapacity*2)+2 if capacity to be ensured is greater than current capacity else capacity remains the same