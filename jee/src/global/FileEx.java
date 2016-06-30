/**
 * 
 */
package global;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.swing.JOptionPane;

/**
 * @date :2016. 6. 30.
 * @author :최인철
 * @file : FileEx.java
 * @story :
 */
public class FileEx {
	public static void main(String[] args) {
		File file = null;
		FileWriter fw = null;
		FileReader fr =null;
		BufferedWriter bw = null;
		BufferedReader br= null;
		String msg ="";
		try {
			while (true) {
				switch (JOptionPane.showInputDialog("1.생성 2.쓰기 3.읽기 4.수정 5.삭제 0.종료")) {
				case "1":
					String fileName = JOptionPane.showInputDialog("파일명");
					file = new File("C:\\eclipse\\eclipse\\workspace\\" + fileName + ".txt");
					fw = new FileWriter(file,true);
					fr = new FileReader(file);
					bw = new BufferedWriter(fw);
					br = new BufferedReader(fr);
					break;
				case "2":
					msg =JOptionPane.showInputDialog("message");
					bw.write(msg);
					bw.newLine();
					fw.flush();
					bw.flush();
					break;
				case "3":
					while ((msg= br.readLine()) !=null) {
						JOptionPane.showMessageDialog(null, msg);
						
					}
					br.close();
					break;
				case "4":
					String updateFileName=JOptionPane.showInputDialog("수정 파일명");
					File updateFile = new File("C:\\eclipse\\eclipse\\workspace\\"+updateFileName+".txt");
					bw = new BufferedWriter(new FileWriter(updateFile));
					String updatemsg =JOptionPane.showInputDialog("수정된 메세지");
					break;
				case "5":
					String delFileName=JOptionPane.showInputDialog("삭제 파일명");
					File delFile = new File("C:\\eclipse\\eclipse\\workspace\\"+delFileName+".txt");
					delFile.delete();
					break;
				case "0":
					fw.close();
					fr.close();
					bw.close();
					br.close();
					return;

				default:
					break;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				fw.flush();
				bw.flush();
				fw.close();
				fr.close();
				bw.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
