/**
 * Created by Junaid Rasheed on 15/11/15.
 *
 * Converts celsius to fahrenheit.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusConverterGUI
{
    private JFrame frame;
    private JLabel cLabel;
    private JLabel fLabel;
    private JLabel fConverted;
    private JButton cButton;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JTextField input;

    public CelsiusConverterGUI()
    {
        frame = new JFrame("CelsiusConverter");
        cLabel = new JLabel("Celsius");
        fLabel = new JLabel("Fahrenheit");
        fConverted = new JLabel("32.00");
        cButton = new JButton("Convert");
        panel1 = new JPanel(new BorderLayout());
        panel2 = new JPanel(new BorderLayout());
        panel3 = new JPanel(new BorderLayout());
        input = new JTextField("0.00", 10);
    }

    public void initFrames()
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel1, BorderLayout.EAST);
        frame.add(panel2, BorderLayout.WEST);
        frame.add(panel3, BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
    }

    public void initPanels()
    {
        panel1.setLayout(new BorderLayout());
        panel2.setLayout(new BorderLayout());

        panel1.add(cLabel, BorderLayout.NORTH);
        panel1.add(fLabel, BorderLayout.SOUTH);

        panel2.add(input, BorderLayout.NORTH);
        panel2.add(fConverted, BorderLayout.SOUTH);

        panel3.add(cButton, BorderLayout.CENTER);

        panel1.setVisible(true);
        panel2.setVisible(true);
        panel3.setVisible(true);
    }

    public void initButtons()
    {
        cButton.setVisible(true);
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                convert();
            }
        });
    }

    public void convert()
    {
        String strCelsius = input.getText();
        double celsius = Double.parseDouble(strCelsius);
        double fahrenheit = celsius * 1.8 + 32;
        String strFahrenheit = String.valueOf(fahrenheit);
        fConverted.setText(strFahrenheit);
    }

    public static void main(String[] args)
    {
        CelsiusConverterGUI gui = new CelsiusConverterGUI();
        gui.initPanels();
        gui.initFrames();
        gui.initButtons();
    }
}
