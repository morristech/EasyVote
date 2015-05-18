package de.tud.vcd.votedevice.onscreenkeyboard;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

import de.tud.vcd.votedevice.municipalElection.model.Candidate;
import de.tud.vcd.votedevice.municipalElection.model.Party;

/**
 * Stellt das Suchergebnis korrekt da. Die zur�ckgelieferten Objekte sind
 * Instanzen im Modell und k�nnen nicht einfach dargestellt werden. Daher
 * erfolgt hier die Definition wie die Darstellung zu erfolgen hat.
 * 
 * @author Roman J�ris <roman.joeris@googlemail.com>
 * 
 * @param <T>
 */
public class VCDSearchableRenderer<T> extends JLabel implements
		ListCellRenderer<T> {

	private static final long serialVersionUID = 1L;
	private static final Color HIGHLIGHT_COLOR = new Color(0, 0, 128);

	/**
	 * Erzeugt den Renderer und setzt den Hintergrund sichtbar.
	 */
	public VCDSearchableRenderer() {
		setOpaque(true);
	}

	/* (non-Javadoc)
	 * @see javax.swing.ListCellRenderer#getListCellRendererComponent(javax.swing.JList, java.lang.Object, int, boolean, boolean)
	 */
	public Component getListCellRendererComponent(JList<? extends T> list,
			T value, int index, boolean isSelected, boolean cellHasFocus) {
		if (value instanceof Candidate) {
			Candidate c = (Candidate) value;
			setText(c.getId() + ": " + c.getName() + ", " + c.getPrename()
					+ "(" + c.getParty() + ")");
		} else if (value instanceof Party) {
			Party p = (Party) value;
			setText(p.getName());
		} else {
		}

		if (isSelected) {
			setBackground(HIGHLIGHT_COLOR);
			setForeground(Color.white);
		} else {
			setBackground(Color.white);
			setForeground(Color.black);
		}
		return this;
	}
}