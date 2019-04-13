import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * FractalJPanel
 */
public class FractalJPanel extends JPanel{

    private Color color;    // Armazena a cor utilizada para desenhar o Fractal
    private int level;      // Armazena o nível atual do fractal

    private static final int WIDTH = 400;
    private static final int HEIGHT = 400;

    // configura o nível do fractal inicial com o valor especificado
    // e configura as especificaçoes do JPanel
    public FractalJPanel(int currentLevel) {
        color = Color.BLUE;
        level = currentLevel;
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    // desenha o fractal recursivamente
    public void drawFractal(int level, int xA, int yA, int xB, int yB, Graphics g){

        // caso básico desenha uma linha conectando dois pontos dados
        if (level == 0) {
            g.drawLine(xA, yA, xB, yB);
        } else { // passo de recursão: determina novos pontos, desenha próximo nível
            // calcula o ponto intermediário entre (xA, yA) e (xB, yB)
            int xC = (xA + xB) / 2;
            int yC = (yA + yB) / 2;

            // calcula o quarto ponto (xD, yD) que forma um
            // triangulo isósceles entre (xA, yA) e (xC, yC)
            // onde o ângulo direito está a (xD, yD)
            int xD = xA + (xC - xA) / 2 - (yC - yA) / 2;
            int yD = yA + (yC - yA) / 2 + (xC - xA) / 2;

            // desenha recursivamente o Fractal
            drawFractal(level - 1, xD, yD, xA, yA, g);
            drawFractal(level - 1, xD, yD, xC, yC, g);
            drawFractal(level - 1, xD, yD, xB, yB, g);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(color);
        drawFractal(level, 100, 90, 290, 200, g);
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
        this.repaint();
    }

    /**
     * @param level the level to set
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * @return the level
     */
    public int getLevel() {
        return level;
    }


    
}