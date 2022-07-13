package resto.componentes;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class TablaPersonalizada extends JTable {

  public TablaPersonalizada() {
    getTableHeader().setDefaultRenderer(new TablaPersonalizadaEncabezado());
    getTableHeader().setPreferredSize(new Dimension(0, 35));
    setDefaultRenderer(Object.class, new TablePersonalizadaCelda());
    setRowHeight(25);
    setBackground(Color.decode("#F0EFEF"));
    setSelectionBackground(Color.decode("#F1CFB2"));
    getTableHeader().setReorderingAllowed(false);
  }

  public void arreglarTabla(JScrollPane scroll) {
    scroll.setVerticalScrollBar(new BarraDeEscrollearPersonalizado());
    JPanel tapa = new JPanel();
    tapa.setBackground(Color.decode("#723F32"));
    scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, tapa);
    scroll.getViewport().setBackground(Color.decode("#F0EFEF"));
    scroll.setBorder(BorderFactory.createLineBorder(Color.decode("#723F32"), 2));
    scroll.getVerticalScrollBar().setUnitIncrement(20);
  }

  private class TablaPersonalizadaEncabezado extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
      Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

      com.setBackground(Color.decode("#723F32"));
      com.setForeground(Color.decode("#F1CFB2"));
      com.setFont(com.getFont().deriveFont(Font.BOLD, 12));

      return com;
    }

  }

  private class TablePersonalizadaCelda extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
      Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

      com.setForeground(Color.decode("#723F32"));

      if (isCellSelected(row, column)) {
        if (row % 2 == 0) {
          com.setBackground(Color.decode("#F1CFB2"));
        } else {
          com.setBackground(Color.decode("#EAC19E"));
        }
      } else {
        if (row % 2 == 0) {
          com.setBackground(Color.decode("#F0EFEF"));
        } else {
          com.setBackground(Color.decode("#E1E1E1"));
        }
      }

      setBorder(new EmptyBorder(0, 5, 0, 5));

      return com;
    }

  }
}
