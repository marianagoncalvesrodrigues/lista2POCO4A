class Main {

	public static void divisor(int num) throws ExceptionA{
		
		if(num == 0){
      throw new ExceptionC("num eh igual a zero");
    }else if(num == 1){
      throw new ExceptionB("num eh igual a 1");
    }else if(num<3){
      throw new ExceptionA("Excecao generica");
    }
		
	}
	
	public static void main(String[] args) {
		
		try {
			divisor(1); //'Pode' disparar a excecao
		// } catch (ExceptionC e){
		// 	System.out.println("1)"+e.getMessage());
		// } catch (ExceptionB e){
    //   System.out.println("2)"+e.getMessage());
    }catch (ExceptionA e){
      System.out.println("1)"+e.getMessage());
    }finally {
			System.out.println("Sempre executa");
		}
		

	}

}
