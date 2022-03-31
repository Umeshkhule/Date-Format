package date_operation;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.Scanner;

public class DateExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		DateFormat simpleDateFormat;
		String date;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter Date (dd-mm-yyy):");
		String getDate=scanner.nextLine();
		simpleDateFormat=new SimpleDateFormat("dd-MM-yyyy");
		Date getDates=simpleDateFormat.parse(getDate);
		System.out.println(getDates);

        simpleDateFormat = new SimpleDateFormat("dd-M-yyyy");
        date = simpleDateFormat.format(getDates);
        System.out.println(date);
        
		simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        date = simpleDateFormat.format(getDates);
        System.out.println(date);
        
		simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        date = simpleDateFormat.format(getDates);
        System.out.println(date);
        
        simpleDateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        date = simpleDateFormat.format(getDates);
        System.out.println(date);
        
		simpleDateFormat = new SimpleDateFormat("dd-MM-yy");
        date = simpleDateFormat.format(getDates);
        System.out.println(date);
        
        simpleDateFormat = new SimpleDateFormat("MMM dd");
        date = simpleDateFormat.format(getDates);
        System.out.println(date);
      
		simpleDateFormat = new SimpleDateFormat("E,dd-MM-yyyy");
        date = simpleDateFormat.format(getDates);
        System.out.println(date);
        
        simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        date = simpleDateFormat.format(getDates);
        System.out.println(date);
        
        simpleDateFormat = new SimpleDateFormat("d/M/yyyy");
        date = simpleDateFormat.format(getDates);
        System.out.println(date);
        
        simpleDateFormat = new SimpleDateFormat("d/M/yy");
        date = simpleDateFormat.format(getDates);
        System.out.println(date);
        
        simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        date = simpleDateFormat.format(getDates);
        System.out.println(date);
	}
}
