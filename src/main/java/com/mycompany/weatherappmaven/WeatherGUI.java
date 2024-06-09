package com.mycompany.weatherappmaven;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class WeatherGUI extends JPanel implements ActionListener, Runnable {

    //Colours
    public static final Color VERY_LIGHT_BLUE = new Color(51, 204, 255);
    public static final Color NAVY = new Color(0, 0, 128);
    public static final Color LIGHTER_BLUE = new Color(190, 240, 255);

    //GUI components
    JFrame frame;
    JPanel mainPanel;
    JButton Auckland;
    JButton Back;
    JPanel Graphics;

    public WeatherGUI() {
        frame = new JFrame("Weather App");
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mainPanel = new JPanel() {

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon Clouds = new ImageIcon("./resources/Clouds.png");
                Image cloudsImage = Clouds.getImage();
                g.drawImage(cloudsImage, 50, 50, Clouds.getIconWidth(), Clouds.getIconHeight(), this);
            }
        };
//Auckland button
        mainPanel.setBounds(0, 0, 600, 600);
        Auckland = new JButton("Auckland");
        Auckland.setBackground(LIGHTER_BLUE);
        Auckland.setForeground(Color.BLACK);
        Auckland.setFont(new Font("SansSerif", Font.BOLD, 14));
        Auckland.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        Auckland.setBounds(50, 50, 150, 30);
        Auckland.setVisible(true);
        Auckland.addActionListener(this);
        Auckland.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Auckland.setBackground(Color.white);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Auckland.setBackground(LIGHTER_BLUE);
            }
        });
        // Back button
        Back = new JButton("Back");
        Back.setBackground(LIGHTER_BLUE);
        Back.setForeground(Color.BLACK);
        Back.setFont(new Font("Arial", Font.BOLD, 14));
        Back.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        Back.setBounds(mainPanel.getWidth() / 2 - 75, 500, 150, 30);
        Back.setVisible(true);
        Back.addActionListener(this);
        Back.setVisible(false);
        Back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Back.setBackground(Color.white);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                Back.setBackground(LIGHTER_BLUE);
            }
        });

        mainPanel.setBackground(VERY_LIGHT_BLUE);
        mainPanel.setLayout(null);
        mainPanel.validate();
        mainPanel.add(Auckland);
        mainPanel.add(Back);

        frame.setLocationRelativeTo(null);
        frame.add(mainPanel);

    }

    public void Auckland() {
        Auckland.setVisible(false);
        Back.setVisible(true);
    }

    public void Back() {
        Auckland.setVisible(true);
        Back.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Auckland) {
            Auckland();
        } else if (e.getSource() == Back) {
            Back();
        }

    }

    @Override
    public void run() {

    }

    public static void main(String[] args) {
        WeatherGUI App = new WeatherGUI();
    }

}
