package co.edu.poli.dataServer.model;
import java.io.* ;
import java.net.* ; 

class ServidorA {
  
	static final int PUERTO=5000;
	private ServerSocket skServidor;
  
	public ServidorA() {
		
		try {
			
			int a;
	 
			skServidor = new ServerSocket( PUERTO );
			System.out.println("Escucho el puerto " + PUERTO );
     
			while(true){
				
				Socket skCliente = skServidor.accept();
				     
				InputStream stream_input = skCliente.getInputStream();
				DataInputStream data_input = new DataInputStream(stream_input);
				
				System.out.println("Sirvo al cliente: "+data_input.readUTF());
				
				a=data_input.readInt();

				OutputStream stream_output = skCliente.getOutputStream();
				DataOutputStream data_output = new DataOutputStream(stream_output);

				data_output.writeInt(Function.calculateFibonacci(a));
				
				skCliente.close();
				
			}
		} 
		catch( Exception e )
	    {
			System.out.println( e.getMessage() );
	    }
	}
	
	
	public static void main( String[] arg ) {
		new ServidorA();
	}

}