package resto.componentes;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JCheckBox;

public class CheckboxPersonalizada extends JCheckBox {

  private final int border = 4;

  public CheckboxPersonalizada() {
    setCursor(new Cursor(Cursor.HAND_CURSOR));
    setOpaque(false);
    setBackground(Color.decode("#723F32"));
  }

  @Override
  public void paint(Graphics g) {
    super.paint(g);

    Graphics2D g2 = (Graphics2D) g;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    int ly = (getHeight() - 16) / 2;
    
    if (isSelected()) {
      if (isEnabled()) {
        g2.setColor(getBackground());
      } else {
        g2.setColor(Color.GRAY);
      }
      g2.fillRoundRect(1, ly, 16, 16, border, border);

      //  Dibujar icono de check
      int px[] = {4, 8, 14, 12, 8, 6};
      int py[] = {ly + 8, ly + 14, ly + 5, ly + 3, ly + 10, ly + 6};
      g2.setColor(Color.decode("#F1CFB2"));
      g2.fillPolygon(px, py, px.length);

    } else {
      g2.setColor(Color.decode("#723F32"));
      g2.fillRoundRect(1, ly, 16, 16, border, border);
      g2.setColor(Color.decode("#F1CFB2"));
      g2.fillRoundRect(2, ly + 1, 14, 14, border, border);
    }
    g2.dispose();
  }

}
