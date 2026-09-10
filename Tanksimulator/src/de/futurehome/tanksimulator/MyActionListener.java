package de.futurehome.tanksimulator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener {
	public TankSimulator f;

	public MyActionListener(TankSimulator f) {
		this.f = f;
	}

	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == f.btnBeenden)
			System.exit(0);

		if (obj == f.btnVerbrauchen) {
			double fuellstand = f.myTank.getFuellstand();
			double prozent = f.myTank.getProzent();
			fuellstand = fuellstand - 2;
			prozent = fuellstand / 200 * 100; 
			f.myTank.setFuellstand(fuellstand);
			f.myTank.setProzent(prozent);
			f.lblFuellstand.setText(""+fuellstand);
			f.lblProzent.setText("Prozent: "+prozent+ "%");
		}
		
		if (obj == f.btnZuruecksetzen) {
			double fuellstand = f.myTank.getFuellstand();
			double prozent = f.myTank.getProzent();
			fuellstand = 0;
			prozent = 0;
			f.myTank.setFuellstand(fuellstand);
			f.myTank.setProzent(prozent);
			
			f.lblFuellstand.setText(""+fuellstand);
			f.lblProzent.setText("Prozent: "+prozent+ "%");
		}

		if (obj == f.btnEinfuellen) {
			double fuellstand = f.myTank.getFuellstand();
			double prozent = f.myTank.getProzent();
			fuellstand = fuellstand + 5;
			prozent = fuellstand / 200 * 100;
			f.myTank.setFuellstand(fuellstand);
			f.myTank.setProzent(prozent);

			f.lblFuellstand.setText(""+fuellstand);
			f.lblProzent.setText("Prozent: "+prozent+ "%");

		}

	}
}