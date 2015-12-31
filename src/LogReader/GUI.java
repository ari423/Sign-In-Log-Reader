//Ari Meles-Braverman

package LogReader;

import java.util.Scanner;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.util.ArrayList;

public class GUI extends JFrame{

	public JPanel panel;
	public JScrollPane scroll;
	public JTextArea text;
	
	public ArrayList<MemberTime> times;
	
	public GUI(){
		super();
		
		panel = new JPanel();
		this.add(panel);
		
		text = new JTextArea();
		panel.add(text);
		text.setEditable(false);
		
		scroll = new JScrollPane(text);
		panel.add(scroll);
		
		times = new ArrayList<MemberTime>();
	}
	
	public void calculateTimes(){
		Scanner reader;
		File[] files = (new File("Files")).listFiles();
		String tmp;
		
		for(int i=0; i<files.length; i++){
			try{
				reader = new Scanner(files[i]);
				while(reader.hasNext()){
					tmp = reader.nextLine();
					for(int j=0; j<times.size(); j++){
						if(times.get(j).check(tmp)){
							times.get(j).add()
						}
					}
				}
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
	}

}
