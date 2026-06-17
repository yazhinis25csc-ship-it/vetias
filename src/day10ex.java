public class day10ex{
    static void main(){
        String name= "xyz";
        try {
            System.out.println(name.charAt(2));
            System.out.println(20/0);
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexoutofbound exception");
        }
        catch(Exception e){
            System.out.println("exception success");
        }
        finally {
            System.out.println("successful excecution");
        }
    }
        }
