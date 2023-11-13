package UOW.CSIT121;
// Full name: Penghian Ang
// Java version: 17.0.7, 64 bit
// Tutorial Group: tutorial 1
// Declaration: I declare that this assignment is my own work and i have not passed this progranm to anyone else.
// I am willing to accept whatever penalty given to you. 

import javax.swing.*;
import java.util.Arrays;
import java.util.ArrayList;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Olympic
{
    private final int NO = 10;
    private String country;
    private double[] score;
    private int rank;

    public Olympic(String country)
    {
        this.country = country;
        score = new double[NO];
        processScores();
    }
    public Olympic(Olympic oly)
    {
        this(oly.country);
    }

    public void processScores()
    {
        for(int i = 0; i < score.length; i++)
        {
            score[i] = Math.random() * 101;
        }
    }

    public double totalScores()
    {
        double total = 0.0;
        for(int i = 0; i < score.length; i++)
        {
            total += score[i];
        }
        return total;
    }

    public void set (int rank)
    {
        this.rank = rank;
    }

    public int getRank()
    {
        return rank;
    }

    public String getName()
    {
        return country;
    }

    private double[] getScoreArray()
    {
        return score;
    }

    @Override
    public String toString()
    {
        return String.format("%s ==> Rank: %d", getName(), getRank());
    }
}

class OlympicFrame extends JFrame
{
    private JButton[] jbArray;
    private final String[] countryArray = {"USA", "SPAIN", "CHINA", "JAPAN", "ITALY", "GERMANY", "FRANCE", "BRAZIL", "NETHERLAND", "POLAND", "RUSSIA", "UKRAINE"};
    private ArrayList<Olympic> aList;

    public OlympicFrame()
    {
        super("Olympic 2023");
        setLayout(new GridLayout(4, 3));

        constructAList();
        jbArray = new JButton[countryArray.length];
        for (int i = 0; i < jbArray.length; i++)
        {
            Icon image = new ImageIcon(String.format("%d.jpg", i + 1));
            jbArray[i] = new JButton(countryArray[i], image);
            ButtonHandler handler = new ButtonHandler();
            jbArray[i].addActionListener(handler);
            add(jbArray[i]);
        }
    }

    private class ButtonHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            for (int i = 0; i < jbArray.length; i++)
            {
                if(event.getSource() == jbArray[i])
                {
                    jbArray[i].setText(String.format("%s", aList.get(i)));
                }
            }
            Icon icon = new ImageIcon("Trophy.jpg");
            JOptionPane.showMessageDialog(null, getFinalRanking(),"Olympic 2023", JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }

    private void constructAList()
    {
        aList = new ArrayList<Olympic>();
        for (String country : countryArray)
        {
            aList.add(new Olympic(country));
        }
        double[] scoreArray = new double[countryArray.length];
        for(int i = 0; i < scoreArray.length; i++)
        {
            scoreArray[i] = getScores(aList, aList.get(i).getName());
        }
        for(Olympic oly : aList)
        {
            int rank = getRank(scoreArray, oly.totalScores());
            oly.set(rank);
        }
    }

    private int getRank(double[] scoreArray, double d)      
    {
        Arrays.sort(scoreArray);
        int rank = scoreArray.length;
        for(int i = 0; i < scoreArray.length; i++)
        {
            if(scoreArray[i] == d)
                rank -= i;
        }
        return rank;
    }

    private String getFinalRanking()
    {
        String string = "FINAL RANKING \n\n";
        for (int i = 1; i <= aList.size(); i++)
        {
            string += String.format("Rank %d: %s (%.2f)%n", i, getCountry(aList, i), getScores(aList, getCountry(aList, i)));
        }
        return string;
    }

    private String getCountry(ArrayList<Olympic>aList, int n)       // return country name with rank n
    {
        String string = "";
        for (Olympic oly: aList)
        {
            if(n == oly.getRank())
                string = oly.getName();
        }
        return string;
    }

    private double getScores(ArrayList<Olympic>aList, String name)  // return total scores of a country
    {       
        double score = 0.0;
        for (Olympic oly: aList)
        {
            if(name == oly.getName())
                score += oly.totalScores();
        }
        return score;
    }
}

class PenghianAng_8376566_A3 
{
    public static void main(String [] args)
    {
        OlympicFrame of = new OlympicFrame();
        of.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        of.setSize(400, 500);
        of.setVisible(true);
    }
}
