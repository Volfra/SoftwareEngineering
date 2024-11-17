package co.edu.poli.dataServer.model;

import java.io.* ;
import java.net.* ;


class ServidorB {
  
	static final int PUERTO=5000;
	private ServerSocket skServidor;
  
	public ServidorB() {
		
		try {
	 
			skServidor = new ServerSocket( PUERTO );
			System.out.println("Escucho el puerto " + PUERTO );
			

			while(true){
				
				Socket skCliente = skServidor.accept();
				     
				InputStream stream_input = skCliente.getInputStream();
				DataInputStream data_input = new DataInputStream(stream_input);
				
				System.out.println("Sirvo al cliente: "+data_input.readUTF());
				
				int a=data_input.readInt();

				OutputStream stream_output = skCliente.getOutputStream();
				DataOutputStream data_output = new DataOutputStream(stream_output);

				data_output.writeUTF(Function.calculatenumberNarcissistic(a));
				
				skCliente.close();
				
			}
			
		} 
		catch( Exception e )
	    {
			System.out.println( e.getMessage() );
	    }
	    
	}

	public static void main( String[] arg ) {
		new ServidorB();
	}
}