package tp;

import java.io.*;

public class GestionnaireSauvegarde {
	
	static public void Sauvegarde(Memento pMemento, String location){
		try {
				FileOutputStream Output = new FileOutputStream("sauvegarde.serial");
				
				ObjectOutputStream ObjectOutput = new ObjectOutputStream(Output);

				try{
					//sérialization
					ObjectOutput.writeObject(pMemento);
					
					//vidage du tampon
					ObjectOutput.flush();
				} finally {
					//fermeture
					try {
						ObjectOutput.close();
					} finally {
						Output.close();
					}
					
				}
		} catch (IOException ioe){
			ioe.printStackTrace();
		}
	}
	
	static public void Chargement(String location){
		
		
	}
}
