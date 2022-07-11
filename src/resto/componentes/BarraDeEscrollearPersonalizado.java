package resto.componentes;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

public class BarraDeEscrollearPersonalizado extends JScrollBar {

  public BarraDeEscrollearPersonalizado() {
    setUI(new BarraDeEscrollearUI());
    setPreferredSize(new Dimension(8, 8));
    setForeground(Color.decode("#723F32"));
    setBackground(Color.decode("#F0EFEF"));
  }

}
