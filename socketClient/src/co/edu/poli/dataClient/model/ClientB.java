package co.edu.poli.dataClient.model;
import java.io.*;
import java.net.*;
import javax.swing.JOptionPane;

class ClienteB {

	static final String HOST = "localhost";
	static final int PUERTO = 5000;
	
	public ClienteB () {
	
		try {
			
			int x;
			
			x=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero natural para calcular todos los números narcicistas inferiores a él: "));
			if (x>0) {
				
				Socket skCliente = new Socket (HOST,PUERTO);

				OutputStream stream_output = skCliente.getOutputStream();
				DataOutputStream data_output = new DataOutputStream(stream_output);
				
				data_output.writeUTF(String.valueOf(skCliente.getLocalAddress())+":"+String.valueOf(skCliente.getPort()) + " value: " +x);
				
				data_output.writeInt(x);
				 
				InputStream stream_input = skCliente.getInputStream();
				DataInputStream data_input = new DataInputStream(stream_input);
			 
				JOptionPane.showMessageDialog(null,"Los números narcicistas son: "+data_input.readUTF());	
			
				skCliente.close();
				
			} else {
				
				JOptionPane.showMessageDialog(null,"El numero digitado no es mayor o igual a cero");
				
			}
			
		}	
		catch ( Exception e ) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String [] arg){
		new ClienteB();
	}
}