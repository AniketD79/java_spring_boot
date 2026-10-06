// Online Java Compiler (Editor)
// Write and run Java online using this editor.
interface An{
    public void hey();
 
    
}
class Main implements An{  
   @Override
   public void hey(){
    System.out.println("Try clicking the Run button.");
    }
    public static void main(String[] args) {
        An an = new Main();
  
        an.hey();
        System.out.println("Try clicking the Run button.");
    }
}