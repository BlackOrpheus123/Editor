package editor;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;



public class Gui {

	private String geschlechter[] = {"Männlich", "Weiblich"}; 
	private String skins_male[] = {"Bauer 1", "Bauer 2", "Bauer 3", "Ritter"};
	private String skins_female[] = {"Frau 1", "Frau 2", "Frau 3"};
	
	private String tasks[] = {"holen", "töten"};
	private String target[] = {};
	 


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
        
///////////////////////QUEST-OTIONEN////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        JLabel task = new JLabel("Aufgabe:");
        task.setBounds(600,30,100,100);
        panel.add(task);

        JComboBox Task = new JComboBox(tasks);
        Task.setBounds(600,100,150,30);
        panel.add(Task);
        
        JLabel target = new JLabel("Ziel - NPC:");
        target.setBounds(600,130,100,100);
        panel.add(target);

        JComboBox Target = new JComboBox();
        Target.setBounds(600,200,150,30);
        panel.add(Target);
        
        JLabel item = new JLabel("Item:");
        item.setBounds(600,230,100,100);
        panel.add(item);

        JComboBox Item = new JComboBox();
        Item.setBounds(600,300,150,30);
        panel.add(Item);
        
        JLabel count = new JLabel("Anzahl Items:");
        count.setBounds(600,330,100,100);
        panel.add(count);

        JTextField Count = new JTextField();
        Count.setBounds(600,400,150,30);
        panel.add(Count);
        
        JLabel reward = new JLabel("Belohnung:");
        reward.setBounds(600,430,100,100);
        panel.add(reward);

        JComboBox Reward = new JComboBox();
        Reward.setBounds(600,500,150,30);
        panel.add(Reward);
        
        JLabel reward_count = new JLabel("Anzahl Belohnung:");
        reward_count.setBounds(600,530,120,100);
        panel.add(reward_count);

        JTextField Reward_count = new JTextField();
        Reward_count.setBounds(600,600,150,30);
        panel.add(Reward_count);
///////////////////////QUEST-OTIONEN////////////////////////////////////////////////////////////////////////////////////////////////////////////////        
        
        
        
        
///////////////////////KAMPF-OTIONEN////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        JLabel health = new JLabel("Gesundheit:");
        health.setBounds(350,30,100,100);
        panel.add(health);

        JTextField Health = new JTextField();
        Health.setBounds(350,100,150,30);
        panel.add(Health);
       
        
        JLabel defense = new JLabel("Verteidigung:");
        defense.setBounds(350,130,100,100);
        panel.add(defense);

        JTextField Defense = new JTextField();
        Defense.setBounds(350,200,150,30);
        panel.add(Defense);
        
        JLabel damage = new JLabel("Schaden:");
        damage.setBounds(350,230,100,100);
        panel.add(damage);

        JTextField Damage = new JTextField();
        Damage.setBounds(350,300,150,30);
        panel.add(Damage);
        
        JLabel initiative = new JLabel("Initiative:");
        initiative.setBounds(350,330,100,100);
        panel.add(initiative);

        JTextField Initiative = new JTextField();
        Initiative.setBounds(350,400,150,30);
        panel.add(Initiative);
        
        JLabel win_xp = new JLabel("Gewonnene XP:");
        win_xp.setBounds(350,430,120,100);
        panel.add(win_xp);

        JTextField win_XP = new JTextField();
        win_XP.setBounds(350,500,150,30);
        panel.add(win_XP);
        
        JLabel lost_xp = new JLabel("Verlorene XP:");
        lost_xp.setBounds(350,530,120,100);
        panel.add(lost_xp);

        JTextField lost_XP = new JTextField();
        lost_XP.setBounds(350,600,150,30);
        panel.add(lost_XP);
        
///////////////////////KAMPF-OTIONEN////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        
        
        
///////////////////////BASIC-OTIONEN////////////////////////////////////////////////////////////////////////////////////////////////////////////////
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
        
        JLabel aussehen = new JLabel("Aussehen:");
        aussehen.setBounds(100,530,100,100);
        panel.add(aussehen);

        JComboBox Aussehen = new JComboBox(skins_male);
        Aussehen.setBounds(100,600,150,30);
        Aussehen.setEnabled(true);
        panel.add(Aussehen);
        
        JLabel geschlecht = new JLabel("Geschlecht:");
        geschlecht.setBounds(100,330,100,100);
        panel.add(geschlecht);
        
        JComboBox Geschlecht = new JComboBox(geschlechter);
        Geschlecht.setBounds(100,400,150,30);
        Geschlecht.addItemListener(new ItemListener() {
        		public void itemStateChanged(ItemEvent event) {
            if (event.getStateChange() == ItemEvent.SELECTED) {
                Object item = event.getItem();
                if(item == "Männlich"){
                	for(int i=0;i<skins_male.length;i++){
                		Aussehen.addItem(skins_male[i]);
                	}
                	for(int i=0;i<skins_female.length;i++){
                		Aussehen.removeItem(skins_female[i]);
                	}
                	
                	
                	
                }else{
                	for(int i=0;i<skins_female.length;i++){
                		Aussehen.addItem(skins_female[i]);
                	}
                	for(int i=0;i<skins_male.length;i++){
                		Aussehen.removeItem(skins_male[i]);
                	}
                	
                }
             }
            }
        });

        panel.add(Geschlecht);
        
        JLabel type_quest = new JLabel("Quest?");
        type_quest.setBounds(100,440,100,100);
        panel.add(type_quest);
        
        JLabel type_fight = new JLabel("Kämpfen?");
        type_fight.setBounds(200,440,100,100);
        panel.add(type_fight);
        
        JRadioButton Type_Quest = new JRadioButton();
        Type_Quest.setBounds(110, 510, 20, 20);
        Type_Quest.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            //Quest-Fenster
            Task.setEnabled(true);
            Target.setEnabled(true);
            Item.setEnabled(true);
            Count.setEnabled(true);
            Reward.setEnabled(true);
            Reward_count.setEnabled(true);	
            	
            //Fight-Fenster	
            Damage.setEnabled(false);
            Defense.setEnabled(false);
            Initiative.setEnabled(false);
            win_XP.setEnabled(false);
            lost_XP.setEnabled(false);
            Health.setEnabled(false);
            }
        });
        panel.add(Type_Quest);
  
        JRadioButton Type_Fight = new JRadioButton();
        Type_Fight.setBounds(210, 510, 20, 20);
        Type_Fight.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            //Quest-Fenster
            Task.setEnabled(false);
            Target.setEnabled(false);
            Item.setEnabled(false);
            Count.setEnabled(false);
            Reward.setEnabled(false);
            Reward_count.setEnabled(false);
            	
            //Fight-Fenster	
            Damage.setEnabled(true);
            Defense.setEnabled(true);
            Initiative.setEnabled(true);
            win_XP.setEnabled(true);
            lost_XP.setEnabled(true);
            Health.setEnabled(true);
            }
        });
        panel.add(Type_Fight);
        
        ButtonGroup group = new ButtonGroup();	
        group.add(Type_Quest);
        group.add(Type_Fight);
        
///////////////////////BASIC-OTIONEN////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        
        
        
        
        JButton save = new JButton("NPC speichern");
        save.setBounds(900,700,250,50);
        save.setEnabled(true);
        panel.add(save);
        

        
        frame.add(panel);
        frame.setVisible(true);
        
        //Def, Damage, Iniziative, XP, Lost XP,
        //Task, Ziel, Anzahl, Belohnung, Anzahl Belohnung, Xp
        panel.add(mainlabel);
        
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	



}
