public class HeyJude {

         public static void main (String [] args) {

	     String HEY = "Hey Jude ";
	     String DONT = ", don't ";
	     String BAD = "make it bad";
	     String AFRAID = "be afraid";
	     String DOWN = "let me down";
	     String SAD = "Take a sad song and make it better";
	     String GO_OUT = "You were made to go out and get her";
	     String FOUND = "You have found her, now go and get her";
	     String REMEMBER = "Remember to ";
	     String HEART = "let her into your heart";
	     String SKIN = "let her under your skin";
	     String THEN = "Then you ";
	     String START = "can start ";
             String BEGIN = "begin ";
	     String MAKE_BETTER = "to make it better";
	     String BETTER = "better ";
	     String OH = ", oh";
	     String NA = "na ";

	     int p = 0;
	     while (p < 7) {
		 if (p == 0 || p == 1 || p == 3 || p == 5) {
		     System.out.print(HEY);
		     System.out.print(DONT);
		 }
		 if (p == 0 || p == 5) {
		     System.out.println(BAD);
		     System.out.println(SAD);
		 }
		 if (p == 1) {
		     System.out.println(AFRAID);
		     System.out.println(GO_OUT);
		 }
		 if (p == 3) {
		     System.out.println(DOWN);
		     System.out.println(FOUND);
		 }
		 if (p == 0 || p == 1 || p == 3 || p == 5) {
		     System.out.print(REMEMBER);
		 }
		 if (p == 0 || p == 3) {
		     System.out.println(HEART);
		 }
		 if (p == 1 || p == 5) {
		     System.out.println(SKIN);
		 }
		 if (p == 0 || p == 1 || p == 3 || p == 5) {
		     System.out.print(THEN);
		 }
		 if (p == 0 || p == 3){
		     System.out.print(START);
		 }
		 if (p == 1 || p == 5) {
		     System.out.print(BEGIN);
		 }
		 if (p == 0 || p == 1 || p == 3 || p == 5) {
		     System.out.println(MAKE_BETTER);
		     System.out.println(" ");
		 }
		 if (p == 2 || p == 4 || p == 6) {
		     int n = 0;
		     while (n < 10) {
			 System.out.print(NA);
			 n = n+1;
			 }
		     if (p == 6) {
		     System.out.println(HEY);
		 }
		     System.out.println(" ");
		     System.out.println(" ");
		 }
		 if (p == 5) {
		     int b = 0;
		     while (b < 5) {
			 System.out.print(BETTER);
			 b = b+1; 
		     }
		 }
		     if (p == 5) {
		     System.out.println(OH);
		 }
		 p = p+1;
		 
	     }
	 }
}
