import javax.swing.JOptionPane;
import java.util.ArrayList;

class Main {
 public class Sapato{

 }
 public class Roupa{

 }
 public class ShoppingFacade{
   private ArrayList<Sapato> sapatos;
   private ArrayList<Roupa> roupas;
   public void comprei(){
     sapatos = new ArrayList<>();
     sapatos.add(new Sapato());
     roupas = new ArrayList<>();
     roupas.add(new Roupa());
   }
 }
 public Main(){
   ShoppingFacade shopping = new ShoppingFacade();
   shopping.comprei();
   
 }
 public static void main(String [] args){
   new Main();
   JOptionPane.showMessageDialog(null, "Bem vindo ao shopping!");
 }
}}
