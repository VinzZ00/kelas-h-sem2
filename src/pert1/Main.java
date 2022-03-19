package pert1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
	File file = new File("C:\\Binus Courses\\Semester 4\\Workspace LNT\\Kelas-H-Semester2-lnt\\test delete");

	public Main() throws Exception {
		int i = 0;
		do {
			//		createnewfile();
			//		outputstream();
//			scanFile();
//			writer();
//			bufferedWriter();
//			delete();
			metafile();
			System.out.println("masukan angka");
			i = new Scanner(System.in).nextInt();
		} while (i != 5);
	}
	
	public void createnewfile() {
		// TODO Auto-generated constructor stub
		// escape sequence => 1 '/' = \n \t .. 
		// direktori => "//" = C:\\Binus Courses\\Semester 4\\Workspace LNT\\Kelas-H-Semester2-lnt\\f.txt
		// \\ => '\'
		
		
		/*
		 * ini create file mengunakan file.createNewFile()
		 */
		try {
			if (file.createNewFile()) {
				System.out.println("ini true");
			} else System.out.println("ini false");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
		
//		file.delete();
//		
//		if (file.exists()) {
//			System.out.println("file sudah ada");
//		} else {
//			 System.out.println("file belom ada");
//		}
//
//		try {
//			if (file.createNewFile()) {
//				System.out.println("ini true");
//			} else {
//				System.out.println("ini false");
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	
	private void outputstream() {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos = new FileOutputStream(file, true);
			fos.write("Budi".getBytes());
			System.out.println("Budi".getBytes().length);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	 * jika kita ingin mendapatkan value yang dinamis (diupdate secara berkala kepada file nya kita harus
	 * melakukan scan ulang (initialize scanner file)
	 */
	private void scanFile() {
		// TODO Auto-generated method stub
		Scanner	fsc = null;
		try {
			fsc = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int i = 0;
//		do {
			while (fsc.hasNextLine()) {
				System.out.println(fsc.nextLine());
			}
			if (fsc.hasNextLine()) {
				System.out.println(fsc.nextLine());
			} else {
				System.out.println("Gaad line lagi");
			} 
			System.out.println("Masukan input");
			Scanner sc = new Scanner(System.in);
//			i = sc.nextInt(); sc.nextLine();
//			i = sc.nextInt(); sc.nextLine();
//			new Scanner(System.in).nextInt(); new Scanner(System.in).nextLine();			
//		} while (i != 5);
		fsc.close();
	}

	private void metafile() {
		// TODO Auto-generated method stub
		File f = new File("C:\\Binus Courses\\Semester 4\\Workspace LNT\\Kelas-H-Semester2-lnt\\f.txt");
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getName());
		System.out.println(f.getParent());
		SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");  
		System.out.println(formatter.format(f.lastModified()));
		System.out.println(f.length() + "bytes");
	}
	private void writer() {
		// TODO Auto-generated method stub
//		by file writer
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println("test");
			fw.write("\nEvan");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	private void bufferedWriter() throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter(file,true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		pw.write("\nDodi");
		pw.close();
		
	}
	
	private File retrievefile() {
		// TODO Auto-generated method stub
		String[] fentry = file.list();
		System.out.println(fentry.length);
		File entFile = null;
		for (String string : fentry) {
			entFile = new File(file.getAbsolutePath().concat("\\" + string));
		}
		if(entFile.exists()) System.out.println("ini exist");
		
		return entFile;
	}
	
	private void delete() {
		// TODO Auto-generated method stub
		File f = retrievefile();
		
		
		
		if (f.delete()) {
			System.out.println("file ini berhasil di delete");
		}
		
		if (file.delete()) {
			System.out.println("folder ini berhasil di delete");
		} else System.out.println("ini tidak berhasil di delete");
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new Main();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
