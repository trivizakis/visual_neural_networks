package annNumRecogn;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AnnGui extends JFrame {
	private JTextArea taOutput = new JTextArea();
	private JTextArea textArea = new JTextArea();
	private JCheckBox checkBox_0,checkBox_1,checkBox_2,checkBox_3,checkBox_4,checkBox_5,
						checkBox_6,checkBox_7,checkBox_8,checkBox_9,checkBox_10,
						checkBox_11,checkBox_12,checkBox_13,checkBox_14,checkBox_15,
						checkBox_16,checkBox_17,checkBox_18,checkBox_19,checkBox_20,
						checkBox_21,checkBox_22,checkBox_23,checkBox_24,checkBox_25,
						checkBox_26,checkBox_27,checkBox_28,checkBox_29,checkBox_30,
						checkBox_31,checkBox_32,checkBox_33,checkBox_34;

	public AnnGui() {
		initGui();
	}
	
	private void initGui(){
		setTitle("Number Prediction - CI");
		getContentPane().setLayout(null);
		
		textArea.setBounds(10, 27, 188, 193);
		textArea.setEditable(false);
		textArea.setVisible(true);
		JScrollPane scrollMe = new JScrollPane(textArea);
		scrollMe.setBounds(10, 27, 188, 193);
		scrollMe.setVisible(true);
		getContentPane().add(scrollMe);
		
		checkBox_0 = new JCheckBox("");
		checkBox_0.setBounds(225, 11, 21, 23);
		getContentPane().add(checkBox_0);
		
		checkBox_1 = new JCheckBox("");
		checkBox_1.setBounds(248, 11, 21, 23);
		getContentPane().add(checkBox_1);
		
		checkBox_2 = new JCheckBox("");
		checkBox_2.setBounds(271, 11, 21, 23);
		getContentPane().add(checkBox_2);
		
		checkBox_3 = new JCheckBox("");
		checkBox_3.setBounds(294, 11, 21, 23);
		getContentPane().add(checkBox_3);
		
		checkBox_4 = new JCheckBox("");
		checkBox_4.setBounds(317, 11, 21, 23);
		getContentPane().add(checkBox_4);
		
		checkBox_5 = new JCheckBox("");
		checkBox_5.setBounds(317, 37, 21, 23);
		getContentPane().add(checkBox_5);
		
		checkBox_6 = new JCheckBox("");
		checkBox_6.setBounds(225, 37, 21, 23);
		getContentPane().add(checkBox_6);
		
		checkBox_7 = new JCheckBox("");
		checkBox_7.setBounds(248, 37, 21, 23);
		getContentPane().add(checkBox_7);
		
		checkBox_8 = new JCheckBox("");
		checkBox_8.setBounds(271, 37, 21, 23);
		getContentPane().add(checkBox_8);
		
		checkBox_9 = new JCheckBox("");
		checkBox_9.setBounds(294, 37, 21, 23);
		getContentPane().add(checkBox_9);
		
		checkBox_10 = new JCheckBox("");
		checkBox_10.setBounds(317, 63, 21, 23);
		getContentPane().add(checkBox_10);
		
		checkBox_11 = new JCheckBox("");
		checkBox_11.setBounds(225, 63, 21, 23);
		getContentPane().add(checkBox_11);
		
		checkBox_12 = new JCheckBox("");
		checkBox_12.setBounds(248, 63, 21, 23);
		getContentPane().add(checkBox_12);
		
		checkBox_13 = new JCheckBox("");
		checkBox_13.setBounds(271, 63, 21, 23);
		getContentPane().add(checkBox_13);
		
		checkBox_14 = new JCheckBox("");
		checkBox_14.setBounds(294, 63, 21, 23);
		getContentPane().add(checkBox_14);
		
		checkBox_15 = new JCheckBox("");
		checkBox_15.setBounds(317, 89, 21, 23);
		getContentPane().add(checkBox_15);
		
		checkBox_16 = new JCheckBox("");
		checkBox_16.setBounds(225, 89, 21, 23);
		getContentPane().add(checkBox_16);
		
		checkBox_17 = new JCheckBox("");
		checkBox_17.setBounds(248, 89, 21, 23);
		getContentPane().add(checkBox_17);
		
		checkBox_18 = new JCheckBox("");
		checkBox_18.setBounds(271, 89, 21, 23);
		getContentPane().add(checkBox_18);
		
		checkBox_19 = new JCheckBox("");
		checkBox_19.setBounds(294, 89, 21, 23);
		getContentPane().add(checkBox_19);
		
		checkBox_20 = new JCheckBox("");
		checkBox_20.setBounds(317, 115, 21, 23);
		getContentPane().add(checkBox_20);
		
		checkBox_21 = new JCheckBox("");
		checkBox_21.setBounds(225, 115, 21, 23);
		getContentPane().add(checkBox_21);
		
		checkBox_22 = new JCheckBox("");
		checkBox_22.setBounds(248, 115, 21, 23);
		getContentPane().add(checkBox_22);
		
		checkBox_23 = new JCheckBox("");
		checkBox_23.setBounds(271, 115, 21, 23);
		getContentPane().add(checkBox_23);
		
		checkBox_24 = new JCheckBox("");
		checkBox_24.setBounds(294, 115, 21, 23);
		getContentPane().add(checkBox_24);
		
		checkBox_25 = new JCheckBox("");
		checkBox_25.setBounds(317, 141, 21, 23);
		getContentPane().add(checkBox_25);
		
		checkBox_26 = new JCheckBox("");
		checkBox_26.setBounds(225, 141, 21, 23);
		getContentPane().add(checkBox_26);
		
		checkBox_27 = new JCheckBox("");
		checkBox_27.setBounds(248, 141, 21, 23);
		getContentPane().add(checkBox_27);
		
		checkBox_28 = new JCheckBox("");
		checkBox_28.setBounds(271, 141, 21, 23);
		getContentPane().add(checkBox_28);
		
		checkBox_29 = new JCheckBox("");
		checkBox_29.setBounds(294, 141, 21, 23);
		getContentPane().add(checkBox_29);
		
		checkBox_30 = new JCheckBox("");
		checkBox_30.setBounds(317, 167, 21, 23);
		getContentPane().add(checkBox_30);
		
		checkBox_31 = new JCheckBox("");
		checkBox_31.setBounds(225, 167, 21, 23);
		getContentPane().add(checkBox_31);
		
		checkBox_32 = new JCheckBox("");
		checkBox_32.setBounds(248, 167, 21, 23);
		getContentPane().add(checkBox_32);
		
		checkBox_33 = new JCheckBox("");
		checkBox_33.setBounds(271, 167, 21, 23);
		getContentPane().add(checkBox_33);
		
		checkBox_34 = new JCheckBox("");
		checkBox_34.setBounds(294, 167, 21, 23);
		getContentPane().add(checkBox_34);
		
		JButton btnEvaluate = new JButton("evaluate");
		btnEvaluate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				whenClicked();
			}
		});
		btnEvaluate.setBounds(235, 197, 90, 23);
		getContentPane().add(btnEvaluate);
		
		
		taOutput.setBounds(10, 247, 339, 71);
		taOutput.setEditable(false);
		taOutput.setVisible(true);
		JScrollPane scrollMe2 = new JScrollPane(taOutput);
		scrollMe2.setBounds(10, 247, 339, 71);
		scrollMe2.setVisible(true);
		getContentPane().add(scrollMe2);
		
		JLabel lblWhichNumberAnn = new JLabel("which number ann thinks it is:");
		lblWhichNumberAnn.setBounds(10, 11, 188, 14);
		getContentPane().add(lblWhichNumberAnn);
		
		JLabel lblEpoches = new JLabel("epoches:");
		lblEpoches.setBounds(10, 231, 96, 14);
		getContentPane().add(lblEpoches);
		
		JLabel lblTrivizakisMpTzagkarakis = new JLabel("Trivizakis MP143, Tzagkarakis MP141 - ann project");
		lblTrivizakisMpTzagkarakis.setBounds(10, 318, 339, 14);
		getContentPane().add(lblTrivizakisMpTzagkarakis);
		
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(25, 25, 360, 365);
		setVisible(true);
	}

	private void whenClicked() {
		
		String[] userInput = 
			{getCBvalue(checkBox_0)+getCBvalue(checkBox_1)+getCBvalue(checkBox_2)+getCBvalue(checkBox_3)+getCBvalue(checkBox_4),
			getCBvalue(checkBox_6)+getCBvalue(checkBox_7)+getCBvalue(checkBox_8)+getCBvalue(checkBox_9)+getCBvalue(checkBox_5),
			getCBvalue(checkBox_11)+getCBvalue(checkBox_12)+getCBvalue(checkBox_13)+getCBvalue(checkBox_14)+getCBvalue(checkBox_10),
			getCBvalue(checkBox_16)+getCBvalue(checkBox_17)+getCBvalue(checkBox_18)+getCBvalue(checkBox_19)+getCBvalue(checkBox_15),
			getCBvalue(checkBox_21)+getCBvalue(checkBox_22)+getCBvalue(checkBox_23)+getCBvalue(checkBox_24)+getCBvalue(checkBox_20),
			getCBvalue(checkBox_26)+getCBvalue(checkBox_27)+getCBvalue(checkBox_28)+getCBvalue(checkBox_29)+getCBvalue(checkBox_25),
			getCBvalue(checkBox_31)+getCBvalue(checkBox_32)+getCBvalue(checkBox_33)+getCBvalue(checkBox_34)+getCBvalue(checkBox_30)};
		/*userInput[0][0]=getCBvalue(checkBox_0);
		userInput[0][1]=getCBvalue(checkBox_1);
		userInput[0][2]=getCBvalue(checkBox_2);
		userInput[0][3]=getCBvalue(checkBox_3);
		userInput[0][4]=getCBvalue(checkBox_4);

		userInput[1][0]=getCBvalue(checkBox_5);
		userInput[1][1]=getCBvalue(checkBox_6);
		userInput[1][2]=getCBvalue(checkBox_7);
		userInput[1][3]=getCBvalue(checkBox_8);
		userInput[1][4]=getCBvalue(checkBox_9);

		userInput[2][0]=getCBvalue(checkBox_10);
		userInput[2][1]=getCBvalue(checkBox_11);
		userInput[2][2]=getCBvalue(checkBox_12);
		userInput[2][3]=getCBvalue(checkBox_13);
		userInput[2][4]=getCBvalue(checkBox_14);

		userInput[3][0]=getCBvalue(checkBox_15);
		userInput[3][1]=getCBvalue(checkBox_16);
		userInput[3][2]=getCBvalue(checkBox_17);
		userInput[3][3]=getCBvalue(checkBox_18);
		userInput[3][4]=getCBvalue(checkBox_19);

		userInput[4][0]=getCBvalue(checkBox_20);
		userInput[4][1]=getCBvalue(checkBox_21);
		userInput[4][2]=getCBvalue(checkBox_22);
		userInput[4][3]=getCBvalue(checkBox_23);
		userInput[4][4]=getCBvalue(checkBox_24);

		userInput[5][0]=getCBvalue(checkBox_25);
		userInput[5][1]=getCBvalue(checkBox_26);
		userInput[5][2]=getCBvalue(checkBox_27);
		userInput[5][3]=getCBvalue(checkBox_28);
		userInput[5][4]=getCBvalue(checkBox_29);

		userInput[6][0]=getCBvalue(checkBox_30);
		userInput[6][1]=getCBvalue(checkBox_31);
		userInput[6][2]=getCBvalue(checkBox_32);
		userInput[6][3]=getCBvalue(checkBox_33);
		userInput[6][4]=getCBvalue(checkBox_34);*/
		
		/*System.out.println(userInput[0].toString());
		System.out.println(userInput[1].toString());
		System.out.println(userInput[2].toString());
		System.out.println(userInput[3].toString());
		System.out.println(userInput[4].toString());
		System.out.println(userInput[5].toString());
		System.out.println(userInput[6].toString());*/
		
		NumRecognPilot.testInput(userInput);
		
	}
	
	public String getTaOutput() {
		return this.taOutput.getText();
	}

	public void setTaOutput(String taOutput) {
		this.taOutput.setText(taOutput);
	}
	
	public String getTextArea() {
		return this.textArea.getText();
	}

	public void setTextArea(String textArea) {
		this.textArea.setText(textArea);
	}
	
	private String getCBvalue(JCheckBox checkBox){
		if(checkBox.isSelected())
			return "O";
		else
			return " ";
	}
}
