import java.util.ArrayList;

public class BlocoDeNotas
{
   private ArrayList <String> notas;
   
   public ArrayList <String> getNotas()
   {
     return notas; 
   }
   
   public void setNotas (ArrayList <String> notas)
   {
      this.notas = notas;
   }
   
   public BlocoDeNotas ()
   {
      notas = new ArrayList <String> ();
   }
   
   public void addNota (String nota)
   {
      notas.add(nota);
   }
   
   public void removeNota (int index)
   {
      notas.remove(index);
   }  
}
