
package testinglab;

/**
 *
 * @author Ykimmel
 */
public class TestingLab {
private static String validate(char expected, char results){
            
            if(results != expected){
                return("The results " + results + " does not match expected:" + expected + " --->>Failed");
                 }
            else{
                return("The results "+ results + " match expected:"+ expected + "---->> OK");
            }
        }
private static String validate(int expected, int results){
            
            if(results != expected){
                return("The results " + results + " does not match expected:" + expected + " --->>Failed");
                 }
            else{
                return("The results "+ results + " match expected:"+ expected + "---->> OK");
            }
        }



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Part A\n");
        StringAnalyzer wa = new StringAnalyzer();
        
        System.out.println("Testing FirstRepeatedCharecter method");
        String s ="aardvark";
        char result = wa.firstRepeatedCharacter(s);
        System.out.println("Test 1 FirstRepeatedCharecter: "+ validate('a',result));
        
         s ="roomate";
         result = wa.firstRepeatedCharacter(s);
        System.out.println("Test 2 FirstRepeatedCharecter: "+ validate('o',result));
        
          s ="mate";
         result = wa.firstRepeatedCharacter(s);
        System.out.println("Test 3 FirstRepeatedCharecter: "+ validate('0',result));
        System.out.println("---------------------------");
        System.out.println("---------------------------");
        
         System.out.println("Part B\n");
        System.out.println("Testing FirstMultipleCharecter method");
        String test ="Hey";
        char testing = wa.firstMultipleCharacter(test);
        System.out.println("Test 1 FirstMultipleCharecter: "+ validate('a',testing));
        
        test ="aardvark";
        testing =wa.firstMultipleCharacter(test);
        System.out.println("Test 1 FirstMultipleCharecter: "+ validate('a',testing));
        
        test ="hello";
        testing =wa.firstMultipleCharacter(test);
        System.out.println("Test 2 FirstMultipleCharecter: "+ validate('l',testing));
        
        test ="enroll";
        testing =wa.firstMultipleCharacter(test);
        System.out.println("Test 3 FirstMultipleCharecter: "+ validate('l',testing));
        System.out.println("---------------------------");
        System.out.println("---------------------------");
        
        System.out.println("Part C\n");
         System.out.println("Testing CountRepeatedCharacters method");
         
   test ="mississippiii";
        int inttest =wa.countRepeatedCharacters(test);
        System.out.println("Test 1 CountRepeatedCharacters: "+ validate(5,inttest));
        
         test ="test";
         inttest =wa.countRepeatedCharacters(test);
        System.out.println("Test 2 CountRepeatedCharacters: "+ validate(0,inttest));
        
         test ="aabbcdaaaaabbb";
         inttest =wa.countRepeatedCharacters(test);
        System.out.println("Test 3 CountRepeatedCharacters: "+ validate(4,inttest));
         System.out.println("---------------------------");
        System.out.println("---------------------------");
        
        

        
    }
}
