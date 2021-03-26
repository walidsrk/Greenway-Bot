import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main extends JFrame {
    //Typing Bar
    private JTextField inputBar = new JTextField();

    //Chat Outpu Area
    private JTextArea chatOutput = new JTextArea();

    public Main() {
        //Creating the Frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setVisible(true);
        this.setResizable(false);


        // Setting GUI title
        this.setTitle("Customer Service ChatBot");

        // creating inputBar 
        inputBar.setLocation(2, 540);
        inputBar.setSize(590, 30);

        //inputBar Action Event
        inputBar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {

                String userInput = inputBar.getText();
                chatOutput.append("\n" + "You: " + userInput + "\n");


                 if(userInput.contains("recycle")){
                    botOutput("What do you want to recycle");

                }

                else if(userInput.contains("glass")){
                    botOutput("in the glass trash can");
                    botOutput("Please select one of the following topics: recycling, question about the company, contact");
                }

                else if(userInput.contains("account details")){
                    botOutput("Please enter Email or Account #");

                }

                else if(userInput.contains("make payment")){
                    botOutput("Please enter Email or Account #");

                }

                else if(userInput.contains("report issue")){
                    botOutput("Please select one of the following topics: recycling, question about the company, contact");
                }
            }
        });

        //chatOutput
        chatOutput.setLocation(15, 5);
        chatOutput.setSize(560, 510);
        chatOutput.setLineWrap(true);
        chatOutput.setEditable(false);
        chatOutput.setText("Please select one of the following topics: recycling, question about the company, contact");

        //Frame items
        this.add(inputBar);
        this.add(chatOutput);
    }

    public void botOutput(String s){
        chatOutput.append("ChatBot: " + s + "\n");
    }

    public static void main(String[] args){
        new Main();
    }

}