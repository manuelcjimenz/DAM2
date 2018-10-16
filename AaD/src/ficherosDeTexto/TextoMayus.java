package ficherosDeTexto;
/**
 * A.- Realiza un programa JAVA que lea un fichero de texto y lo copie en otro fichero de texto 
 * sustituyendo cada letra minúscula que encuentre a mayúscula.
 */


import java.io.*;
public class TextoMayus {

	
	public static void main (String [] args) throws FileNotFoundException {
		
		File fichero = null;
		File f2 = new File("C:\\Users\\franc\\OneDrive\\Escritorio\\texto2.txt");
		FileReader fic = null;
		BufferedReader bf = null;
		FileWriter fw = null;
		StringBuffer sb = new StringBuffer();
		try {
			fichero = new File("C:\\Users\\franc\\OneDrive\\Escritorio\\texto.txt");
			fic = new FileReader(fichero);
			bf = new BufferedReader(fic);
			String s = null;
			
			
			while ((s = bf.readLine()) != null) {
				
				sb.append(s);
				
			}
			bf.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			
			fw = new FileWriter(f2, false);
			String texto = sb.toString();
			texto = texto.toUpperCase();
			fw.write(texto);
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
