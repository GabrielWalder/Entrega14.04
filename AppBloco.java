import javax.swing.JOptionPane;
import java.util.ArrayList;
public class AppBloco
{
private BlocoDeNotas blocoDeNotas;
   public static void main (String [] args)
   {
      BlocoDeNotas blocoDeNotas = new BlocoDeNotas ();
      
      String menu = "1 - Adicionar nota\n2 - Deletar nota\n3 - Mudar nota\n4 - Listar notas\n0 - Sair";
      
      int opcao;
      
      do
      {
         opcao = Integer.parseInt(JOptionPane.showInputDialog (menu));
         ArrayList <String> notas = blocoDeNotas.getNotas();
         switch (opcao)
         {
            case 1:
            {
               String nota = JOptionPane.showInputDialog("Nota:");
               blocoDeNotas.addNota(nota);
               break;
            }
            case 2:
            {
               int posicao = Integer.parseInt(JOptionPane.showInputDialog("Posição:"));
               
               try
               {
                  blocoDeNotas.removeNota(posicao);
                  JOptionPane.showMessageDialog(null, "Nota deletada com sucesso");
               }catch (IndexOutOfBoundsException e)
                  {
                     JOptionPane.showMessageDialog(null, "Essa mensagem não existe");
                  }
               break;
            }
            case 3:
            {
               int posicao = Integer.parseInt(JOptionPane.showInputDialog("Posição:"));
               
               try
               {
                  String novaNota = JOptionPane.showInputDialog("Nova nota:");
                  notas.set(posicao, novaNota); 
                  JOptionPane.showMessageDialog(null, "Mudança feita com sucesso");
               }catch (IndexOutOfBoundsException e)
                  {
                     JOptionPane.showMessageDialog(null, "Essa mensagem não existe");
                  }
               break;   
            }
            case 4:
            {
               JOptionPane.showMessageDialog(null, notas);
               System.out.println(notas);
               System.out.println(notas.size()-1);
               break;
            }               
            case 0:
               JOptionPane.showMessageDialog(null, "Até breve");
               break;
         }
      }while (opcao !=0);
   }
}