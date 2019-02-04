package pokemon.view;

import javax.swing.JFrame;
import controller.PokedexController;

public class PokedexFrame extends JFrame
{
	private PokedexController appController;
	private PokedexPanel appPanel;
	
	public PokedexFrame(PokedexController appController)
	{
		super();
		
		this.appController = appController;
		this.appPanel = new PokedexPanel(appController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(1000, 500);
		this.setTitle("Pokedex");
		this.setResizable(false);
		this.setVisible(true);
	}
}
