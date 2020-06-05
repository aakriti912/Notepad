import javax.swing.*;
import java.awt.event.*;

public class Notepad implements ActionListener{
JFrame f;
JMenuBar mb;
JMenu file, edit, help;
JMenuItem copy, cut, paste, selectAll;
JTextArea ta;

Notepad(){
f= new JFrame();
copy= new JMenuItem("copy");
cut= new JMenuItem("cut");
paste= new JMenuItem("paste");
selectAll= new JMenuItem("selectAll");


copy.addActionListener(this);
cut.addActionListener(this);
paste.addActionListener(this);
selectAll.addActionListener(this);


mb= new JMenuBar();
mb.setBounds(5,5,400,40);

file= new JMenu("File");
edit= new JMenu("Edit");
help= new JMenu("Help");

edit.add(copy);
edit.add(cut);
edit.add(paste);
edit.add(selectAll);

mb.add(file);
mb.add(edit);
mb.add(help);

ta= new JTextArea();
ta.setBounds(5,30, 460, 460);

f.add(mb);
f.add(ta);

f.setLayout(null);
f.setSize(500, 500);
f.setVisible(true);

}

public void actionPerformed(ActionEvent e){
if(e.getSource()== copy){
ta.copy();
}
if(e.getSource()== cut){
ta.cut();
}
if(e.getSource()== selectAll){
ta.selectAll();
}
}
public static void main(String[] args){
	new Notepad();
}
}





