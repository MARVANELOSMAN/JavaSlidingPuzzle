import java.awt.*;
import javax.swing.*;
public class Game {
    public static void main(String[] args) {
        JFrame f1 = new JFrame();
        f1.setSize(430, 700);
        f1.setLayout(null);

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b10 = new JButton("10");
        JButton b11 = new JButton("11");
        JButton b12 = new JButton("12");
        JButton b13 = new JButton("13");
        JButton b14 = new JButton("14");
        JButton b15 = new JButton("15");
        JButton b16 = new JButton("16");
        JButton b17 = new JButton("17");
        JButton b18 = new JButton("18");
        JButton b19 = new JButton("19");
        JButton b20 = new JButton("20");
        JButton b21 = new JButton("21");
        JButton b22 = new JButton("22");
        JButton b23 = new JButton("23");
        JButton b24 = new JButton("24");
        JButton b25 = new JButton();


        JButton reset = new JButton("Reset");
        JButton shuffle = new JButton("Shuffle");

        b1.setBounds(0, 0, 86, 113);
        b2.setBounds(86, 0, 86, 113);
        b3.setBounds(172, 0, 86, 113);
        b4.setBounds(258, 0, 86, 113);
        b5.setBounds(344, 0, 86, 113);
        b6.setBounds(0, 113,86, 113);
        b7.setBounds(86, 113, 86, 113);
        b8.setBounds(172, 113, 86, 113);
        b9.setBounds(258, 113, 86, 113);
        b10.setBounds(344, 113, 86, 113);
        b11.setBounds(0, 226, 86, 113);
        b12.setBounds(86, 226, 86, 113);
        b13.setBounds(172, 226, 86, 113);
        b14.setBounds(258, 226, 86, 113);
        b15.setBounds(344, 226, 86, 113);
        b16.setBounds(0, 339, 86, 113);
        b17.setBounds(86, 339, 86, 113);
        b18.setBounds(172, 339, 86, 113);
        b19.setBounds(258, 339, 86, 113);
        b20.setBounds(344, 339, 86, 113);
        b21.setBounds(0, 452, 86, 113);
        b22.setBounds(86, 452, 86, 113);
        b23.setBounds(172, 452, 86, 113);
        b24.setBounds(258, 452, 86, 113);
        b25.setBounds(344, 452, 86, 113);

        shuffle.setBounds(310, 590, 100, 50);
        reset.setBounds(30, 590, 100, 50);

        reset.setBackground(Color.lightGray);
        shuffle.setBackground(Color.lightGray);

        reset.setForeground(Color.BLACK);
        shuffle.setForeground(Color.BLACK);

        b1.setIcon(new ImageIcon("/Users/marvan/Pic/piece_1.png"));
b2.setIcon(new ImageIcon("/Users/marvan/Pic/piece_2.png"));
b3.setIcon(new ImageIcon("/Users/marvan/Pic/piece_3.png"));
b4.setIcon(new ImageIcon("/Users/marvan/Pic/piece_4.png"));
b5.setIcon(new ImageIcon("/Users/marvan/Pic/piece_5.png"));
b6.setIcon(new ImageIcon("/Users/marvan/Pic/piece_6.png"));
b7.setIcon(new ImageIcon("/Users/marvan/Pic/piece_7.png"));
b8.setIcon(new ImageIcon("/Users/marvan/Pic/piece_8.png"));
b9.setIcon(new ImageIcon("/Users/marvan/Pic/piece_9.png"));
b10.setIcon(new ImageIcon("/Users/marvan/Pic/piece_10.png"));
b11.setIcon(new ImageIcon("/Users/marvan/Pic/piece_11.png"));
b12.setIcon(new ImageIcon("/Users/marvan/Pic/piece_12.png"));
b13.setIcon(new ImageIcon("/Users/marvan/Pic/piece_13.png"));
b14.setIcon(new ImageIcon("/Users/marvan/Pic/piece_14.png"));
b15.setIcon(new ImageIcon("/Users/marvan/Pic/piece_15.png"));
b16.setIcon(new ImageIcon("/Users/marvan/Pic/piece_16.png"));
b17.setIcon(new ImageIcon("/Users/marvan/Pic/piece_17.png"));
b18.setIcon(new ImageIcon("/Users/marvan/Pic/piece_18.png"));
b19.setIcon(new ImageIcon("/Users/marvan/Pic/piece_19.png"));
b20.setIcon(new ImageIcon("/Users/marvan/Pic/piece_20.png"));
b21.setIcon(new ImageIcon("/Users/marvan/Pic/piece_21.png"));
b22.setIcon(new ImageIcon("/Users/marvan/Pic/piece_22.png"));
b23.setIcon(new ImageIcon("/Users/marvan/Pic/piece_23.png"));
b24.setIcon(new ImageIcon("/Users/marvan/Pic/piece_24.png"));

        b1.addActionListener(e->{
            int b1x = b1.getBounds().x;
            int b1y = b1.getBounds().y;
            int b25x = b25.getBounds().x;
            int b25y = b25.getBounds().y;

            if (Math.abs(b1x-b25x) == 86 && b1y == b25y || Math.abs(b1y-b25y) == 113 && b1x == b25x) {
                b1.setBounds(b25x,b25y,86,113);
                b25.setBounds(b1x,b1y,86,113);
            }
        });
        b2.addActionListener(e->{
            int b2x = b2.getBounds().x;
            int b2y = b2.getBounds().y;
            int b25x = b25.getBounds().x;
            int b25y = b25.getBounds().y;

            if (Math.abs(b2x-b25x) == 86 && b2y == b25y || Math.abs(b2y-b25y) == 113 && b2x == b25x) {
                b2.setBounds(b25x,b25y,86,113);
                b25.setBounds(b2x,b2y,86,113);
            }
        });
        b3.addActionListener(e->{
            int b3x = b3.getBounds().x;
            int b3y = b3.getBounds().y;
            int b25x = b25.getBounds().x;
            int b25y = b25.getBounds().y;

            if (Math.abs(b3x-b25x) == 86 && b3y == b25y || Math.abs(b3y-b25y) == 113 && b3x == b25x) {
                b3.setBounds(b25x,b25y,86,113);
                b25.setBounds(b3x,b3y,86,113);
            }
        });
        b4.addActionListener(e->{
            int b4x = b4.getBounds().x;
            int b4y = b4.getBounds().y;
            int b25x = b25.getBounds().x;
            int b25y = b25.getBounds().y;

            if (Math.abs(b4x-b25x) == 86 && b4y == b25y || Math.abs(b4y-b25y) == 113 && b4x == b25x) {
                b4.setBounds(b25x,b25y,86,113);
                b25.setBounds(b4x,b4y,86,113);
            }
        });
        b5.addActionListener(e->{
            int b5x = b5.getBounds().x;
            int b5y = b5.getBounds().y;
            int b25x = b25.getBounds().x;
            int b25y = b25.getBounds().y;

            if (Math.abs(b5x-b25x) == 86 && b5y == b25y || Math.abs(b5y-b25y) == 113 && b5x == b25x) {
                b5.setBounds(b25x,b25y,86,113);
                b25.setBounds(b5x,b5y,86,113);
            }
        });
        b6.addActionListener(e->{
            int b6x = b6.getBounds().x;
            int b6y = b6.getBounds().y;
            int b25x = b25.getBounds().x;
            int b25y = b25.getBounds().y;

            if (Math.abs(b6x-b25x) == 86 && b6y == b25y || Math.abs(b6y-b25y) == 113 && b6x == b25x) {
                b6.setBounds(b25x,b25y,86,113);
                b25.setBounds(b6x,b6y,86,113);
            }
        });
        b7.addActionListener(e->{
            int b7x = b7.getBounds().x;
            int b7y = b7.getBounds().y;
            int b25x = b25.getBounds().x;
            int b25y = b25.getBounds().y;

            if (Math.abs(b7x-b25x) == 86 && b7y == b25y || Math.abs(b7y-b25y) == 113 && b7x == b25x) {
                b7.setBounds(b25x,b25y,86,113);
                b25.setBounds(b7x,b7y,86,113);
            }
        });
        b8.addActionListener(e->{
            int b8x = b8.getBounds().x;
            int b8y = b8.getBounds().y;
            int b25x = b25.getBounds().x;
            int b25y = b25.getBounds().y;

            if (Math.abs(b8x-b25x) == 86 && b8y == b25y || Math.abs(b8y-b25y) == 113 && b8x == b25x) {
                b8.setBounds(b25x,b25y,86,113);
                b25.setBounds(b8x,b8y,86,113);
            }
        });
        b9.addActionListener(e->{
            int b9x = b9.getBounds().x;
            int b9y = b9.getBounds().y;
            int b25x = b25.getBounds().x;
            int b25y = b25.getBounds().y;

            if (Math.abs(b9x-b25x) == 86 && b9y == b25y || Math.abs(b9y-b25y) == 113 && b9x == b25x) {
                b9.setBounds(b25x,b25y,86,113);
                b25.setBounds(b9x,b9y,86,113);
            }
        });
        b10.addActionListener(e->{
            int b10x = b10.getBounds().x;
            int b10y = b10.getBounds().y;
            int b25x = b25.getBounds().x;
            int b25y = b25.getBounds().y;

            if (Math.abs(b10x-b25x) == 86 && b10y == b25y || Math.abs(b10y-b25y) == 113 && b10x == b25x) {
                b10.setBounds(b25x,b25y,86,113);
                b25.setBounds(b10x,b10y,86,113);
            }
        });
        b11.addActionListener(e->{
            int b11x = b11.getBounds().x;
            int b11y = b11.getBounds().y;
            int b25x = b25.getBounds().x;
            int b25y = b25.getBounds().y;

            if (Math.abs(b11x-b25x) == 86 && b11y == b25y || Math.abs(b11y-b25y) == 113 && b11x == b25x) {
                b11.setBounds(b25x,b25y,86,113);
                b25.setBounds(b11x,b11y,86,113);
            }
        });
        b12.addActionListener(e->{
            int b12x = b12.getBounds().x;
            int b12y = b12.getBounds().y;
            int b25x = b25.getBounds().x;
            int b25y = b25.getBounds().y;

            if (Math.abs(b12x-b25x) == 86 && b12y == b25y || Math.abs(b12y-b25y) == 113 && b12x == b25x) {
                b12.setBounds(b25x,b25y,86,113);
                b25.setBounds(b12x,b12y,86,113);
            }
        });
        b13.addActionListener(e->{
            int b13x = b13.getBounds().x;
            int b13y = b13.getBounds().y;
            int b25x = b25.getBounds().x;
            int b25y = b25.getBounds().y;

            if (Math.abs(b13x-b25x) == 86 && b13y == b25y || Math.abs(b13y-b25y) == 113 && b13x == b25x) {
                b13.setBounds(b25x,b25y,86,113);
                b25.setBounds(b13x,b13y,86,113);
            }
        });
        b14.addActionListener(e->{
            int b14x = b14.getBounds().x;
            int b14y = b14.getBounds().y;
            int b25x = b25.getBounds().x;
            int b25y = b25.getBounds().y;

            if (Math.abs(b14x-b25x) == 86 && b14y == b25y || Math.abs(b14y-b25y) == 113 && b14x == b25x) {
                b14.setBounds(b25x,b25y,86,113);
                b25.setBounds(b14x,b14y,86,113);
            }
        });
        b15.addActionListener(e->{
            int b15x = b15.getBounds().x;
            int b15y = b15.getBounds().y;
            int b25x = b25.getBounds().x;
            int b25y = b25.getBounds().y;

            if (Math.abs(b15x-b25x) == 86 && b15y == b25y || Math.abs(b15y-b25y) == 113 && b15x == b25x) {
                b15.setBounds(b25x,b25y,86,113);
                b25.setBounds(b15x,b15y,86,113);
            }
        });
        b16.addActionListener(e->{
            int b16x = b16.getBounds().x;
            int b16y = b16.getBounds().y;
            int b25x = b25.getBounds().x;
            int b25y = b25.getBounds().y;

            if (Math.abs(b16x-b25x) == 86 && b16y == b25y || Math.abs(b16y-b25y) == 113 && b16x == b25x) {
                b16.setBounds(b25x,b25y,86,113);
                b25.setBounds(b16x,b16y,86,113);
            }
        });
        b17.addActionListener(e->{
            int b17x = b17.getBounds().x;
            int b17y = b17.getBounds().y;
            int b25x = b25.getBounds().x;
            int b25y = b25.getBounds().y;

            if (Math.abs(b17x-b25x) == 86 && b17y == b25y || Math.abs(b17y-b25y) == 113 && b17x == b25x) {
                b17.setBounds(b25x,b25y,86,113);
                b25.setBounds(b17x,b17y,86,113);
            }
        });
        b18.addActionListener(e->{
            int b18x = b18.getBounds().x;
            int b18y = b18.getBounds().y;
            int b25x = b25.getBounds().x;
            int b25y = b25.getBounds().y;

            if (Math.abs(b18x-b25x) == 86 && b18y == b25y || Math.abs(b18y-b25y) == 113 && b18x == b25x) {
                b18.setBounds(b25x,b25y,86,113);
                b25.setBounds(b18x,b18y,86,113);
            }
        });
        b19.addActionListener(e->{
            int b19x = b19.getBounds().x;
            int b19y = b19.getBounds().y;
            int b25x = b25.getBounds().x;
            int b25y = b25.getBounds().y;

            if (Math.abs(b19x-b25x) == 86 && b19y == b25y || Math.abs(b19y-b25y) == 113 && b19x == b25x) {
                b19.setBounds(b25x,b25y,86,113);
                b25.setBounds(b19x,b19y,86,113);
            }
        });
        b20.addActionListener(e->{
            int b20x = b20.getBounds().x;
            int b20y = b20.getBounds().y;
            int b25x = b25.getBounds().x;
            int b25y = b25.getBounds().y;

            if (Math.abs(b20x-b25x) == 86 && b20y == b25y || Math.abs(b20y-b25y) == 113 && b20x == b25x) {
                b20.setBounds(b25x,b25y,86,113);
                b25.setBounds(b20x,b20y,86,113);
            }
        });
        b21.addActionListener(e->{
            int b21x = b21.getBounds().x;
            int b21y = b21.getBounds().y;
            int b25x = b25.getBounds().x;
            int b25y = b25.getBounds().y;

            if (Math.abs(b21x-b25x) == 86 && b21y == b25y || Math.abs(b21y-b25y) == 113 && b21x == b25x) {
                b21.setBounds(b25x,b25y,86,113);
                b25.setBounds(b21x,b21y,86,113);
            }
        });
        b22.addActionListener(e->{
            int b22x = b22.getBounds().x;
            int b22y = b22.getBounds().y;
            int b25x = b25.getBounds().x;
            int b25y = b25.getBounds().y;

            if (Math.abs(b22x-b25x) == 86 && b22y == b25y || Math.abs(b22y-b25y) == 113 && b22x == b25x) {
                b22.setBounds(b25x,b25y,86,113);
                b25.setBounds(b22x,b22y,86,113);
            }
        });
        b23.addActionListener(e->{
            int b23x = b23.getBounds().x;
            int b23y = b23.getBounds().y;
            int b25x = b25.getBounds().x;
            int b25y = b25.getBounds().y;

            if (Math.abs(b23x-b25x) == 86 && b23y == b25y || Math.abs(b23y-b25y) == 113 && b23x == b25x) {
                b23.setBounds(b25x,b25y,86,113);
                b25.setBounds(b23x,b23y,86,113);
            }
        });
        b24.addActionListener(e->{
            int b24x = b24.getBounds().x;
            int b24y = b24.getBounds().y;
            int b25x = b25.getBounds().x;
            int b25y = b25.getBounds().y;

            if (Math.abs(b24x-b25x) == 86 && b24y == b25y || Math.abs(b24y-b25y) == 113 && b24x == b25x) {
                b24.setBounds(b25x,b25y,86,113);
                b25.setBounds(b24x,b24y,86,113);
            }
        });
        reset.addActionListener(e->{
        b1.setBounds(0, 0, 86, 113);
        b2.setBounds(86, 0, 86, 113);
        b3.setBounds(172, 0, 86, 113);
        b4.setBounds(258, 0, 86, 113);
        b5.setBounds(344, 0, 86, 113);
        b6.setBounds(0, 113,86, 113);
        b7.setBounds(86, 113, 86, 113);
        b8.setBounds(172, 113, 86, 113);
        b9.setBounds(258, 113, 86, 113);
        b10.setBounds(344, 113, 86, 113);
        b11.setBounds(0, 226, 86, 113);
        b12.setBounds(86, 226, 86, 113);
        b13.setBounds(172, 226, 86, 113);
        b14.setBounds(258, 226, 86, 113);
        b15.setBounds(344, 226, 86, 113);
        b16.setBounds(0, 339, 86, 113);
        b17.setBounds(86, 339, 86, 113);
        b18.setBounds(172, 339, 86, 113);
        b19.setBounds(258, 339, 86, 113);
        b20.setBounds(344, 339, 86, 113);
        b21.setBounds(0, 452, 86, 113);
        b22.setBounds(86, 452, 86, 113);
        b23.setBounds(172, 452, 86, 113);
        b24.setBounds(258, 452, 86, 113);
        b25.setBounds(344, 452, 86, 113);
        });
        shuffle.addActionListener(e->{
        b1.setBounds(0, 0, 86, 113);
        b2.setBounds(0, 113,86, 113);
        b3.setBounds(86, 0, 86, 113);
        b4.setBounds(172, 113, 86, 113);
        b5.setBounds(172, 0, 86, 113);
        b6.setBounds(258, 113, 86, 113);
        b7.setBounds(258, 0, 86, 113);
        b8.setBounds(86, 113, 86, 113);
        b9.setBounds(344, 113, 86, 113);
        b10.setBounds(172, 226, 86, 113);
        b11.setBounds(344, 0, 86, 113);
        b12.setBounds(86, 226, 86, 113);
        b13.setBounds(258, 226, 86, 113);
        b14.setBounds(0, 226, 86, 113);
        b15.setBounds(0, 452, 86, 113);
        b16.setBounds(0, 339, 86, 113);
        b17.setBounds(258, 339, 86, 113);
        b18.setBounds(172, 339, 86, 113);
        b19.setBounds(172, 452, 86, 113);
        b20.setBounds(86, 339, 86, 113);
        b21.setBounds(344, 226, 86, 113);
        b22.setBounds(344, 452, 86, 113);
        b23.setBounds(258, 452, 86, 113);
        b24.setBounds(86, 452, 86, 113);
        b25.setBounds(344, 339, 86, 113);
        });
        f1.add(b1);
        
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(b5);
        f1.add(b6);
        f1.add(b7);
        f1.add(b8);
        f1.add(b9);
        f1.add(b10);
        f1.add(b11);
        f1.add(b12);
        f1.add(b13);
        f1.add(b14);
        f1.add(b15);
        f1.add(b16);
        f1.add(b17);
        f1.add(b18);
        f1.add(b19);
        f1.add(b20);
        f1.add(b21);
        f1.add(b22);
        f1.add(b23);
        f1.add(b24);
        f1.add(b25);
        f1.add(reset);
        f1.add(shuffle);
        f1.setVisible(true);
    }
}