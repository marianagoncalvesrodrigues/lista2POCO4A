import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Main {

	public static void open(String br) throws Exception{
		try{
      BufferedReader arq = null;
      arq = new BufferedReader(new FileReader(br));
    }catch(ExceptionB a){
      if(br == "arquivob"){
          throw new ExceptionB("ExcecaoB");
      }
    }catch(ExceptionA a){
      if(br == "arquivo"){
          throw new ExceptionA("ExcecaoA");
      }
    }catch(NullPointerException a){
      if(br == null){
          throw new NullPointerException("null");
      }
    }catch(IOException a){
      System.err.println("IOException: " +  a.getMessage());
    }
		// if(br == "arquivo"){
    //   throw new ExceptionA("num eh igual a zero");
    // }else if(br == "arquivoB"){
    //   throw new ExceptionB("num eh igual a 1");
    // }else if(br == null){
    //   throw new NullPointerException("Excecao generica");
    // }else if(br == "arquivoInexistente"){
    //   throw new IOException("Excecao generica");
    // }
		
	}
	
	public static void main(String[] args) {
		
    String arq = new String("arquivo");
		try {
       open(arq);
    }catch (Exception e){
      System.out.println("1)"+e.getMessage());
    }finally {
			System.out.println("Sempre executa");
		}
		

	}

}
