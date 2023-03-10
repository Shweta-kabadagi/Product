package com.nxt;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

public class Product {
	public static void main(String[] args) {
		List<String[]> csvFile=productDetails();
		try (CSVWriter writer=new CSVWriter(new FileWriter("file.csv")))
		{
			writer.writeAll(csvFile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static List<String[]> productDetails(){
		String[] header= {"Product Name" ,  "Product Price" ,  "Item Number" , "Model Number" , "Product Category" , "Product Description"};
		String[] row1= {"Staples Hanging","$25.99","901-163501","TR163501"," Hanging File Folders","File folder tabs are detachable,Holds letter-size papers and files"};
		String[] row2= {"Quill Brand","$23.59","901-7387QGR","7387QGR"," Hanging File Folders","Standard 11 pt. green paper stock,1/5-cut"};
		String[] row3= {"Pendaflex SureHook 5-Tab","$28.99","901-615215AD","6152 1/5 ASST","Hanging File Folders","11-point stock in five colors, including blue, red, yellow, bright green and orange,Built-in tension springs and longer hooks for durability and security"};
		String[] row4= {"Smead FasTab","$27.99","901-64053QL","64053"," Hanging File Folders","Assorted colors in durable 11-point stock,Plastic tabs on either end of each file work with heavy-duty plastic rods for sturdiness"};
		String[] row5= {"Staples Hanging","$17.99","901-706811STP","36330-CC","File Pockets ","Comes in assorted colors and made of plastic,Hanging hook, water-proof"};
		String[] row6={"Pendaflex SureHook","$23.99","901-59225","59225"," Expanding File","This hanging file is ideal for storing monthly statements, receipts, and expense reports,Blue hanging file offers protection and organization for your documents"};
		String[] row7= {"Find It Mini Tab View","$17.59","901-1274094ISC","FT07382","Hanging File Folders","4\"(H) x 0.01\"(W) x 11\",Assorted (Red, orange, green, yellow, blue)"};
		String[] row8= {"Smead Adjustable Tab Recycled","$32.99","901-811319","C15HOR","Hanging File Folders","Coated rod tips allow smooth gliding Keep papers neatly vertical"};
		String[] row9= {"Pendaflex Premium Reinforced Letter Size","$66.99","901-ESS45432UNI","ESS45432","Expanding File","Expansion size: 3 1/2\" Redrope"};
		String[] row10= {"Smead Recycled ","$98.99","901-2678318","SMD64326"," Hanging File Pocket","Perfect way to store large amounts of paperwork Closed sides for secure storage of documents and other item"};
		List<String[]> arrayList=new ArrayList<String[]>();
		arrayList.add(header);
		arrayList.add(row1);
		arrayList.add(row2);
		arrayList.add(row3);
		arrayList.add(row4);
		arrayList.add(row5);
		arrayList.add(row6);
		arrayList.add(row7);
		arrayList.add(row8);
		arrayList.add(row9);
		arrayList.add(row10);
		return arrayList;
	}

}
