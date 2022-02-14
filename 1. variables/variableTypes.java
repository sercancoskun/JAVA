public class VariableTypes{
	
    static int a=1;//static variable
	
    void bmethod(){
		
        int b=2;//local variable
		
    }
    public static void main(String args[]){
        
        int c=5;//instance variable

        System.out.println(a);
        //System.out.println(b); //does not work
        System.out.println(c);
    }
	
}//end of class
