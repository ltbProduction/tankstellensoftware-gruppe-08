package utilities;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import models.Employee;
import models.Fuel;
import models.GasStation;
import models.Good;
import models.Sale;




public class FileTransfer {
	
	//Das ist eine ausf�hrende Klasse die sp�ter wieder rausgenommen wird. Sie ist nur da weil es noch kein Model gibt
	public static void main(String[] args) {

	FileTransfer f1 = new FileTransfer();
	
    GasStation g1 = new GasStation("KKK");
    f1.readData(g1);
    g1.display(); //Methode zum test
	}	
	
	
	
	
	
	//Hier beginnt die wirkliche Klasse FileTransfer
	
	
	//Daten auslesen
	public void readData(GasStation gasstation) {
		gasstation.clearArrayList();
		readGoods(gasstation);
		readFuels(gasstation);
		readSalesHistory(gasstation);
		readPurchasesHistory(gasstation);
		readEmployee(gasstation);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Mitarbeiter auslesen
	private void readEmployee(GasStation gasstation) {
		SimpleDateFormat s1 = new SimpleDateFormat("dd/MM/yyyy");
		
		 String fileName = "resource/textfiles/Data/Employee.txt";
	     ClassLoader classLoader = new FileTransfer().getClass().getClassLoader();
	 
	     File file = new File(classLoader.getResource(fileName).getFile());
	     //Arraylist leeren
	     
		
		

		try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)) {
			String line;
			br.readLine();
	
			while ((line = br.readLine()) != null) {
		
			String[] output = line.split(";");
			gasstation.addemployee(new Employee(output[1], Integer.parseInt(output[0]), s1.parse(output[2])));
				
				
	}
		} catch (IOException | NumberFormatException | ParseException e) {
			e.printStackTrace();
		}
	}
		
	




	
	private void readPurchasesHistory(GasStation gasstation) {
	
		SimpleDateFormat s1 = new SimpleDateFormat("dd/MM/yyyy");
		
		 String fileName = "resource/textfiles/Data/Historypurchases.txt";
	     ClassLoader classLoader = new FileTransfer().getClass().getClassLoader();
	 
	     File file = new File(classLoader.getResource(fileName).getFile());
	    
	     
		
		

		try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)) {
			String line;
			br.readLine();
	
			while ((line = br.readLine()) != null) {
		
			String[] output = line.split(";");
			gasstation.addsale(new Sale(Integer.parseInt(output[0]), s1.parse(output[1]), Double.parseDouble(output[2])));
				
				
	}
		} catch (IOException | NumberFormatException | ParseException e) {
			e.printStackTrace();
		}
		
	}




	//Alle Kassenzettel werden ausgelesen und als Objekte erzeugt
	private void readSalesHistory(GasStation gasstation) {
	
		
	}





	//Waren werden ausgelesen und Objekte Goods erzeugt
	private void readGoods(GasStation gasstation) {
	     String fileName = "resource/textfiles/Data/Goods.txt";
	     ClassLoader classLoader = new FileTransfer().getClass().getClassLoader();
	 
	     File file = new File(classLoader.getResource(fileName).getFile());
	     //Arraylist leeren
	     
		
		

		try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)) {
			String line;
			br.readLine();
	
			while ((line = br.readLine()) != null) {
		
			String[] output = line.split(";");
			gasstation.addGood(new Good(Integer.parseInt(output[0]), output[1], output[2], Integer.parseInt(output[3]), Double.parseDouble(output[4])));
				
				
	}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//Waren wurden ausgelesen und Objekt erzeugt 
	
	//Tanks werden ausgelesen und Objekte erzeugt.
	private void readFuels(GasStation gasstation) {
	     String fileName = "resource/textfiles/Data/Fuels.txt";
	     ClassLoader classLoader = new FileTransfer().getClass().getClassLoader();
	 
	     File file = new File(classLoader.getResource(fileName).getFile());
	         
		
		

		try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)) {
			String line;
			br.readLine();
	
			while ((line = br.readLine()) != null) {
		
			String[] output = line.split(";");
			gasstation.addFuel(new Fuel(Integer.parseInt(output[0]), output[1], output[2], Double.parseDouble(output[3]), Double.parseDouble(output[4])));
				
				
	}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

	}
	


