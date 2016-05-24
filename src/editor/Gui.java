package editor;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;



public class Gui {

	private String geschlechter[] = {"Männlich", "Weiblich"}; 
	private String quests[] = {"Quest 1", "Quest 2", "Quest 3"}; 
	private String skins_male[] = {"Bauer 1", "Bauer 2", "Bauer 3", "Ritter"};
	private String skins_female[] = {"Frau 1", "Frau 2", "Frau 3"}; 
	


	public Gui() {
		try {
        JFrame frame = new JFrame();
        frame.setTitle("NPC-Editor");
        frame.setSize(1215, 840);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
 
		final Image image1 = ImageIO.read(Gui.class.getResourceAsStream("/Background/background.png"));
        
        JLabel mainlabel = new JLabel(new ImageIcon(image1));
        mainlabel.setBounds(0,0,1200,800);
        
        JLabel vorname = new JLabel("Vorname:");
        vorname.setBounds(100,30,100,100);
        panel.add(vorname);
 
        JTextField Firstname = new JTextField();
        Firstname.setBounds(100,100,150,30);
        panel.add(Firstname);
        
        JLabel nachname = new JLabel("Nachname:");
        nachname.setBounds(100,130,100,100);
        panel.add(nachname);
 
        JTextField Lastname = new JTextField();
        Lastname.setBounds(100,200,150,30);
        panel.add(Lastname);
        
        JLabel id = new JLabel("ID:");
        id.setBounds(100,230,100,100);
        panel.add(id);
 
        JTextField ID = new JTextField();
        ID.setBounds(100,300,150,30);
        panel.add(ID);
        
        JLabel geschlecht = new JLabel("Geschlecht:");
        geschlecht.setBounds(100,330,100,100);
        panel.add(geschlecht);
        
        JComboBox Geschlecht = new JComboBox(geschlechter);
        Geschlecht.setBounds(100,400,150,30);
        panel.add(Geschlecht);
        
        JLabel type_quest = new JLabel("Quest?");
        type_quest.setBounds(100,440,100,100);
        panel.add(type_quest);
        
        JLabel type_fight = new JLabel("Kämpfen?");
        type_fight.setBounds(200,440,100,100);
        panel.add(type_fight);
        
        JCheckBox Type_Quest = new JCheckBox();
        Type_Quest.setBounds(110, 510, 20, 20);
        panel.add(Type_Quest);
  
        JCheckBox Type_Fight = new JCheckBox();
        Type_Fight.setBounds(210, 510, 20, 20);
        panel.add(Type_Fight);
        
        JLabel choose_quest = new JLabel("Quest wählen:");
        choose_quest.setBounds(100,530,100,100);
        panel.add(choose_quest);
        
        JComboBox Choose_quest = new JComboBox(quests);
        Choose_quest.setBounds(100,600,150,30);
        Choose_quest.setEnabled(false);
        panel.add(Choose_quest);
        
        JLabel aussehen = new JLabel("Aussehen:");
        aussehen.setBounds(350,30,100,100);
        panel.add(aussehen);

        JComboBox Aussehen = new JComboBox(skins_male);
        Aussehen.setBounds(350,100,150,30);
        Aussehen.setEnabled(true);
        panel.add(Aussehen);
        
        JLabel health = new JLabel("Gesundheit:");
        health.setBounds(350,130,100,100);
        panel.add(health);

        JTextField Health = new JTextField();
        Health.setBounds(350,200,150,30);
        panel.add(Health);
        
        frame.add(panel);
        frame.setVisible(true);
        

        panel.add(mainlabel);
        
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	



}
